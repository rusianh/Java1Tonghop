import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 22, 2021 (3:51:10 PM)
 * @version 1.0
 */
public class CongTy implements NhapXuat {
	// 1. Attribute
	private String tenCongTy;
	private String maSoThue;
	private float tongLuong;
	private DanhSachNhanSu objDSNSu;
	private DanhSachPhongBan objDSPhongBan;
	private DanhSachTask objDSTask;
	private ArrayList<TruongPhong> dsTruongPhong;
	// 2. Get, Set

	/**
	 * @return the tenCongTy
	 */
	public String getTenCongTy() {
		return tenCongTy;
	}

	/**
	 * @param tenCongTy the tenCongTy to set
	 */
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	/**
	 * @return the maSoThue
	 */
	public String getMaSoThue() {
		return maSoThue;
	}

	/**
	 * @param maSoThue the maSoThue to set
	 */
	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	/**
	 * @return the objDSNSu
	 */
	public DanhSachNhanSu getObjDSNSu() {
		return objDSNSu;
	}

	/**
	 * @param objDSNSu the objDSNSu to set
	 */
	public void setObjDSNSu(DanhSachNhanSu objDSNSu) {
		this.objDSNSu = objDSNSu;
	}

	/**
	 * @return the objDSPhongBan
	 */
	public DanhSachPhongBan getObjDSPhongBan() {
		return objDSPhongBan;
	}

	/**
	 * @param objDSPhongBan the objDSPhongBan to set
	 */
	public void setObjDSPhongBan(DanhSachPhongBan objDSPhongBan) {
		this.objDSPhongBan = objDSPhongBan;
	}

	/**
	 * @return the objDSTask
	 */
	public DanhSachTask getObjDSTask() {
		return objDSTask;
	}

	/**
	 * @param objDSTask the objDSTask to set
	 */
	public void setObjDSTask(DanhSachTask objDSTask) {
		this.objDSTask = objDSTask;
	}

	/**
	 * @return the tongLuong
	 */
	public float getTongLuong() {
		return tongLuong;
	}

	// 3. Constructors
	/**
	 * 
	 */
	public CongTy() {
//		this.objDSNSu = new DanhSachNhanSu();
//		this.objDSPhongBan = new DanhSachPhongBan();
//		this.objDSTask = new DanhSachTask();
		dsTruongPhong = new ArrayList<TruongPhong>();

	}

	// 4. Input, Output
	@Override
	public void xuat() {

	}

	public void xuatDSNS() {
		this.objDSNSu.xuat();
	}

	public void xuatDSTask() {
		this.objDSTask.xuat();
	}

	public void xuatDSPhongBan() {
		this.objDSPhongBan.xuat();
	}
	// 5. Business methods

	public void taoDuLieu() {
		this.objDSNSu = new DanhSachNhanSu();
		this.objDSNSu.taoDuLieu();

		this.objDSPhongBan = new DanhSachPhongBan();
		this.objDSPhongBan.taoDuLieu();

		this.objDSTask = new DanhSachTask();
		this.objDSTask.taoDuLieu();
		
		this.layDanhSachTruongPhong();
	}

	public void phanBoNhanVien() {
		// Duyet danh sach nhan vien

		// Hoi muon phan bo hay khong,
		// 1: Phan bo => Liet ke danh sach phong ban
		// chon nhap ma phong ban
		// 2: Di tiep khong phan bo
		//
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : this.objDSNSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				boolean flag = true;
				do {
					System.out.println("Dang phan bo nhan vien: ");
					ns.xuatTenVaMa();
					System.out.println("Chon 1 de phan bo. 2. De di tiep");
					int chon = Integer.parseInt(scan.nextLine());
					switch (chon) {
					case 1:
						System.out.println("Day la danh sach phong ban: ");
						xuatDSPhongBan();
						System.out.println("Moi chon: ");
						String maPhong = scan.nextLine();
						PhongBan pb = layPhongBan(maPhong);
						//Lay ma phong ban tuong ung voi ma nguoi dung nhap
						if(pb!=null) {
							// Gan ma phong ban cho nhan su nay
							ns.setMaPhongBan(maPhong);
							// Them ns nay vao danh sach nhan su cua phong ban
							pb.getDsNhanVien().add(((NhanVienThuong)ns));
						}
						flag = false;
						break;
					case 2:
						flag = false;
						break;
					default:
						System.out.println("Chi duoc nhap 1 hoac 2!!!");
					}
				} while (flag);
			}
		}
	}

	private PhongBan layPhongBan(String maPhong) {
		for(PhongBan pb: this.objDSPhongBan.getListPhongBan()) {
			if(pb.getMaPhongBan().equalsIgnoreCase(maPhong)) {
				return pb;
			}
		}
		return null;
	}
	
	public void layDanhSachTruongPhong() {
		for(NhanSu ns: this.objDSNSu.getListNhanSu()) {
			if(ns instanceof TruongPhong) {
				this.dsTruongPhong.add((TruongPhong)ns);
			}
		}
	}
	
	public void chiDinhTruongPhong() {
		// Duyet danh sach truong phong
		// Hoi muon phan bo hay khong,
		// 1: Phan bo => Liet ke danh sach phong ban
		// chon nhap ma phong ban
		// 2: Di tiep khong phan bo
		//
		Scanner scan = new Scanner(System.in);
		for (TruongPhong tp : this.dsTruongPhong) {
				boolean flag = true;
				do {
					System.out.println("Dang chi dinh cho truong phong: ");
					tp.xuatTenVaMa();
					System.out.println("Chon 1 de chi dinh 2. De di tiep");
					int chon = Integer.parseInt(scan.nextLine());
					switch (chon) {
					case 1:
						System.out.println("Day la danh sach phong ban: ");
						xuatDSPhongBan();
						System.out.println("Moi chon: ");
						String maPhong = scan.nextLine();
						PhongBan pb = layPhongBan(maPhong);
						//Lay ma phong ban tuong ung voi ma nguoi dung nhap
						if(pb!=null) {
							// Gan ma phong ban cho nhan su nay
							tp.setMaPhongBan(maPhong);
							// Chi dinh truong phong ve phong ban
							pb.setTruongPhong(tp);
						}
						flag = false;
						break;
					case 2:
						flag = false;
						break;
					default:
						System.out.println("Chi duoc nhap 1 hoac 2!!!");
					}
				} while (flag);
		}
	}
	
	public void phanTask() {
		// Duyet danh sach task
		// Cho phep nguoi dung nhap nhan su theo ma, nhap cho den khi nao co dung 1 nhan su
		// Phan task hoac cho chon lai hoac bo qua task
	}
}
