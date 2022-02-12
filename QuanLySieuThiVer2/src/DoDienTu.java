import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2] Quan Ly Nghiep Vu lien quan den do dien tu
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (6:33:50 PM)
 * @version 1.0
 */
public class DoDienTu extends HangHoa implements XuatNhap {
	//1. Attribute
	private LocalDate thoiGianBaoHanh;
	
	//2. Get, set methods
	public LocalDate getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(LocalDate thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	//3. Constructor
	public DoDienTu() {
		
	}
	/**
	 * @param tenHangHoa
	 * @param maHangHoa
	 * @param nhaPhanPhoi
	 * @param giaNhap
	 * @param giaBan
	 */
	public DoDienTu(String tenHangHoa, String maHangHoa, String nhaPhanPhoi, float giaNhap, float giaBan, float soluong) {
		super(tenHangHoa, maHangHoa, nhaPhanPhoi, giaNhap, giaBan, soluong);
		// TODO Auto-generated constructor stub
	}
	//4. Input, output methods
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Thoi Gian Bao Hanh: " + this.thoiGianBaoHanh);
	} 
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap Thoi Gian Bao Hanh: ");
		this.thoiGianBaoHanh = LocalDate.now();
	}
	//5. Business methods

}
