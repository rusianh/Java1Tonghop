import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2] Quang ly nghiep vu lien quan den sach sach nhieu
 *       loai hang hoa
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (8:17:07 PM)
 * @version 1.0
 */
public class DanhSachHangHoa {
	// 1. Attribute
	private ArrayList<HangHoa> listHangHoaTong;
	private ArrayList<HangHoa> listHangHoaDaBan;
	private ArrayList<HangHoa> listHangHoaTonKho;
	private ArrayList<LichSuNhapKho> listLichSuNhapKho;
	private ArrayList<HangHoa> listGioHang;
	private ArrayList<HangHoa> listDoanhThuCaoNhat;
	private SieuThiCallBack sieuThiCallBack;

	// 2. Get, set methods

	public ArrayList<HangHoa> getListHangHoaTong() {
		return listHangHoaTong;
	}

	public void setListHangHoaTong(ArrayList<HangHoa> listHangHoaTong) {
		this.listHangHoaTong = listHangHoaTong;
	}

	public ArrayList<HangHoa> getListHangHoaDaBan() {
		return listHangHoaDaBan;
	}

	public void setListHangHoaDaBan(ArrayList<HangHoa> listHangHoaDaBan) {
		this.listHangHoaDaBan = listHangHoaDaBan;
	}

	public ArrayList<HangHoa> getListHangHoaTonKho() {
		return listHangHoaTonKho;
	}

	public void setListHangHoaTonKho(ArrayList<HangHoa> listHangHoaTonKho) {
		this.listHangHoaTonKho = listHangHoaTonKho;
	}

	public ArrayList<LichSuNhapKho> getListLichSuNhapKho() {
		return listLichSuNhapKho;
	}

	public void setListLichSuNhapKho(ArrayList<LichSuNhapKho> listLichSuNhapKho) {
		this.listLichSuNhapKho = listLichSuNhapKho;
	}

	public ArrayList<HangHoa> getListGioHang() {
		return listGioHang;
	}

	public void setListGioHang(ArrayList<HangHoa> listGioHang) {
		this.listGioHang = listGioHang;
	}

	// 3. Constructor
	public DanhSachHangHoa(SieuThiCallBack sieuThiCallBack) {
		this.listHangHoaTong = new ArrayList<HangHoa>();
		this.listHangHoaDaBan = new ArrayList<HangHoa>();
		this.listHangHoaTonKho = new ArrayList<HangHoa>();
		this.listLichSuNhapKho = new ArrayList<LichSuNhapKho>();
//		this.listGioHang = new ArrayList<HangHoa>();
		this.sieuThiCallBack = sieuThiCallBack;
	}

	// 4. Input, output methods
	public void xuat(ArrayList<HangHoa> list) {
		for (HangHoa hangHoa : list) {
			hangHoa.xuat();
		}
	}
	// 5. Business methods
	public void khoiTaoDanhSachGiohang() {
		this.listGioHang = new ArrayList<HangHoa>();
	}

	public HangHoa checkHangHoa(String ma, ArrayList<HangHoa> list) {
		for (HangHoa hangHoa : list) {
			if (hangHoa.getMaHangHoa().equalsIgnoreCase(ma)) {
				return hangHoa;
			}
		}
		return null;
	}

	public void themSoLuongHangHoa(float soLuongThem, ArrayList<HangHoa> list, String ma) {
		for (HangHoa hangHoa : list) {
			if (hangHoa.getMaHangHoa().equalsIgnoreCase(ma)) {
				hangHoa.themSoLuong(soLuongThem);
			} else {
				System.out.println("list hoac ma hangHoa khong ton tai !!!");
			}
		}
	}

	public void giamSoLuongHangHoa(float soLuongGiam, ArrayList<HangHoa> list, String ma) {
		for (HangHoa hangHoa : list) {
			if (hangHoa.getMaHangHoa().equalsIgnoreCase(ma)) {
				hangHoa.giamSoLuong(soLuongGiam);
			} else {
				System.out.println("list hoac ma hangHoa khong ton tai !!!");
			}
		}
	}

	public void hienThiDanhSachHangHoaTong() {
		for (HangHoa hangHoa : this.listHangHoaTong) {
			hangHoa.xuat();
		}
	}

	public void hienThiDanhSachLichSuNhapKho() {
		for (LichSuNhapKho lichSu : this.listLichSuNhapKho) {
			lichSu.xuat();
		}
	}

