import java.util.ArrayList;

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 22, 2021 (4:16:39 AM)
 * @version 1.0
 */
public class PhongBan implements NhapXuat {
	// 1. Attribute
	String maPhongBan;
	String tenPhongBan;
	TruongPhong truongPhong;
	private ArrayList<NhanVienThuong> dsNhanVien;

	// 2. Get, Set

	/**
	 * @return the maPhongBan
	 */
	public String getMaPhongBan() {
		return maPhongBan;
	}

	/**
	 * @param maPhongBan the maPhongBan to set
	 */
	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	/**
	 * @return the tenPhongBan
	 */
	public String getTenPhongBan() {
		return tenPhongBan;
	}

	/**
	 * @param tenPhongBan the tenPhongBan to set
	 */
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	/**
	 * @return the truongPhong
	 */
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	/**
	 * @param truongPhong the truongPhong to set
	 */
	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	/**
	 * @return the dsNhanVien
	 */
	public ArrayList<NhanVienThuong> getDsNhanVien() {
		return dsNhanVien;
	}

	/**
	 * @param dsNhanVien the dsNhanVien to set
	 */
	public void setDsNhanVien(ArrayList<NhanVienThuong> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}

	// 3. Constructors
	public PhongBan() {
		this.truongPhong = null;
		this.dsNhanVien = new ArrayList<NhanVienThuong>();
	}
	
	
	/**
	 * @param maPhongBan
	 * @param tenPhongBan
	 */
	public PhongBan(String maPhongBan, String tenPhongBan) {
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
		this.dsNhanVien = new ArrayList<NhanVienThuong>();
	}

	// 4. Input, Output
	// 5. Business methods

	@Override
	public void xuat() {
		System.out.println("***** Day la thong tin phong ban *****");
		System.out.print("Ten: " + this.tenPhongBan + "Ma: " + this.maPhongBan);
		if (this.truongPhong != null) {
			System.out.println("Day la thong tin truong phong: ");
			this.truongPhong.xuat();
		} else {
			System.out.println("Phong ban chua co Truong Phong");
		}
		for (NhanVienThuong nvt : this.dsNhanVien) {
			nvt.xuat();
		}
		System.out.println("========End Thong Tin Phong Ban========");

	}

}
