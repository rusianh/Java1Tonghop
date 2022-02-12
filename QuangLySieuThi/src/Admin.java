import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (9:21:22 PM)
 * @version 1.0
 */
public class Admin {
	// 1. Attribute
	private String name;
//	private Program program;
	public TuongTacAdminCallBack callBack;
	/**
	 * 
	 */
	public Admin(TuongTacAdminCallBack callBack) {
//		this.program = program;
		this.callBack = callBack;
	}

	public void menuAdmin(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("Moi ban nhap lua chon");
			System.out.println("1. Nhap them hang hoa");
			System.out.println("2. Hien thi danh sach hang hoa");
			System.out.println("3. Tang thoi gian");
			System.out.println("4. Hien thi danh sach nhap kho");
			System.out.println("5. Hien thi danh sach loai kho");
			System.out.println("0. Quay lai)");
			
			int key = Integer.parseInt(scan.nextLine());
			switch (key) {
			case 1:
				themHangHoaMenu(scan);
				break;
			case 2:
				callBack.hienThiDanhSachSanPham();
				break;
			case 3:
				System.out.println("Nhap vao so ngay muon tang");
				int ngayTang = Integer.parseInt(scan.nextLine());
				callBack.tangThoiGian(ngayTang);
				break;
			case 4:
				callBack.hienThiLogNhapKho();
				break;
			case 5:
				callBack.hienThiDanhSachLoaiKho();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println(" Moi nhap lua chon 0-5");
				break;
			}
		} while (flag);

	}
	
	private void themHangHoaMenu(Scanner scan) {
		SanPham sp = new SanPham();
		boolean flag = true;
		Lable: do {
			System.out.println("Moi ban nhap lua chon");
			System.out.println("1. Hang Hoa Thong Dung");
			System.out.println("2. Thuc Pham Dong Goi");
			System.out.println("3. Thuc Pham Chua Dong Goi");
			System.out.println("4. Do Dien Tu");
			System.out.println("0. Quay lai)");
			 
			int key = Integer.parseInt(scan.nextLine());
			switch (key) {
			case 1:
				sp = new SanPham();
				sp.setCallBack(callBack);
				sp.nhapSanPham(scan);
				
				break Lable;
			case 2:
				sp = new ThucPhamDongGoi();
				sp.setCallBack(callBack);
				sp.nhapSanPham(scan);
				break Lable;
			case 3:
//				ThucPhamChuaDongGoi thucPhamChuaDongGoi = new ThucPhamChuaDongGoi();
//				thucPhamChuaDongGoi.nhapSanPham(scan);
//				sp = thucPhamChuaDongGoi;
				sp = new ThucPhamChuaDongGoi();
				sp.setCallBack(callBack);
				sp.nhapSanPham(scan);
				break Lable;
			case 4:
				break Lable;
			case 0:
				flag = false;
				break Lable;
			default:
				System.out.println(" Moi nhap lua chon 0-5");
				break;
			}
		} while (flag);
//		program.addSanPham(sp);
		callBack.addSanPham(sp);
	}
	
	
	
}
