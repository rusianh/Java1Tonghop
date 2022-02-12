import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (9:02:18 PM)
 * @version 1.0
 */
public class Program implements TuongTacAdminCallBack,TuongTacKhachHangCallBack {
	//Attribute
	ArrayList<SanPham> listSanPham = new ArrayList<SanPham>();
	ArrayList<LichSuNhapKho> listNhapKho = new ArrayList<LichSuNhapKho>(); 
	ArrayList<LichSuNhapKho> listHangLoai = new ArrayList<LichSuNhapKho>();
	LocalDate ngayHienTai;
	
	
	/**
	 * @return the ngayHienTai
	 */
	public LocalDate getNgayHienTai() {
		return ngayHienTai;
	}

	/**
	 * @param ngayHienTai the ngayHienTai to set
	 */
	public void setNgayHienTai(LocalDate ngayHienTai) {
		this.ngayHienTai = ngayHienTai;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Program cuaHang = new Program();
		cuaHang.setNgayHienTai(LocalDate.now());
		cuaHang.loadData();
		cuaHang.inMenu(scan);
		
		
	}

	/**
	 * 
	 */
	public Program() {
	}

	private void inMenu(Scanner scan) {
		boolean flag = true;
		
		Lable:do {
			System.out.println(" Moi ban lua chon");
			System.out.println("1. Admin");
			System.out.println("2. Khach Hang");
			System.out.println("3. Thoat");
		
			int key = Integer.parseInt(scan.nextLine());
			switch (key) {
			case 1:
				Admin admin = new Admin(this);
				admin.menuAdmin(scan);
				
				break Lable;
			case 2:
				KhachHang khachHang = new KhachHang(this);
				khachHang.menuKhachhang(scan);
				break Lable;
			case 3:
				break Lable;
			case 0:
				break Lable;
			default:
				System.out.println("Nhap lua chon 0-3");
				break;

			}
		} while (flag);
	}
	
	public void addSanPham(SanPham sanPham) {
		if(sanPham.getGiaBan() == 0) {
			for(SanPham sp: this.listSanPham) {
				if(sp.getMa() == sanPham.getMa()) {
					sp.setSoLuong(sanPham.getSoLuong()+ sp.getSoLuong());
					
//					LichSuNhapKho log = new LichSuNhapKho(sanPham.getMa() , sp.getTenSanPham(), sanPham.getSoLuong(), ngayHienTai);
//					if(sp instanceof ThucPham) {
//						log.setNgayHetHan(((ThucPham) sanPham).getNgayHetHan());
//					}
//					listNhapKho.add(log);
				}
			}
		} else {
			this.listSanPham.add(sanPham);
//			LichSuNhapKho log = new LichSuNhapKho(sanPham.getMa() , sanPham.getTenSanPham(), sanPham.getSoLuong(), ngayHienTai);
//			if(sanPham instanceof ThucPham) {
//				log.setNgayHetHan(((ThucPham) sanPham).getNgayHetHan());
//			}
//			listNhapKho.add(log);

		}
		LichSuNhapKho log = new LichSuNhapKho(sanPham.getMa() , sanPham.getTenSanPham(), sanPham.getSoLuong(), ngayHienTai);
		if(sanPham instanceof ThucPham) {
			
			log.setNgayHetHan(((ThucPham) sanPham).getNgayHetHan());
		}
		listNhapKho.add(log);
	}
	
	public void hienThiDanhSachSanPham() {
		System.out.println("Co tong so " + listSanPham.size() + " san pham trong cua hang ");
		for(SanPham sp: this.listSanPham) {
//			System.out.println("Ten san pham"+ sp.getTenSanPham());
			sp.hienThiSanPham();
		}
	}
	
	public SanPham checkMaSanPhamTonTai(int ma) {
		for(SanPham sp: listSanPham) {
			if(sp.getMa()== ma) {
				return sp.getSanPhamCopy();
			} 
		}
		return null;
	}
	
	public void loadData() {
		SanPham sp = new SanPham(1, "Lo hoa", 5.0f, 6.0f, 10);
//		listSanPham.add(sp);
		addSanPham(sp);
		
		sp = new SanPham(2, "May Tinh", 7.0f, 10.0f, 5);
//		listSanPham.add(sp);
		addSanPham(sp);
		
//		sp = new ThucPhamDongGoi();
//		sp.setGiaNhap(21);
//		sp.setGiaBan(24);
//		sp.setMa(2);
//		sp.setSoLuong(5);
//		sp.setTenSanPham("My tom");
//		listSanPham.add(sp);
		
		ThucPhamChuaDongGoi sp2 = new ThucPhamChuaDongGoi();
		sp2.setGiaNhap(21);
		sp2.setGiaBan(24);
		sp2.setMa(3);
		sp2.setSoLuong(5);
		sp2.setTenSanPham("Khoai Lang");
		sp2.setNgaySanXuat(LocalDate.now());
//		Period.ofDays(3);
		sp2.setNgayHetHan(LocalDate.now().plus(Period.ofDays(3)));
		sp2.setKhoiLuongTinhTien(1);
//		listSanPham.add(sp2);
		addSanPham(sp2);
		
	}
	
	public void hienThiLogNhapKho() {
		for(LichSuNhapKho lichSu: listNhapKho) {
			lichSu.hienThiLichSuNhapKho();
		}
	}
	
	public void hienThiDanhSachLoaiKho() {
		for(LichSuNhapKho ls: this.listHangLoai) {
			ls.hienThiLichSuNhapKho();
		}
	}
	
	public void tangThoiGian(int soNgayMuonTang) {
		Period temp = Period.ofDays(soNgayMuonTang);
		ngayHienTai = ngayHienTai.plus(temp);
		System.out.println("Ngay sau khi tang: " + this.ngayHienTai);
		/**
		 * Kiem tra danh sach san pham het han
		 * Neu co san pham het han thi bo san pham
		 */
//		listNhapKho.forEach(nhapKho -> {
//			if(nhapKho.)
//			});
		//Duyet list lichSuNhapKho
		for(LichSuNhapKho ls: listNhapKho) {
			if(ls.getNgayHetHan()!=null && ls.getTrangThai()==0) {
				//San pham het han
				if(ls.getNgayHetHan().isBefore(ngayHienTai)) {
					//
					for(SanPham sp: listSanPham) {
						if(sp.getMa() == ls.getMaSanPham()) {
							float soLuongSauKhiGiam = sp.getSoLuong() - ls.getSoLuong();
							sp.setSoLuong(soLuongSauKhiGiam);
							//Them lich su hang loai
							LichSuNhapKho log = new LichSuNhapKho(ls.getMaSanPham(), ls.getTenSanPham(), ls.getSoLuong() , ngayHienTai);
							listHangLoai.add(log);
							//Doi trang thai hang hoa da het han
							ls.setTrangThai(2);
						}
					}
				}
			}
		}
	}
}
