import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 26, 2021 (6:56:28 PM)
 * @version 1.0
 */
public class LichSuNhapKho implements XuatNhap {
	// 1. Attribute
	private String maHangHoa;
	private String tenHangHoa;
	private float soLuong;
	private LocalDate ngayNhap;

	// 2. Get, set methods
	
	public String getMaHangHoa() {
		return maHangHoa;
	}


	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
	}


	public String getTenHangHoa() {
		return tenHangHoa;
	}


	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}


	public float getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}


	public LocalDate getNgayNhap() {
		return ngayNhap;
	}


	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}


	// 3. Constructor
	public LichSuNhapKho() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param maHangHoa
	 * @param tenHangHoa
	 * @param soLuong
	 * @param ngayNhap
	 */
	public LichSuNhapKho(String maHangHoa, String tenHangHoa, float soLuong, LocalDate ngayNhap) {
		this.maHangHoa = maHangHoa;
		this.tenHangHoa = tenHangHoa;
		this.soLuong = soLuong;
		this.ngayNhap = ngayNhap;
	}


	// 4. Input, output methods
	@Override
	public void xuat() {
		System.out.println(" Ma Hang hoa: " + this.maHangHoa + "\t Ten Hang Hoa: " + this.tenHangHoa + "\t So luong: "
				+ this.soLuong + " \t Ngay Nhap: " + this.ngayNhap);
	}

	@Override
	public void nhap(Scanner scan) {
		

	}

	// 5. Business methods

}
