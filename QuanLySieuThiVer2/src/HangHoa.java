import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2] Quan ly cac nghiep vu cua hang hoa
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (5:19:18 PM)
 * @version 1.0
 */
public class HangHoa implements XuatNhap  {
	//1. Attribute
	private String tenHangHoa;
	private String maHangHoa;
	private String nhaPhanPhoi;
	private float giaNhap;
	private float giaBan;
	private float soLuong;
	//2. Get, set methods
	
	public String getTenHangHoa() {
		return tenHangHoa;
	}

	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}

	public String getMaHangHoa() {
		return maHangHoa;
	}

	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
	}

	public String getNhaPhanPhoi() {
		return nhaPhanPhoi;
	}

	public void setNhaPhanPhoi(String nhaPhanPhoi) {
		this.nhaPhanPhoi = nhaPhanPhoi;
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

	//3. Constructor
	public HangHoa() {
		
	}
	
	/**
	 * @param tenHangHoa
	 * @param maHangHoa
	 * @param nhaPhanPhoi
	 * @param giaNhap
	 * @param giaBan
	 */
	public HangHoa(String tenHangHoa, String maHangHoa, String nhaPhanPhoi, float giaNhap, float giaBan, float soluong) {
		super();
		this.tenHangHoa = tenHangHoa;
		this.maHangHoa = maHangHoa;
		this.nhaPhanPhoi = nhaPhanPhoi;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.soLuong = soluong;
	}

	//4. Input, output methods
	@Override
	public void xuat() {
		System.out.print("\nMa: "+ this.maHangHoa + "\t TenHangHoa: " + this.tenHangHoa + "\t NhaPhanPhoi: " + this.nhaPhanPhoi
				+ "\t Gia nhap: " + this.giaNhap + "\t Gia ban" + this.giaBan + "\t So Luong: " + this.soLuong);
	}
	
	@Override
	public void nhap(Scanner scan) {
		
		System.out.print("Nhap Ma: ");
		this.maHangHoa = scan.nextLine();
		
		System.out.print("Nhap Ten HangHoa: ");
		this.tenHangHoa = scan.nextLine();
		
		System.out.print("Nhap Nha Phan Phoi: ");
		this.nhaPhanPhoi = scan.nextLine();
		
		System.out.print("Nhap Gia Nhap: ");
		this.giaNhap = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhap Gia Ban: "); 
		this.giaBan = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhap So Luong: "); 
		this.soLuong = Float.parseFloat(scan.nextLine());
		
	}
	//5. Business methods
	
	public void themSoLuong(float soLuong) {
		float soLuongSauKhiThem = soLuong + this.getSoLuong ();
		//Gan so luong moi:
		this.setSoLuong(soLuongSauKhiThem);
	}
	
	public void giamSoLuong(float soLuong) {
		float soLuongSauKhiGiam = this.getSoLuong() - soLuong ;
		//Gan so luong moi:
		this.setSoLuong(soLuongSauKhiGiam);
	}

	

}
