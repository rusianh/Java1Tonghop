import java.util.Scanner;

/**
 * @note Quang ly cac nghiep vu lien quan den tien te
 * @author CrisVu
 * @since 18/7/21
 * @version 1.0
 */
public class GiaoDichTienTe extends GiaoDich {
	//1. Attribute
	private float tiGia;
	private int loaiTienTe;
	//2. Get, set methods
	public float getTiGia() {
		return tiGia;
	}

	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}

	public int getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(int loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	//3. Constructor
	public GiaoDichTienTe() {
		// TODO Auto-generated constructor stub
	}
	
	
	public GiaoDichTienTe(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong,
						float tiGia, int loaiTienTe) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiTienTe = loaiTienTe;
		this.tiGia = tiGia;
		// TODO Auto-generated constructor stub
	}
	//4. Input, output methods
	@Override 
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap ti gia: ");
		this.tiGia = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap loai tien te (1.VND, 2.USD, 3.EURO)");
		this.loaiTienTe = Integer.parseInt(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		String temp = "";
		if(this.loaiTienTe ==1) {
			temp = "VND";
		} else if(this.loaiTienTe==2) {
			temp = "USD";
		} else {
			temp = "EURO";
		}
		super.xuat();
		System.out.println("\t Tien: " + temp + "\t Ti gia: "+ this.tiGia + "\t Thanh tien: " + this.thanhTien );
	}
	//5. Business methods
	public void tinhTien() {
		if(this.loaiTienTe==1) {
			this.thanhTien = this.soLuong * this.donGia;
		} else {
			this.thanhTien = this.soLuong * this.donGia * this.tiGia;
		}
	}
}
