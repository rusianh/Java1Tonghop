import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (9:03:33 PM)
 * @version 1.0
 */
public class ThucPham extends SanPham {

	// 1. Attribute
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public ThucPham() {

	}
	
	
	/**
	 * @param ngaySanXuat
	 * @param ngayHetHan
	 */
//	public ThucPham(int ma, String tenSanPham, float giaNhap, float giaBan, float soLuong,
//			LocalDate ngaySanXuat, LocalDate ngayHetHan) {
//		super(ma,tenSanPham,giaNhap,giaBan,soLuong);
//		this.ngaySanXuat = ngaySanXuat;
//		this.ngayHetHan = ngayHetHan;
//	}


	// Get, set

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	// Business methods
	@Override
	public boolean nhapSanPham(Scanner scan) {
//		if (super.nhapSanPham(scan)) {
		boolean check = super.nhapSanPham(scan);
			System.out.print("Nhap ngay san xuat: ");
//			this.ngaySanXuat = ;
			String ngaySanXuat = scan.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.ngaySanXuat = LocalDate.parse(ngaySanXuat,formatter);

			System.out.print("Nhap ngay het han: ");
			int hanSuDung = Integer.parseInt(scan.nextLine());
			Period period = Period.ofDays(hanSuDung);
			this.ngayHetHan = this.ngaySanXuat.plus(period);
			return check;
		
//		return false;
	}

	public void hienThiSanPham() {
		super.hienThiSanPham();
		System.out.println("Ngay san xuat: " + this.ngaySanXuat + "\t Ngay het han: " + this.ngayHetHan);
		
	}
	
	@Override
	public SanPham getSanPhamCopy() {
		ThucPham thucPham = new ThucPham();
		getThucPhamCopy(thucPham);
		return thucPham;
	}
	
	public void getThucPhamCopy(ThucPham thucPhamCopy) {
		super.getSanPham(thucPhamCopy);
		thucPhamCopy.ngayHetHan = this.ngayHetHan;
		thucPhamCopy.ngaySanXuat = this.ngaySanXuat;
	}
}
