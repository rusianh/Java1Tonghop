import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2] Quan li cac nghiep vu cua sieu thi
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (5:34:35 PM)
 * @version 1.0
 */
public class SieuThi implements XuatNhap, SieuThiCallBack {
	// 1. Attribute
	private DanhSachHangHoa objListHangHoa;
	private ArrayList<LichSuNhapKho> listNhapKho;
	private LocalDate ngayHienTai;

	private float doanhThu;
	private float loiNhuan;

	// 2. Get, set methods

	public DanhSachHangHoa getObjListHangHoa() {
		return objListHangHoa;
	}

	public void setObjListHangHoa(DanhSachHangHoa objListHangHoa) {
		this.objListHangHoa = objListHangHoa;
	}

	public ArrayList<LichSuNhapKho> getListNhapKho() {
		return listNhapKho;
	}

	public void setListNhapKho(ArrayList<LichSuNhapKho> listNhapKho) {
		this.listNhapKho = listNhapKho;
	}

	public LocalDate getNgayHienTai() {
		return ngayHienTai;
	}

	public void setNgayHienTai(LocalDate ngayHienTai) {
		this.ngayHienTai = ngayHienTai;
	}

	// 3. Constructor
	public SieuThi() {
		objListHangHoa = new DanhSachHangHoa(this);
		ngayHienTai = LocalDate.now();
		listNhapKho = new ArrayList<LichSuNhapKho>();
		
	}
//	public SieuThi(DanhSachHangHoaCallBack danhSachHangHoaCallBack) {
//		objListHangHoa = new DanhSachHangHoa(this);
//		ngayHienTai = LocalDate.now();
//		listNhapKho = new ArrayList<LichSuNhapKho>();
//		this.danhSachHangHoaCallBack  = danhSachHangHoaCallBack;
//	}

	// 4. Input, output methods
	@Override
	public void xuat() {
		// TODO Auto-generated method stub

	}

	public void xuatListNhapKho() {
		for (LichSuNhapKho ls : this.listNhapKho) {
			ls.xuat();
		}
	}

	@Override
	public void nhap(Scanner scan) {
		// TODO Auto-generated method stub

	}

	// 5. Business methods
	public void doMenuStart(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("===========================");
			System.out.println("|Bay Gio La : " + this.ngayHienTai);
			System.out.println("|1. Admin                  |");
			System.out.println("|2. Customer               |");
			System.out.println("|0. Thoat phien dang nhap  |");
			System.out.println("===========================");
			System.out.print("Moi lua chon thanh vien: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				doMenuAdmin(scan);
				break;
			case 2:
				//Khoi tao gio hang moi, moi khi nguoi dung vao lai.
				objListHangHoa.khoiTaoDanhSachGiohang();
				
				doMenuCustomers(scan);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println(">>>>>> Xin hay nhap dung lua chon!");
			}

		} while (flag);
	}

