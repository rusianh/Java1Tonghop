import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp superclass tài khoản
 * Ngày tạo: 29.06.2021
 * Ngày sửa gần nhất: 6/7/2021
 * Người tạo: Chien dev
 * Version: 3.0
 *
 * */
public abstract class TaiKhoan implements Xuat {
    //    attributes
    protected String email;
    protected String ten;
    protected String matKhau;
    protected String loaiTk;
    protected int trangThai;

    //    constructors
    public TaiKhoan() {
    }

    public TaiKhoan(String ten, String email, String matKhau, String loaiTk, int trangThai) {
        this.ten = ten;
        this.email = email;
        this.matKhau = matKhau;
        this.loaiTk = loaiTk;
        this.trangThai = trangThai;
    }

    //    get set

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getLoaiTk() {
        return loaiTk;
    }

    public void setLoaiTk(String loaiTk) {
        this.loaiTk = loaiTk;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
//    input output

    public void nhap(Scanner scan) {
        System.out.print("Nhập vào tên tài khoản: ");
        this.ten = scan.nextLine();
        System.out.print("Nhập vào mật khẩu: ");
        this.matKhau = scan.nextLine();
        this.trangThai = 1;
    }

    @Override
    public void xuat() {
        String temp;
        if (this.trangThai == 1) {
            temp = "active";
        } else {
            temp = "lock";
        }
        System.out.println("Tên: " + this.ten + "\t\t|| Email: " + this.email + "\t\t|| Password: " + this.matKhau + "\t\t|| Trạng thái: " + temp + "\t\t|| Type: " + this.loaiTk);
    }


    //    business method
    public abstract String inMenu(Scanner scan);

    //    đổi mật khẩu
    public void doiMk(Scanner scan) {
        do {
            System.out.print("Nhập mật khẩu cũ: ");
            String mkCu = scan.nextLine();
            if (!this.getMatKhau().equals(mkCu)) {
                System.out.println(">>> Bạn nhập sai mật khẩu cũ !!! vui lòng nhập lại !!! >>>");
            } else {
                System.out.print("Nhập mật khẩu mới: ");
                String mkMoi = scan.nextLine();
                System.out.print("Xác nhận mật khẩu mới: ");
                String mkXacNhan = scan.nextLine();
                if (!mkMoi.equals(mkXacNhan)) {
                    System.out.println(">>> Bạn nhập sai mật khẩu xác nhận !!! vui lòng nhập lại !!! >>>");
                } else {
                    this.setMatKhau(mkMoi.trim());
                    System.out.println(">>>> THAY ĐỔI MẬT KHẨU THÀNH CÔNG !!!>>>>");
                    break;
                }
            }
        } while (true);
    }
}
