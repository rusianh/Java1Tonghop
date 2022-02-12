import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý thư viện và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Ngày sửa gần nhất: 6/7/2021
 * Người tạo: Chien dev
 * Version: 3.0
 *
 * */
public class ThuVien {
    //    constants
    final int TIEN_PHAT_1_3 = 10;
    final int TIEN_PHAT_3_7 = 20;
    final int TIEN_PHAT_7 = 3;
    //    attributes
    private LocalDate time = LocalDate.of(2021, Month.JANUARY, 12);
    private DsSach listSachKho;
    private DsSach listSachMuon;
    private DsTaiKhoan listTongTk;
    private String tenThuVien;

    //    get set


    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public DsSach getListSachKho() {
        return listSachKho;
    }

    public void setListSachKho(DsSach listSachKho) {
        this.listSachKho = listSachKho;
    }

    public DsSach getListSachMuon() {
        return listSachMuon;
    }

    public void setListSachMuon(DsSach listSachMuon) {
        this.listSachMuon = listSachMuon;
    }


    public DsTaiKhoan getListTongTk() {
        return listTongTk;
    }

    public void setListTongTk(DsTaiKhoan listTongTk) {
        this.listTongTk = listTongTk;
    }

    public String getTenThuVien() {
        return tenThuVien;
    }

    public void setTenThuVien(String tenThuVien) {
        this.tenThuVien = tenThuVien;
    }

    // constructors
    public ThuVien() {
        this.listSachKho = new DsSach();
        this.listSachMuon = new DsSach();
        this.listTongTk = new DsTaiKhoan();

    }

    //    input output
//    tạo dữ liệu test
    public void taoDuLieuTaiKhoan() {
        this.listTongTk.taoDuLieuTaiKhoan();
    }

    // tạo dữ liệu sách
    public void taoDuLieuSach() {
        this.listSachKho.taoDuLieuSach();
    }

    //    business method
//    đăng nhập
    public TaiKhoan login(Scanner scan) {
        return this.listTongTk.login(scan);
    }

    //===================================================== ADMIN ====================================================

    //    tạo tài khoản
    public void taoTk(Scanner scan, int type) {
        boolean flag = true;
        TaiKhoan tk = null;
        do {
            System.out.print("Nhập vào email: ");
            String email = scan.nextLine();
            if (this.listTongTk.ktEmailTonTai(email)) {
                System.out.println(">>>> EMAIL ĐÃ TỒN TẠI !!! VUI LÒNG NHẬP LẠI  !!! >>>>");
            } else {
                switch (type) {
                    case 1:
                        tk = new HocVien();
                        tk.nhap(scan);
                        break;
                    case 2:
                        tk = new ThuThu();
                        tk.nhap(scan);
                        break;
                    case 3:
                        tk = new Admin();
                        tk.nhap(scan);
                        break;
                }
                if (tk != null) {
                    tk.setEmail(email);
                    this.listTongTk.themTk(tk);
                }
                flag = false;
            }
        } while (flag);
    }

    //    xuất ds tài khoản
    public void xuatDsTk() {
        this.listTongTk.xuatFull();
    }

    //    reset mật khẩu
    public void resetMatKhau(Scanner scan) {
        this.listTongTk.resetMk(scan);
    }

    //    lock tài khoản
    public void lockTk(Scanner scan) {
        this.listTongTk.thayDoiTrangThaiTk(scan, 0, ">>>> KHÓA TẢI KHOẢN THÀNH CÔNG >>>>");
    }

    //   unlock tài khoản
    public void unlockTk(Scanner scan) {
        this.listTongTk.thayDoiTrangThaiTk(scan, 1, ">>>>> MỞ KHÓA TÀI KHOẢN THÀNH CÔNG >>>>");
    }

    //================================================= THỦ THƯ =======================================================

    //    thêm sách
    public void themSach(Scanner scan) {
        this.listSachKho.nhapSach(scan);
    }


    // Tăng thời gian
    public void themThoiGian(Scanner scan) {
        boolean flag = true;
        Period khoangThoiGian = null;
        do {
            System.out.println("Chọn mốc thời gian tăng thêm : ");
            System.out.println("1/ Ngày");
            System.out.println("2/ Tháng");
            System.out.println("3/ Thoát");
            int chon = Integer.parseInt(scan.nextLine());
            switch (chon) {
                case 1:
                    System.out.print("Nhập số ngày muốn thêm: ");
                    int ngay = Integer.parseInt(scan.nextLine());
                    khoangThoiGian = Period.ofDays(ngay);
                    break;
                case 2:
                    System.out.print("Nhập số tháng muốn thêm: ");
                    int thang = Integer.parseInt(scan.nextLine());
                    khoangThoiGian = Period.ofMonths(thang);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("CHỈ NHẬP GIÁ TRỊ 1-4 !!");
            }
        } while (flag);
        if (khoangThoiGian != null) {
            setTime(getTime().plus(khoangThoiGian));
        }

    }


    public void tangThoiGianTheoNgay(Period period, ThuThu thuThu) {
        if (thuThu != null) {

        }
    }

