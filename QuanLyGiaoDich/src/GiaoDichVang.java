import java.util.Scanner;

/**
 * @note Quan ly cac giao dich vang
 * @author Cris Vu
 * @since 17/07/21
 * @version 1.0
 */
public class GiaoDichVang extends GiaoDich {
	//1. Attribute
	private String loaiVang;
	//2. Get, set methods
	
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	//3. Constructor
	public GiaoDichVang() {
		// TODO Auto-generated constructor stub
	}
	
	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiVang = loaiVang;
	}
	//4. Input, output methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap loai vang");
		this.loaiVang = scan.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loai vang" + this.loaiVang + "\t Thanh tien" + this.thanhTien);
	}
	//5. Business methods
	@Override
	public void tinhTien() {
		this.thanhTien = this.donGia * this.soLuong;	
	}
	

}

//1. Attribute
//2. Get, set methods
//3. Constructor
//4. Input, output methods
//5. Business methods