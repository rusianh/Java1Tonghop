import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (6:20:45 PM)
 * @version 1.0
 */
public class ThucPhamChuaDongGoi extends ThucPham {
	//1. Attribute
	private float khoiLuongTinhTien;
	//2. Get, set methods
	
	public float getKhoiLuongTinhTien() {
		return khoiLuongTinhTien;
	}

	public void setKhoiLuongTinhTien(float khoiLuongTinhTien) {
		this.khoiLuongTinhTien = khoiLuongTinhTien;
	}

	//3. Constructor
	public ThucPhamChuaDongGoi() {
		
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
	public ThucPhamChuaDongGoi(String tenHangHoa, String maHangHoa, String nhaPhanPhoi, float giaNhap, float giaBan, float soluong,
			LocalDate ngaySanXuat, LocalDate hanSuDung) {
		super(tenHangHoa, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, soluong, ngaySanXuat, hanSuDung);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param tenHangHoa
	 * @param maHangHoa
	 * @param nhaPhanPhoi
	 * @param giaNhap
	 * @param giaBan
	 * @param ngaySanXuat
	 * @param hanSuDung
	 * @param khoiLuongTinhTien
	 */
	public ThucPhamChuaDongGoi(String tenHangHoa, String maHangHoa, String nhaPhanPhoi, float giaNhap, float giaBan, float soluong,
			LocalDate ngaySanXuat, LocalDate hanSuDung, float khoiLuongTinhTien) {
		super(tenHangHoa, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, soluong, ngaySanXuat, hanSuDung);
		this.khoiLuongTinhTien = khoiLuongTinhTien;
	}
	//4. Input, output methods
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Khoi luong tinh tien(/kg): " + this.khoiLuongTinhTien);
	}
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("\t Moi Nhap Khoi Luong Tinh Tien: ");
		this.khoiLuongTinhTien =  Float.parseFloat(scan.nextLine());
	}
	//5. Business methods
	
	
}