	public void tienHanhThanhToan() {
		// Duyet Danh Sach trong gio hang
		for (HangHoa hangHoa : this.listGioHang) {
			// Kiem Tra listHangHoaTong Co HangHoa trong gio hang khong
			if (kiemTraMaHangHoaTrongList(hangHoa.getMaHangHoa(), listHangHoaTong))
				;

//			if (this.listHangHoaTong.contains(hangHoa)) 
			if (kiemTraMaHangHoaTrongList(hangHoa.getMaHangHoa(), listHangHoaTong)) {
				// Tru soluong trong listTongHangHoa
				giamSoLuongHangHoa(hangHoa.getSoLuong(), this.listHangHoaTong, hangHoa.getMaHangHoa());

				// Them Soluong trong list Tong hang Hoa ban dc
				themSoLuongHangHoa(hangHoa.getSoLuong(), this.listHangHoaDaBan, hangHoa.getMaHangHoa());
				System.out.println("Thanh Toan Thanh Cong... Vui Long Thoat De Mua Tiep...");
			} else {
				System.out.println("Loi tienHanhThanhToan | DanhSachHangHoa.java");
			}
		}
	}

	public boolean kiemTraMaHangHoaTrongList(String maHangHoa, ArrayList<HangHoa> list) {
		for (HangHoa hangHoa : list) {
			if (hangHoa.getMaHangHoa().equalsIgnoreCase(maHangHoa)) {
				return true;
			}
		}
		return false;
	}

	public void thongKeTong() {

	}

	public void thongKeSoLuongHangHoaDaBan() {
		for (HangHoa hangHoa : this.listHangHoaDaBan) {
			hangHoa.xuat();
		}
	}

	public float tinhDoanhThu() {
		float doanhThu = 0f;
		for (HangHoa hangHoa : this.listHangHoaDaBan) {
			doanhThu += (hangHoa.getGiaBan() * hangHoa.getSoLuong());
		}
		return doanhThu;
	}

	public float tinhLoiNhuan() {
		float loiNhuan = 0f;
		for (HangHoa hangHoa : this.listHangHoaDaBan) {
			loiNhuan += ((hangHoa.getGiaBan() - hangHoa.getGiaNhap()) * hangHoa.getSoLuong());
		}
		return loiNhuan;
	}

	public void thongKeHangHetHan() {

	}

	public void creatDummyData() {
		try {
			FileReader reader = new FileReader("src/HangHoaTong.txt");
			BufferedReader bufferedReder = new BufferedReader(reader);

			String line;

			while ((line = bufferedReder.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				HangHoa hangHoa;

				if (listInfo[listInfo.length - 1].equalsIgnoreCase("1")) {
					hangHoa = new HangHoa();

					// Set Du Lieu
					hangHoa.setTenHangHoa(listInfo[0]);
					hangHoa.setMaHangHoa(listInfo[1]);
					hangHoa.setNhaPhanPhoi(listInfo[2]);
					hangHoa.setGiaBan(Float.parseFloat(listInfo[3]));
					hangHoa.setGiaNhap(Float.parseFloat(listInfo[4]));
					hangHoa.setSoLuong(Float.parseFloat(listInfo[5]));
					this.listHangHoaTong.add(hangHoa);

					// Them du lieu vao ds da ban
					HangHoa taoMoiHangHoaDaBan = new HangHoa(hangHoa.getTenHangHoa(), hangHoa.getMaHangHoa(),
							hangHoa.getNhaPhanPhoi(), hangHoa.getGiaNhap(), hangHoa.getGiaBan(), 0.0f);
					this.listHangHoaDaBan.add(taoMoiHangHoaDaBan);

					// Tao log nhap kho
					LichSuNhapKho log = new LichSuNhapKho(hangHoa.getMaHangHoa(), hangHoa.getTenHangHoa(),
							hangHoa.getSoLuong(), sieuThiCallBack.getNgayHienTai());

				} else if ((listInfo[listInfo.length - 1]).equalsIgnoreCase("2")) {
					hangHoa = new ThucPhamDaDongGoi();
				} else if ((listInfo[listInfo.length - 1]).equalsIgnoreCase("3")) {
					hangHoa = new ThucPhamChuaDongGoi();
				} else {
					hangHoa = new DoDienTu();
				}
			}
			System.out.println("TaoDuLieu Thanh Cong");
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