//===========================================================ADMIN=====================================================================
	public void doMenuAdmin(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("\n");
			System.out.println("================================================");
			System.out.println("|Bay Gio La : " + this.ngayHienTai);
			System.out.println("|1. Them Hang Hoa                              |");
			System.out.println("|2. Hien Thi Danh Sach Hang Hoa Theo Danh Muc  |");
			System.out.println("|3. Tang Thoi Gian                             |");
			System.out.println("|4. Thong Ke                                   |");
			System.out.println("|0. Thoat Phien Dang Nhap                      |");
			System.out.println("================================================");
			System.out.print("MOI BAN LUA CHON CHUC NANG>>>>  ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				doMenuNhapThemHangHoa(scan);
				break;
			case 2:
				objListHangHoa.hienThiDanhSachHangHoaTong();
				break;
			case 3:
				System.out.print("Nhap So Ngay muon tang: ");
				int soNgayTang = Integer.parseInt(scan.nextLine());
				tangThoiGian(soNgayTang);
				break;
			case 4:
				System.out.println("================================================");
				System.out.println("|     THONG KE SO LUONG HANG HOA DA BAN");
				objListHangHoa.thongKeSoLuongHangHoaDaBan();
				System.out.println("\n================================================");

				System.out.println("================================================");
				System.out.println("|     THONG KE HANG HOA HET HAN");
				objListHangHoa.thongKeHangHetHan();
				System.out.println("================================================");

				System.out.println("================================================");
				System.out.println("|     THONG KE SO LUONG HANG HOA NHAP KHO");
				xuatListNhapKho();
				System.out.println("================================================");

				System.out.println("================================================");
				System.out.println("|     TOP 5 SAN PHAM DOANH THU CAO NHAT ");
				sortDoanhThu();
				System.out.println("\n================================================");
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui Long Nhap Dung 1-4");
			}

		} while (flag);
	}

	public void doMenuNhapThemHangHoa(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("\n================================================");
			System.out.println("|Bay Gio La : " + this.ngayHienTai);
			System.out.println("|1. Hang Hoa Thong Dung                        |");
			System.out.println("|2. Thuc Pham Dong Goi                         |");
			System.out.println("|3. Thuc Pham Chua Dong Goi                    |");
			System.out.println("|4. Do Dien Tu                                 |");
			System.out.println("|0. Quay Lai                                   |");
			System.out.println("================================================");
			System.out.print("MOI BAN LUA CHON CHUC NANG>>>>  ");

			int chon = Integer.parseInt(scan.nextLine());
			HangHoa hangHoa;
			switch (chon) {
			case 1:
				hangHoa = new HangHoa();
				nhapThemHangHoa(scan, hangHoa);
				break;
			case 2:
				hangHoa = new ThucPhamDaDongGoi();
				nhapThemHangHoa(scan, hangHoa);
				break;
			case 3:
				hangHoa = new ThucPhamChuaDongGoi();
				nhapThemHangHoa(scan, hangHoa);
				break;
			case 4:
				hangHoa = new DoDienTu();
				nhapThemHangHoa(scan, hangHoa);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println(" HAY NHAP DUNG LUA CHON !!!");
			}
		} while (flag);
	}

	// Nhap Them Hang Hoa Thong Dung
	public void nhapThemHangHoa(Scanner scan, HangHoa hangHoa) {
		System.out.println("================================================");
		System.out.print("|Nhap Ma HangHoa Muon Them: ");
		String maHangHoa = scan.nextLine();

		// check ma HangHoa da co trong kho tong chua>>>
		HangHoa hangHoaCheck;
		hangHoaCheck = checkMaHangHoaTonTai(maHangHoa, this.objListHangHoa.getListHangHoaTong());
		if (hangHoaCheck == null) {
			// Hang hoa moi them vao listTong>>>
			System.out.println("Hang Hoa chua co trong kho. Tao san pham moi >>>>");
			hangHoa.nhap(scan);
			objListHangHoa.getListHangHoaTong().add(hangHoa);

			// Them Hang HOa moi nhap vao Danh Sach Ban
			HangHoa taoMoiHangHoaDaBan = new HangHoa(hangHoa.getTenHangHoa(), hangHoa.getMaHangHoa(),
					hangHoa.getNhaPhanPhoi(), hangHoa.getGiaNhap(), hangHoa.getGiaBan(), 0.0f);
			objListHangHoa.getListHangHoaDaBan().add(taoMoiHangHoaDaBan);

			// Them vao listNhapKho
			LichSuNhapKho log = new LichSuNhapKho(hangHoa.getMaHangHoa(), hangHoa.getTenHangHoa(), hangHoa.getSoLuong(),
					ngayHienTai);
			listNhapKho.add(log);

			// in ra man hinh danh sach list Tong
			objListHangHoa.xuat(objListHangHoa.getListHangHoaTong());
		} else {
			// Hang Hoa da co trong kho => thay doi so luong >>>
			System.out.println("================================================");
			System.out.println("|Hang Hoa da co trong kho. Them So Luong >>>>");
			System.out.print("|Nhap So Luong Muon Them >>>>");
			float soLuongThem = Float.parseFloat(scan.nextLine());
			hangHoaCheck.themSoLuong(soLuongThem);

			// Tao lich su nhap kho tu hang hoa vua them so luong
			LichSuNhapKho log = new LichSuNhapKho(hangHoaCheck.getMaHangHoa(), hangHoaCheck.getTenHangHoa(),
					soLuongThem, ngayHienTai);
			listNhapKho.add(log);

		}
	}

	public void tangThoiGian(int soNgayTang) {
		Period temp = Period.ofDays(soNgayTang);
		this.ngayHienTai = ngayHienTai.plus(temp);
	}

	public void thongKeDanhSachHangHoaNhapVe() {
		for (LichSuNhapKho lichSu : this.listNhapKho) {
			lichSu.xuat();
		}
	}

	public void sortDoanhThu() {
		interchangeSort(objListHangHoa.getListHangHoaDaBan());
		// Neu list ban hang co it hon 5 sp ==>
		if (objListHangHoa.getListHangHoaDaBan().size() < 5) {
			for (HangHoa hangHoa : this.objListHangHoa.getListHangHoaDaBan()) {
				hangHoa.xuat();
			}
		} else { // list co tu 5 sp
			int count = 1;
			for (HangHoa hangHoa : this.objListHangHoa.getListHangHoaDaBan()) {
				hangHoa.xuat();
				count++;
				if (count == 5) {
					break;
				}
			}

		}
	}