    //    Xuất ds hv trả sách muộn và số tiền cần trả
    public void xuatListTraSachMuon() {
        System.out.println("======================DANH SÁCH HỌC VIÊN TRẢ SÁCH MUỘN VÀ TIỀN PHẠT======================================");
        for (TaiKhoan tk : this.listTongTk.getListTk()) {
            if (tk instanceof HocVien) {
                if (((HocVien) tk).getTongTienPhat() > 0) {
                    System.out.println("HỌC VIÊN : " + tk.getTen() + "\t|| TỔNG TIỀN PHẠT PHẢI TRẢ: " + ((HocVien) tk).getTongTienPhat());
                }
            }
        }
        System.out.println("=========================================================================================================");
    }

    //    =============================================== HỌC VIÊN =======================================================
    //   Mượn sách
    public void muonSach(TaiKhoan hv, Scanner scan) {
        Sach sach = this.listSachKho.timSach(scan);         // B1: lấy ra sách cần mượn
        if (sach != null) {
            if (!sach.checkSoLuong()) { // B2: Check sl, nếu hết xuất thông báo
                System.out.println("Hiện sách không có sẵn có mời bạn quay lại sau");
            } else {
                sach.xuat(); // B3: Xuất tên sách và sl trong kho
                System.out.println(">>> " + sach.getSoLuong() + ">>>");
                do {
                    System.out.print("Nhập số lượng sách muốn mượn >>>>");

                    int soSach = Integer.parseInt(scan.nextLine()); // B5: nhập sl sách mượn

                    if (soSach > sach.getSoLuong()) {  // B6: Nếu sl mượn > sl khó, nhập lại

                        System.out.println(" SÁCH HIỆN CHỈ CÒN " + sach.getSoLuong());
                        System.out.println("VUI LÒNG NHẬP LẠI !!!");
                    } else {
                        updateKhoSachSauMuon(sach, soSach, hv);
                        System.out.println(">>> BẠN ĐÃ MƯỢN " + sach.getTenSach() + " - SỐ LƯỢNG " + soSach + ">>>>");

                        break;
                    }
                } while (true);

            }
        }
    }

    private void updateKhoSachSauMuon(Sach sach, int soSach, TaiKhoan hv) {
        this.listSachKho.giamSach(sach, soSach);
        sach.setThoiGianMuon(this.time);
        this.listSachMuon.themSach(sach, soSach);
        ((HocVien) hv).getListSachMuon().themSach(sach, soSach);
    }

    //    Trả sách
    public void traSach(TaiKhoan tk, Scanner scan) {
        HocVien hv = (HocVien) tk;
        if (hv.getListSachMuon().getListSach().isEmpty()) {
            System.out.println(">>> CHƯA MƯỢN SÁCH >>>");  // B1: chek list sách, nếu null xuất thông báo
        } else {
            Sach sach = hv.getListSachMuon().timSach(scan);   // B2: lấy ra sách cần trả trong list sách
            if (sach != null) {
                System.out.println("Tên sách: " + sach.getTenSach() + "--- số lượng sách mượn: " + sach.getSoLuong()); // B3: in ra tên + sl sách mượn
                do {
                    System.out.println("Nhập vào số lượng sách cần trả >>> ");
                    int soSach = Integer.parseInt(scan.nextLine()); // B4: Nhập sl sách trả
                    if (soSach > sach.getSoLuong()) { // B5: Nếu sl trả < sl mượn, nhập lại
                        System.out.println(">>> SỐ SÁCH TRẢ LỚN HỚN SỐ SÁCH MƯỢN !! VUI LÒNG NHẬP LẠI >>>>");
                    } else {
                        updateKhoSachSauTra(sach, soSach, hv);
                        System.out.println(">>> TRẢ SÁCH THÀNH CÔNG >>>");
                        break;
                    }
                } while (true);
            }
        }
    }

    private void updateKhoSachSauTra(Sach sach, int soSach, HocVien hv) {
        tinhTienPhat((HocVien) hv, sach, soSach);
        this.listSachMuon.giamSach(sach, soSach);
        hv.getListSachMuon().giamSach(sach, soSach);
        sach.setThoiGianMuon(null);
        this.listSachKho.themSach(sach, soSach);
    }

    private void tinhTienPhat(HocVien hv, Sach sach, int soSach) {
        LocalDate ngayMuon = sach.getThoiGianMuon();
        long soNgayMuon = ChronoUnit.DAYS.between(ngayMuon, this.time);
        int tienPhat = 0;
        int tongTienPhat = hv.getTongTienPhat();
        if (soNgayMuon < 3 && soNgayMuon >= 1) {
            tienPhat = soSach * TIEN_PHAT_1_3;

        } else if (soNgayMuon >= 3 && soNgayMuon < 7) {
            tienPhat = soSach * TIEN_PHAT_3_7;
        } else if (soNgayMuon >= 7) {
            long tienPhatThem = (soNgayMuon - 7) * TIEN_PHAT_7;
            tienPhat = (int) ((TIEN_PHAT_1_3 + TIEN_PHAT_3_7 + tienPhatThem) * soSach);
        }
        sach.setTienPhat(tienPhat);
        hv.setTongTienPhat((tongTienPhat + tienPhat));
        System.out.println(">>> SỐ TIỀN PHẠT PHẢI TRẢ CHO SÁCH " + sach.getTenSach() + "|| SỐ LƯỢNG: " + soSach + " || LÀ: " + tienPhat);
        System.out.println(">>>>>>>>>> Số tiền phạt bạn cần phải trả là: " + hv.getTongTienPhat());
    }
}
