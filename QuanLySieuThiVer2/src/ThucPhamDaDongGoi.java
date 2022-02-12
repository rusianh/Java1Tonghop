import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2] Quan ly cac nghiep vu lien quan den Thuc Pham Da
 *       Dong Goi
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (6:15:41 PM)
 * @version 1.0
 */
public class ThucPhamDaDongGoi extends ThucPham {
	// 1. Attribute
	private float khoiLuongDongGoi;
	private String quyCachDongGoi;
	// 2. Get, set methods

	public float getKhoiLuongDongGoi() {
		return khoiLuongDongGoi;
	}

	public void setKhoiLuongDongGoi(float khoiLuongDongGoi) {
		this.khoiLuongDongGoi = khoiLuongDongGoi;
	}

	public String getQuyCachDongGoi() {
		return quyCachDongGoi;
	}

	public void setQuyCachDongGoi(String quyCachDongGoi) {
		this.quyCachDongGoi = quyCachDongGoi;
	}

	// 3. Constructor
	public ThucPhamDaDongGoi() {

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
	public ThucPhamDaDongGoi(String tenHangHoa, String maHangHoa, String nhaPhanPhoi, float giaNhap, float giaBan, float soluong,
			LocalDate ngaySanXuat, LocalDate hanSuDung) {
		super(tenHangHoa, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, soluong, ngaySanXuat, hanSuDung);

	}

	/**
	 * @param tenHangHoa
	 * @param maHangHoa
	 * @param nhaPhanPhoi
	 * @param giaNhap
	 * @param giaBan
	 * @param ngaySanXuat
	 * @param hanSuDung
	 * @param khoiLuongDongGoi
	 * @param quyCachDongGoi
	 */
	public ThucPhamDaDongGoi(String tenHangHoa, String maHangHoa, String nhaPhanPhoi, float giaNhap, float giaBan, float soluong,
			LocalDate ngaySanXuat, LocalDate hanSuDung, float khoiLuongDongGoi, String quyCachDongGoi) {
		super(tenHangHoa, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, soluong, ngaySanXuat, hanSuDung);
		this.khoiLuongDongGoi = khoiLuongDongGoi;
		this.quyCachDongGoi = quyCachDongGoi;
	}

	// 4. Input, output methods
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(
				"\t Khoi Luong Dong Goi: " + this.khoiLuongDongGoi + "\t Quy Cach Dong Goi: " + this.quyCachDongGoi);

	}
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap Khoi Luong Dong Goi: ");
		this.khoiLuongDongGoi = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap quy Cach Dong Goi: ");
		this.quyCachDongGoi = scan.nextLine();
	}
	// 5. Business methods

}
