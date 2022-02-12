import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp kế thừa HocVien và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Người tạo: Chien dev
 * Version: 3.0
 *
 * */
public class HocVien extends TaiKhoan {
    //    attributes
    private DsSach listSachMuon;
    private int tongTienPhat;

    //    constructors
    public HocVien() {
        super();
        this.listSachMuon = new DsSach();
        this.loaiTk = "student";
    }

    //    get set



    public DsSach getListSachMuon() {
        return listSachMuon;
    }

    public void setListSachMuon(DsSach listSachMuon) {
        this.listSachMuon = listSachMuon;
    }

    public int getTongTienPhat() {
        return tongTienPhat;
    }

    public void setTongTienPhat(int tongTienPhat) {
        this.tongTienPhat = tongTienPhat;
    }

    //    input output

    @Override
    public void nhap(Scanner scan) {
        super.nhap(scan);
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    public void xuatTen() {

    }

    @Override
    public String inMenu(Scanner scan) {
        System.out.println("************************************************");
        System.out.println("1. Đổi mật khẩu ");
        System.out.println("2. Danh sách sách trong kho ");
        System.out.println("3. Mượn sách ");
        System.out.println("4. Trả sách ");
        System.out.println("5. Danh sách sách đang mượn");
        System.out.println("6. Đổi tài khoản");
        System.out.println("7. Thoát Chương trình");
        System.out.println("************************************************");
        System.out.print("Mời chọn >>>> ");
        return scan.nextLine();
    }

    //    business method

}

