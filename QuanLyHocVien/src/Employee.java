import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLyHocVien] Xu ly nghiep vu cho lop employee
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (3:54:08 PM)
 * @version 1.0
 */
public class Employee extends Person {
	//1. Attribute
	private float soNgayLamViec;
	private int   luongTheoNgay;
	//2. Get, set methods
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public float getSoNgayLamVien() {
		return soNgayLamViec;
	}
	
	public void setSoNgayLamVien(float soNgayLamVien) {
		this.soNgayLamViec = soNgayLamVien;
	}
	
	public int getLuongTheoNgay() {
		return luongTheoNgay;
	}
	
	public void setLuongTheoNgay(int luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}
	
	//3. Constructor
	/**
	 * @param diaChi
	 * @param hoTen
	 * @param ma
	 * @param email
	 */
	public Employee(String diaChi, String hoTen, String ma, String email, int luongTheoNgay, float soNgayLamViec) {
		super(diaChi, hoTen, ma, email);
		this.soNgayLamViec = soNgayLamViec;
		this.luongTheoNgay = luongTheoNgay;
	}
	//4. Input, outputmethods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap luong theo ngay: ");
		this.luongTheoNgay = Integer.parseInt(scan.nextLine());
		System.out.print("So ngay lam viec: ");
		this.luongTheoNgay = Integer.parseInt(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Luong/ngay: "+ this.luongTheoNgay + "\t So ngay lam viec"+ this.soNgayLamViec);
	}
	//5. Business methods

}
