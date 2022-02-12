import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 22, 2021 (4:13:23 PM)
 * @version 1.0
 */
public class DanhSachPhongBan implements NhapXuat {
	//1. Attribute
	private ArrayList<PhongBan> listPhongBan;
	//2. Get, Set
	
	/**
	 * @return the listPhongBan
	 */
	public ArrayList<PhongBan> getListPhongBan() {
		return listPhongBan;
	}

	/**
	 * @param listPhongBan the listPhongBan to set
	 */
	public void setListPhongBan(ArrayList<PhongBan> listPhongBan) {
		this.listPhongBan = listPhongBan;
	}

	//3. Constructors
	/**
	 * 
	 */
	public DanhSachPhongBan() {
		this.listPhongBan = new ArrayList<PhongBan>();
	}
	//4. Input, Output
	//5. Business methods

	@Override
	public void xuat() {
		for(PhongBan pb: this.listPhongBan) {
			pb.xuat();
		}
	}
	
	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/PhongBan.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				PhongBan pb = new PhongBan(listInfo[0], listInfo[1]);
				// Them nhan su vao list
				this.listPhongBan.add(pb);

			}
			reader.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
