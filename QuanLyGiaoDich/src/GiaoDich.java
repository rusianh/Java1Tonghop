import java.util.Scanner;

/**
 * @Note Tao lop superclass de luu tru va xu ly lien quan giao dich
 * @author Cris Vu
 * @since 17/7/21
 * @version
 */
public class GiaoDich {
	//1. Attribute
	protected int maGiaoDich;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected int soLuong;
	protected float thanhTien;
	//2. Get, set methods
	
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public float getThanhTien() {
		return thanhTien;
	}

	//3. Constructor
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maGiaoDich
	 * @param ngay
	 * @param thang
	 * @param nam
	 * @param donGia
	 * @param soLuong
	 */
	public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	//4. Input, output
	public void nhap(Scanner scan) {
		System.out.print("NHAP MA: ");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());
		System.out.print("NHAP NGAY: ");
		this.ngay = Integer.parseInt(scan.nextLine());
		System.out.print("NHAP THANG: ");
		this.thang = Integer.parseInt(scan.nextLine());
		System.out.print("NHAP NAM: ");
		this.nam = Integer.parseInt(scan.nextLine());
		
		System.out.print("NHAP DON GIA: ");
		this.donGia = Float.parseFloat(scan.nextLine());
		
		System.out.print("NHAP SO LUONG: ");
		this.soLuong = Integer.parseInt(scan.nextLine());
	}
	
	public void xuat() {
		System.out.println("Ma: "+this.maGiaoDich +"\t Ngay/thang/nam"+this.ngay+ "/" +this.ngay +"/t"+this.nam
								+ "\t So luong: "+ this.soLuong +"\t Don gia: "+ this.donGia);
	}
	//5. Business methods
	public void tinhTien() {
		this.thanhTien = 0;
	}
}
