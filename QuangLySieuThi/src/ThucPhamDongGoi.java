import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (9:11:31 PM)
 * @version 1.0
 */
public class ThucPhamDongGoi extends ThucPham {
	//1. Attribute
	private float khoiLuongDongGoi; //kg
	private String quyCachDongGoi;  // goi hop lo chai
	
	/**
	 * 
	 */
	public ThucPhamDongGoi() {
		
	}
	
	
//	/**
//	 * @param khoiLuongDongGoi
//	 * @param quyCachDongGoi
//	 */
//	public ThucPhamDongGoi(
//			float khoiLuongDongGoi, String quyCachDongGoi) {
//		super();
//		this.khoiLuongDongGoi = khoiLuongDongGoi;
//		this.quyCachDongGoi = quyCachDongGoi;
//	}


	// Get set

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
	
	// Business methods
	public boolean nhapSanPham(Scanner scan) {
		if(super.nhapSanPham(scan)) {
			System.out.print("Moi nhap khoi luong dong goi: ");
			this.khoiLuongDongGoi = Float.parseFloat(scan.nextLine());
			System.out.print("Moi nhap quy cach dong goi: ");
			this.quyCachDongGoi = scan.nextLine();
			return true;
		}
		return false;
	}
}
