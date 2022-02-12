import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLyHocVien]: Quan ly nghiep vu cho Customer
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (4:07:12 PM)
 * @version 1.0
 */
public class Customer extends Person {
	//1. Attribute
	private String tenCongTy;
	private float triGiaHoaDon;
	private String danhGia;
	//2. Get, set methods
	
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public float getTriGiaHoaDon() {
		return triGiaHoaDon;
	}

	public void setTriGiaHoaDon(float triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	//3. Constructor
	public Customer() {
		
	}
	
	/**
	 * @param diaChi
	 * @param hoTen
	 * @param ma
	 * @param email
	 */
	public Customer(String diaChi, String hoTen, String ma, String email, String tenCongTy, float triGiaHoaDon, String danhGia) {
		super(diaChi, hoTen, ma, email);
		this.tenCongTy = tenCongTy;
		this.triGiaHoaDon = triGiaHoaDon;
		this.danhGia = danhGia;
		
	}
	//4. Input, outputmethods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Ten cong ty: ");
		this.tenCongTy = scan.nextLine();
		System.out.println("Tri gia hoa don: ");
		this.triGiaHoaDon = Float.parseFloat(scan.nextLine());
		System.out.println("Danh gia: ");
		this.tenCongTy = scan.nextLine();
		
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t TenCong ty: "+ this.tenCongTy
							+ "\t Tri Gia Hoa Don" + this.triGiaHoaDon
							+ "\t Danh Gia: " + this.danhGia);
	}
	//5. Business methods
	/**
	 * 
	 */

}
