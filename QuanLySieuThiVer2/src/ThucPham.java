import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2] Quan ly cac nghiep vu lien quan den ThucPham
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (6:01:48 PM)
 * @version 1.0
 */
public class ThucPham extends HangHoa {
	//1. Attribute
	private LocalDate 	ngaySanXuat;
	private LocalDate 	hanSuDung;
	//2. Get, set methods
	
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getHanSuDung() {
		return hanSuDung;
	}

	public void setHanSuDung(LocalDate hanSuDung) {
		this.hanSuDung = hanSuDung;
	}

	//3. Constructor
	public ThucPham() {
		
	}
	/**
	 * @param tenHangHoa
	 * @param maHangHoa
	 * @param nhaPhanPhoi
	 * @param giaNhap
	 * @param giaBan
	 * @param ngaySanXuat
	 * @param hanSuDung
	 */
	public ThucPham(String tenHangHoa, String maHangHoa, String nhaPhanPhoi, float giaNhap, float giaBan, float soluong,
			LocalDate ngaySanXuat, LocalDate hanSuDung) {
		super(tenHangHoa, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, soluong);
		this.ngaySanXuat = ngaySanXuat;
		this.hanSuDung = hanSuDung;
	}
	
	
	//4. Input, output methods
	@Override
	public void xuat() {
		super.xuat();
		System.out.print("\t Ngay San Xuat: " + this.ngaySanXuat + "\t HanSuDung: " + this.hanSuDung);
	}
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap ngay San Xuat: ");
		this.ngaySanXuat = LocalDate.now();
		
		System.out.print("Nhap han su dung (may ngay): ");
		int hanSuDung = Integer.parseInt(scan.nextLine());
		Period period = Period.ofDays(hanSuDung);
		this.hanSuDung = this.ngaySanXuat.plus(period);
		
	}
	
	//5. Business methods

}
