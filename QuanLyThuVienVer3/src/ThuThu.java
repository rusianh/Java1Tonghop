import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp kế thừa Thủ thư và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Người tạo: Chien dev
 * Version: 1.0
 *
 * */
public class ThuThu extends TaiKhoan {
    //    constructors
    public ThuThu() {
        super();
        this.loaiTk = "staff";
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

    //    business method
    @Override
    public String inMenu(Scanner scan) {
        System.out.println("************************************************");
        System.out.println("1. Đổi mật khẩu ");
        System.out.println("2. Thêm sách");
        System.out.println("3. Danh sách sách trong kho");
        System.out.println("4. Danh sách đang được mượn");
        System.out.println("5. Đổi tài khoản ");
        System.out.println("6. Thoát Chương trình");
        System.out.println("7. Tăng thời gian");
        System.out.println("8. Danh sách nộp muộn và tiền phạt");
        System.out.print("Mời chọn >>>> ");
        System.out.println("************************************************");
        return scan.nextLine();
    }
}
