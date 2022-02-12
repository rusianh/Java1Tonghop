import java.util.Map;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý thư viện và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Người tạo: Chien dev
 * Version: 1.0
 *
 * */
public class ThuVien {
    //    attributes
    private DsSach listSachKho;
    private DsSach listSachMuon;
    private DsTaiKhoan listTongTk;
    private String tenThuVien;

    //    get set
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
    public void taoTk(Scanner scan, TaiKhoan tk) {
        boolean flag = true;
        do {
            System.out.print("Nhập vào email: ");
            String email = scan.nextLine();
            if (this.listTongTk.ktEmailTonTai(email)) {
                System.out.println("==============================================================");
                System.out.println("||         Email đã tồn tại !! Vui lòng nhập lại !!         ||");
                System.out.println("==============================================================");
            } else {
                System.out.print("Nhập vào họ tên: ");
                String hoTen = scan.nextLine();
                System.out.print("Nhập vào mật khẩu: ");
                String matKhau = scan.nextLine();
                tk.setEmail(email);
                tk.setMatKhau(matKhau);
                tk.setTen(hoTen);
                tk.setTrangThai("active");
                this.listTongTk.themTk(tk);
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
        this.listTongTk.lockTk(scan);
    }

    //   unlock tài khoản
    public void unlockTk(Scanner scan) {
        this.listTongTk.unlockTk(scan);
    }

    //================================================= THỦ THƯ =======================================================

    //    thêm sách
    public void themSach(Scanner scan) {
        this.listSachKho.nhapSach(scan);
    }

    //    xuất ds sách trong kho
    public void xuatDsSachKho() {
        this.listSachKho.xuatSachKho();
    }

    //    xuất list sách mượn
    public void xuatListSachMuon() {
        if (!this.listSachMuon.getListSach().isEmpty()) {
            for (Map.Entry<Sach, Integer> entry : this.listSachMuon.getListSach().entrySet()) {
                entry.getKey().tinhSoLuongSachMuon();
                System.out.print("Mã: "+entry.getKey().getMa()+"\t"+entry.getKey().getTenSach() + "\t");
                entry.getKey().xuatListTkMuonSach();
            }
        } else {
            System.out.println("==============================================================");
            System.out.println("||               KHÔNG CÓ AI MƯỢN SÁCH !!!!                 ||");
            System.out.println("==============================================================");
        }
    }

    //    =============================================== HỌC VIÊN =======================================================
    //   Mượn sách
    public void muonSach(TaiKhoan hv, Scanner scan) {
        boolean flag = true;
        Sach sach = this.listSachKho.timSach(scan);
        if (!this.listSachKho.checkSoLuong(sach)) {
            System.out.println("Hiện sách không có sẵn có mời bạn quay lại sau");
        } else {
            System.out.println("==============================================================");
            sach.xuatTen();
            System.out.println(+this.listSachKho.getListSach().get(sach));
            System.out.println("==============================================================");
            do {
                System.out.print("Nhập số lượng sách muốn mượn: ");
                int soSach = Integer.parseInt(scan.nextLine());
                if (soSach > this.listSachKho.getListSach().get(sach)) {
                    System.out.println("=====================================================");
                    System.out.println("Sách hiện chỉ còn " + this.listSachKho.getListSach().get(sach));
                    System.out.println("VUI LÒNG NHẬP LẠI !!!");
                    System.out.println("======================================================");
                } else {
                    sach.themSachTk(hv, soSach);
                    sach.tinhSoLuongSachMuon();
                    this.listSachKho.giamSach(sach, soSach);
                    this.listSachMuon.themSach(sach, soSach);
                    ((HocVien) hv).getListSachMuon().themSach(sach, soSach);
                    flag = false;
                    System.out.println("==============================================================");
                    System.out.println("|| Bạn đã mượn " + sach.getTenSach() + " - số lượng: " + soSach + "||");
                    System.out.println("==============================================================");
                }
            } while (flag);

        }
    }

    //    Trả sách
    public void traSach(TaiKhoan tk, Scanner scan) {
        HocVien hv = (HocVien) tk;
        boolean flag = true;
        if (!hv.getListSachMuon().getListSach().isEmpty()) {
            Sach sach = hv.getListSachMuon().timSach(scan);
            System.out.println("Tên sách: " + sach.getTenSach() + "--- số lượng sách: " + hv.getListSachMuon().getListSach().get(sach));
            do {
                System.out.println("Nhập vào số lượng sách cần trả: ");
                int soSach = Integer.parseInt(scan.nextLine());
                if (soSach > hv.getListSachMuon().getListSach().get(sach)) {
                    System.out.println("==============================================================");
                    System.out.println("|| số sách trả lớn hơn số sách mượn !! Vui lòng nhập lại    ||");
                    System.out.println("==============================================================");
                } else {
                    this.listSachMuon.giamSach(sach, soSach);
                    this.listSachKho.themSach(sach, soSach);
                    hv.getListSachMuon().giamSach(sach, soSach);
                    sach.giamSachTk(tk, soSach);
                    System.out.println("==============================================================");
                    System.out.println("||                   TRẢ SÁCH THÀNH CÔNG                    ||");
                    System.out.println("==============================================================");
                    flag = false;
                }
            } while (flag);
        } else {
            System.out.println("==============================================================");
            System.out.println("||                   CHƯA CÓ MƯỢN SÁCH                      ||");
            System.out.println("==============================================================");
        }

    }
}
