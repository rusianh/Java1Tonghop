import java.util.ArrayList;
import java.util.Scanner;

/**
 * @note Tao ra ra quan ly cac nghiep vu lien quan den tat ca giao dich
 * @author Cris
 * @since 18/07/21
 * @version 1.0
 */
public class DanhSachGiaoDich {
	// Constant
	final int MOT_TY = 1000;
	// 1. Attribute
	private ArrayList<GiaoDich> listGiaoDich;
	private int tongSLGDVang;
	private int tongSLGDTienTe;
	private float trungBinhThanhTienGDTienTe;
	// 2. Get, set methods

	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public int getTongSLGDVang() {
		return tongSLGDVang;
	}

	public int getTongSLGDTienTe() {
		return tongSLGDTienTe;
	}

	public float getTrungBinhThanhTienGDTienTe() {
		return this.trungBinhThanhTienGDTienTe;
	}

	// 3. Constructor
	public DanhSachGiaoDich() {
		listGiaoDich = new ArrayList<GiaoDich>();
	}

	/**
	 * @param listGiaoDich
	 */
	public DanhSachGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	// 4. Input, output methods
	public void nhap(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("Vui Long chon");
			System.out.println(" 1.Nhap giao dich vang ");
			System.out.println(" 2.Nhap giao dich tien te");
			System.out.println(" 3.Nhap 0 de thoat");
			int chon = Integer.parseInt(scan.nextLine());
			GiaoDich giaoDich;
			switch (chon) {
			case 1: // giao dich vang
				giaoDich = new GiaoDichVang();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				listGiaoDich.add(giaoDich);
				break;
			case 2:
				giaoDich = new GiaoDichTienTe();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				listGiaoDich.add(giaoDich);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui long nhap 0 - 1 - 2");
			}
		} while (flag);
	}

	public void xuat() {
		for (GiaoDich gd : this.listGiaoDich) {
			gd.xuat();
		}
	}

	// 5. Business methods
	public void tinhTongSLGDVang() {
		this.tongSLGDVang = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichVang) {
				this.tongSLGDVang += gd.soLuong;
			}
		}
	}

	public void tinhTongSLGDTienTe() {
		this.tongSLGDTienTe = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichTienTe) {
				this.tongSLGDTienTe += gd.soLuong;
			}
		}
	}

	public void tinhTBThanhTienTienTe() {
		float thanhTien = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			//gd.tinhTien();
			if (gd instanceof GiaoDichTienTe) {
				thanhTien += ((GiaoDichTienTe)gd).getThanhTien();
			}
		}
		this.trungBinhThanhTienGDTienTe = thanhTien / this.tongSLGDTienTe;
	}

	public void xuatGDTheoTieuChi() {
		System.out.println("Cac giao dich lon hon " + MOT_TY);
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd.getDonGia() > MOT_TY) {
				gd.xuat();
			}
		}
	}
	
	public void tinhTienChoCacGiaoDich() {
		for(GiaoDich gd:this.listGiaoDich) {
			gd.tinhTien();
		}
	}
	
	public void dummyData() {
		GiaoDich giaoDich = new GiaoDichVang(1, 1, 1, 2021, 4, 5, "SJC");
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichVang(2, 2, 1, 2021, 5, 10, "SJC");
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichVang(3, 3, 4, 2021, 12, 11, "9999");
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichTienTe(4, 5, 6, 2021, 1100, 10, 23, 2);
		this.listGiaoDich.add(giaoDich);
		
		giaoDich = new GiaoDichTienTe(5, 2, 1, 2021, 1800, 17, 20, 1);
		this.listGiaoDich.add(giaoDich);
	}

}
