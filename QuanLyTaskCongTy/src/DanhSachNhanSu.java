import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 22, 2021 (4:10:18 PM)
 * @version 1.0
 */
public class DanhSachNhanSu implements NhapXuat {
	// 1. Attribute
	private ArrayList<NhanSu> listNhanSu;
	// 2. Get, Set

	/**
	 * @return the listNhanSu
	 */
	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	/**
	 * @param listNhanSu the listNhanSu to set
	 */
	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

	// 3. Constructors
	/**
	 * 
	 */
	public DanhSachNhanSu() {
		this.listNhanSu = new ArrayList<NhanSu>();
	}
	// 4. Input, Output
	// 5. Business methods

	@Override
	public void xuat() {
		for (NhanSu ns : this.listNhanSu) {
			ns.xuat();
		}

	}

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/DSNV.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				NhanSu ns;
				// Kiem tra truong phong hay nhan vien thuong
				if (listInfo[listInfo.length - 1].equalsIgnoreCase("true")) {
					ns = new TruongPhong();
				} else {
					ns = new NhanVienThuong();
				}
				// Tao du lieu cho moi nhan su
				ns.setMaNV(listInfo[0]);
				ns.setTenNV(listInfo[1]);
				ns.setNamSinh(listInfo[2]);
				ns.setEmail(listInfo[3]);
				ns.setSoDienThoai(listInfo[4]);
				// Them nhan su vao list
				this.listNhanSu.add(ns);

			}
			reader.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
