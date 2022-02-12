import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp kế thừa Admin và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Người tạo: Chien dev
 * Version: 1.0
 *
 * */
public class Admin extends TaiKhoan {
    //    constructors
    public Admin() {
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

    //    business methods
    @Override
    public String inMenu(Scanner scan) {
        System.out.println("************************************************");
        System.out.println("1. Đổi mật khẩu ");
        System.out.println("2. Tạo tài khoản thủ thư ");
        System.out.println("3. Tạo tài khoản sinh viên ");
        System.out.println("4. Danh sách tài khoản ");
        System.out.println("5. Reset mật khẩu ");
        System.out.println("6. Lock tài khoản");
        System.out.println("7. Un-Lock tài khoản");
        System.out.println("8. Đổi tài khoản");
        System.out.println("9. Thoát Chương trình");
        System.out.println("************************************************");
        System.out.print("Mời chọn >>>> ");
        return scan.nextLine();
    }

}
