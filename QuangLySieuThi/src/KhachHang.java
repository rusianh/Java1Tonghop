import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 9, 2021 (9:18:37 PM)
 * @version 1.0
 */
public class KhachHang {
	//Attribute
	private TuongTacKhachHangCallBack khachHangCallBack;
	private ArrayList<SanPham> listGioHang = new ArrayList<SanPham>();
	//get set
	
	
	/**
	 * 
	 * 
	 */
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	
	public KhachHang(TuongTacKhachHangCallBack khCallBack) {
		this.khachHangCallBack = khCallBack;
	}
	
	//Bussines methods
	public void menuKhachhang(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("\n================================================");
//			System.out.println("|Bay Gio La : " + this.ngayHienTai);
			System.out.println("|1. Them Hang Hoa                              |");
			System.out.println("|2. Can Hang Hoa                               |");
			System.out.println("|3. Thanh Toan                                 |");
			System.out.println("|4. Hien Thi Gio Han                           |");
			System.out.println("|0. Quay Lai                                   |");
			System.out.println("================================================");
			System.out.print("MOI BAN LUA CHON CHUC NANG>>>>  ");

			int chon = Integer.parseInt(scan.nextLine());
			
			switch (chon) {
			case 1:
				themGioHang(scan);
				break;
			case 2:
				
				break;
			case 3:
				thanhToan();
				break;
			case 4:
				
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println(" HAY NHAP DUNG LUA CHON !!!");
			}
		} while (flag);
	}
	
	private void themGioHang(Scanner scan) {
		System.out.println("Nhap ma san pham them vao gio hang: ");
		int ma = Integer.parseInt(scan.nextLine());
		
		SanPham sanPham = khachHangCallBack.checkMaSanPhamTonTai(ma);
		if(sanPham == null) {
			System.out.println("San Pham Khong Ton Tai");
		} else {
			if(sanPham instanceof ThucPhamChuaDongGoi) {
				System.out.println("Day la Thuc Pham Chua Dong Goi, ban phai can truoc khi them vao gio hang...");
			} else {
				System.out.println("Nhap so Luong them: ");
				float soLuongThem = Float.parseFloat(scan.nextLine());
				sanPham.setSoLuong(soLuongThem);
				this.listGioHang.add(sanPham);
				System.out.println("Them San Pham Thanh Cong !!!");
			}
		}
	}
	
	private void thanhToan() {
		System.out.println("Thong Tin Hoa Don: ");
		float tongHoaDon = 0;
		for(SanPham sp: this.listGioHang) {
			System.out.println("San Pham" + sp.getTenSanPham() + "\t SoLuong: " + sp.getSoLuong() + "\t Thanh Tien: " + sp.getGiaTien());
			tongHoaDon += sp.getGiaTien();
		}
		System.out.println("Tong so tien la: " + tongHoaDon);
	}
	
}