//=========================================================Customer===================================================
	public void doMenuCustomers(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("\n");
			System.out.println("================================================");
			System.out.println("|Bay Gio La : " + this.ngayHienTai);
			System.out.println("|1. Them Gio Hang                              |");
			System.out.println("|2. Can  Hang Hoa (Ap dung TP chua dong goi    |");
			System.out.println("|3. Thanh Toan                                 |");
			System.out.println("|0. Thoat Phien Dang Nhap                      |");
			System.out.println("================================================");
			System.out.print("MOI BAN LUA CHON CHUC NANG>>>>  ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				themGioHang(scan);
				break;
			case 2:
				canHangHoa(scan);
				break;
			case 3:
				objListHangHoa.tienHanhThanhToan();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Moi nhap dung lua chon");
			}
		} while (flag);
	}

	public void themGioHang(Scanner scan) {
		// Xuat ds hang hoa trong kho
		objListHangHoa.xuat(objListHangHoa.getListHangHoaTong());

		// Chon ma hang Hoa tuong ung:
		System.out.println("\n Moi nhap ma Hang Hoa cho vao gio hang: ");
		String chonMa = scan.nextLine();
		// Tra ve hangHoa can chon.
		HangHoa hangHoa = checkMaHangHoaTonTai(chonMa, objListHangHoa.getListHangHoaTong());
		HangHoa hangHoaThemGioHang = new HangHoa(hangHoa.getTenHangHoa(), hangHoa.getMaHangHoa(), hangHoa.getNhaPhanPhoi(), 
				hangHoa.getGiaNhap(), hangHoa.getGiaBan(), hangHoa.getSoLuong());

		// Thong bao neu hang hoa thuoc hang hoa chua dong goi
		if (hangHoa instanceof ThucPhamChuaDongGoi) {
			System.out.println("Vui long can truoc khi thanh toan: ");
		} else {
			// Nhap so luong hang hoa cho vao gio | Nhap lai neu so luong bi qua'
			float soLuongChon;
			boolean flag = true;
			lable1: do {
				System.out.println("Moi chon so luong: (Nho hon so luong dang co)");
				soLuongChon = Float.parseFloat(scan.nextLine());
				if (hangHoa != null && hangHoa.getSoLuong() > soLuongChon) {
//				flag = false;
					break lable1;
				}
			} while (flag);

			if (hangHoa != null) {
				// Tien hanh them vao gio hang
				hangHoaThemGioHang.setSoLuong(soLuongChon);
				objListHangHoa.getListGioHang().add(hangHoaThemGioHang);
			} else {
				System.out.println(" Nhap sai ma moi ban lam lai tu dau: ");
			}
		}
		
		// Thong Bao lai gio hang:
		System.out.println("Gio hang dang co: "  );
		objListHangHoa.xuat(objListHangHoa.getListGioHang());

	}

	public void canHangHoa(Scanner scan) {
		HangHoa hangHoa;

		// Chon ma hang Hoa tuong ung:
		System.out.println("Moi nhap ma Hang Hoa cho vao gio hang: ");
		String chonMa = scan.nextLine();

		// Kiem tra ma hang hoa voi listTong
		hangHoa = checkMaHangHoaTonTai(chonMa, objListHangHoa.getListHangHoaTong());
		if ((hangHoa != null) && (hangHoa instanceof ThucPhamChuaDongGoi)) {
			System.out.print("Nhap so luong can cua san pham: ");
			float soLuongCan = Float.parseFloat(scan.nextLine());
			hangHoa.setSoLuong(soLuongCan);
			objListHangHoa.getListGioHang().add(hangHoa);
		} else {
			System.out.println("Vui long chon dung Ma Thuc PHam Chu Dong Goi");
		}
	}

//=========================================Sub function=====================================

	public HangHoa checkMaHangHoaTonTai(String ma, ArrayList<HangHoa> list) {
		return objListHangHoa.checkHangHoa(ma, list);
	}

	private void interchangeSort(ArrayList<HangHoa> listHangHoa) {
		int i, j;
		for (i = 0; i < listHangHoa.size() - 1; i++) {
			for (j = i + 1; j < listHangHoa.size(); j++) {
				HangHoa hangHoaI = listHangHoa.get(i);
				HangHoa hangHoaJ = listHangHoa.get(j);
				if ((hangHoaI.getGiaBan()*hangHoaI.getSoLuong())  - (hangHoaJ.getGiaBan()*hangHoaJ.getSoLuong()) < 0) {
					Collections.swap(listHangHoa, i, j);
				}
			}
		}
	}

}
