import java.util.Map;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp kế thừa HocVien và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Người tạo: Chien dev
 * Version: 1.0
 *
 * */
public class HocVien extends TaiKhoan {
    //    attributes
    private DsSach listSachMuon;

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

    //    xuất list tài khoản mượn sách
    public void xuatListSachMuon() {
        System.out.println(this.ten + " ĐÃ MƯỢN: " );
        System.out.println("**********************************************************************************");
        for (Map.Entry<Sach, Integer> entry : this.listSachMuon.getListSach().entrySet()) {
            System.out.println("Tên sách: " + entry.getKey().getTenSach() + "\t | số lượng: " + entry.getValue());
        }
        System.out.println("**********************************************************************************");
    }

}
