import java.time.LocalDate;
import java.util.Scanner;

import javax.security.auth.callback.Callback;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (9:02:36 PM)
 * @version 1.0
 */
public class SanPham {

	// 1. Attribute
	private int ma;
	private String tenSanPham;
	private float giaNhap;
	private float giaBan;
	private float soLuong;
	private TuongTacAdminCallBack tuongTacAdminCallBack;

	// 2. Constructor

	public SanPham() {

	}

	/**
	 * @param ma
	 * @param tenSanPham
	 * @param giaNhap
	 * @param giaBan
	 * @param soLuong
	 */
	public SanPham(int ma, String tenSanPham, float giaNhap, float giaBan, float soLuong) {
		super();
		this.ma = ma;
		this.tenSanPham = tenSanPham;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}

//	public SanPham(TuongTacAdminCallBack tuongTacAdmin) {
//		this.tuongTacAdminCallBack = tuongTacAdmin;
//	}
	// 3. Get, set

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public float getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(float giaNhap) {
		this.giaNhap = giaNhap;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public void setCallBack(TuongTacAdminCallBack tuongTacAdminCallBack) {
		this.tuongTacAdminCallBack = tuongTacAdminCallBack;
	}

	// 5. Business methods
	public boolean nhapSanPham(Scanner scan) {
		System.out.println("Nhap ma san pham");
		this.ma = Integer.parseInt(scan.nextLine());
		SanPham sp = tuongTacAdminCallBack.checkMaSanPhamTonTai(this.ma);
		if (sp != null) {
			System.out.println("San Pham " + sp.tenSanPham + " da ton tai moi nhap them so luong: ");
			float temp = Float.parseFloat(scan.nextLine());
			this.soLuong = temp;
//			sp.soLuong += temp;
			// Gan gia tri san pham
			this.tenSanPham = sp.getTenSanPham();
			this.giaBan = sp.getGiaBan();
			this.giaNhap = sp.getGiaNhap();
			return false;

		} else {
			System.out.println("Nhap ten san pham");
			this.tenSanPham = scan.nextLine();

			System.out.println("Gia Nhap San Pham");
			this.giaNhap = Float.parseFloat(scan.nextLine());

			System.out.println("Gia Ban San Pham");
			this.giaBan = Float.parseFloat(scan.nextLine());

			System.out.println("Nhap so luong");
			this.soLuong = Integer.parseInt(scan.nextLine());
			return true;
		}

	}

	public void hienThiSanPham() {
		System.out.println("================================================================================");
		System.out.println("Ma San Pham: " + this.ma + "\t Ten SanPham: " + this.tenSanPham + "\t Gia ban: "
				+ this.giaBan + "\t SoLuong: " + this.soLuong);

	}

	public SanPham getSanPhamCopy() {
//		SanPham sp = new SanPham(this.ma, this.tenSanPham, this.giaNhap, this.giaBan, this.giaBan);
		SanPham sp = new SanPham();
		getSanPham(sp);
		return sp;
	}

	public void getSanPham(SanPham sp) {
		sp.giaBan = this.giaBan;
		sp.giaNhap = this.giaNhap;
		sp.ma = this.ma;
		sp.soLuong = this.soLuong;
		sp.tenSanPham = this.tenSanPham;
	}

	public float getGiaTien() {
		return this.soLuong * this.giaBan;
	}
}
