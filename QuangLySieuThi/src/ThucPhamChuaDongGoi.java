import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (9:14:05 PM)
 * @version 1.0
 */
public class ThucPhamChuaDongGoi extends ThucPham {
	//Attribute
	private float khoiLuongTinhTien; //kg
	
	/**
	 * 
	 */
	public ThucPhamChuaDongGoi() {
		// TODO Auto-generated constructor stub
	}
	// Get set

	public float getKhoiLuongTinhTien() {
		return khoiLuongTinhTien;
	}

	public void setKhoiLuongTinhTien(float khoiLuongTinhTien) {
		this.khoiLuongTinhTien = khoiLuongTinhTien;
	}
	
	//Business methods
	public boolean nhapSanPham(Scanner scan) {
		if(super.nhapSanPham(scan)) {
			System.out.println("Nhap khoi luong tinh tien (Kg)");
			this.khoiLuongTinhTien = Float.parseFloat(scan.nextLine());
			return true;
		} 
		return false;
	}
	
	@Override
	public SanPham getSanPhamCopy() {
		ThucPhamChuaDongGoi tpcdg = new ThucPhamChuaDongGoi();
		super.getThucPhamCopy(tpcdg);
		return tpcdg;
	}
	
	@Override
	public float getGiaTien() {
		return this.getSoLuong()/this.khoiLuongTinhTien * this.getGiaBan();
	}
}
