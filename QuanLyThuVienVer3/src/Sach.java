import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp sách và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Ngày sửa gần nhất: 6/7/2021
 * Người tạo: Chien dev
 * Version: 3.0
 *
 * */
public class Sach implements Xuat {
    //    attributes
    protected int soLuong;
    protected int ma;
    protected String tenSach;
    private String Email;
    private LocalDate thoiGianMuon;
    private int tienPhat;

    //  constructors
    public Sach() {

    }

    public Sach(int ma, int soLuong, String tenSach) {
        this.soLuong = soLuong;
        this.ma = ma;
        this.tenSach = tenSach;
    }

    //    get set
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getThoiGianMuon() {
        return thoiGianMuon;
    }

    public void setThoiGianMuon(LocalDate thoiGianMuon) {
        this.thoiGianMuon = thoiGianMuon;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    //   input output
    public void nhap(Scanner scan) {
        System.out.print("Tên sách: ");
        this.tenSach = scan.nextLine();
    }

    public void xuat() {
        System.out.println("|| Mã sách: " + this.ma + "\t\t\t\t|| Tên sách: " + this.tenSach + "\t\t\t | Số lượng còn: " + this.soLuong);
    }

    // business method
//    public void tinhSoLuongSachMuon() {
//        int tong = 0;
//        for (Map.Entry<TaiKhoan, Integer> entry : this.listTkMuonSach.entrySet()) {
//            tong += entry.getValue();
//        }
//        this.soLuongMuon = tong;
//    }

    //    kiếm tra trạng thái, số lượng sách sách
    public Boolean checkSoLuong() {
        boolean checked = true;
        if (this.soLuong == 0) {
            checked = false;
        }
        return checked;
    }

    public void xuatListTkMuonSach() {

    }


    //   thêm sách
//    public void themtkMuonSach(TaiKhoan tk, int soLuong) {
//        if (this.listTkMuonSach.containsKey(tk)) {
//            int soSach = this.listTkMuonSach.get(tk);
//            this.listTkMuonSach.put(tk, soSach + soLuong);
//        } else {
//            this.listTkMuonSach.put(tk, soLuong);
//        }
//    }

//    public void giamSachTk(TaiKhoan tk, int soLuong) {
//        if (this.listTkMuonSach.get(tk) > soLuong) {
//            int soSach = this.listTkMuonSach.get(tk);
//            this.listTkMuonSach.put(tk, soSach - soLuong);
//
//        }
//    }

}
