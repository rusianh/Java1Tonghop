import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp sách và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Người tạo: Chien dev
 * Version: 1.0
 *
 * */
public class Sach implements Xuat {
    //    attributes
    private int ma;
    private HashMap<TaiKhoan, Integer> listTkMuonSach;
    private String tenSach;
    private String trangThai;
    private int soLuongMuon;

    //  constructors
    public Sach() {
        this.listTkMuonSach = new HashMap<TaiKhoan, Integer>();

    }

    public Sach(int ma, String tenSach) {
        this.ma = ma;
        this.listTkMuonSach = new HashMap<TaiKhoan, Integer>();
        this.tenSach = tenSach;
        this.trangThai = "Còn";

    }

    //    get set
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }


    public HashMap<TaiKhoan, Integer> getListTkMuonSach() {
        return listTkMuonSach;
    }

    public void setListTkMuonSach(HashMap<TaiKhoan, Integer> listTkMuonSach) {
        this.listTkMuonSach = listTkMuonSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    //   input output
    public void nhap(Scanner scan) {
        System.out.print("Tên sách: ");
        this.tenSach = scan.nextLine();
    }

    @Override
    public void xuat() {
        System.out.print("|| Mã sách: " + this.ma + "\t\t\t\t|| Tên sách: " + this.tenSach + "\t\t\t\t\t|| Cho mượn: " + this.soLuongMuon);
    }

    public void xuatTen() {
        System.out.print("Tên: " + this.tenSach + "\t | Số lượng còn: ");
    }
    //    input output

    //    bussiness method


    // business method
    public void tinhSoLuongSachMuon() {
        int tong = 0;
        for (Map.Entry<TaiKhoan, Integer> entry : this.listTkMuonSach.entrySet()) {
            tong += entry.getValue();
        }
        this.soLuongMuon = tong;
    }

    public void xuatListTkMuonSach() {
        for (Map.Entry<TaiKhoan, Integer> entry : this.listTkMuonSach.entrySet()) {
            System.out.println("\t|số lượng: " + entry.getValue() + " -- SV: " + entry.getKey().getTen());
        }
    }

    //   thêm sách
    public void themSachTk(TaiKhoan tk, int soLuong) {
        if (this.listTkMuonSach.containsKey(tk)) {
            int soSach = this.listTkMuonSach.get(tk);
            this.listTkMuonSach.put(tk, soSach + soLuong);
        } else {
            this.listTkMuonSach.put(tk, soLuong);
        }
    }

    public void giamSachTk(TaiKhoan tk, int soLuong) {
        if (this.listTkMuonSach.get(tk) > soLuong) {
            int soSach = this.listTkMuonSach.get(tk);
            this.listTkMuonSach.put(tk, soSach - soLuong);

        }
    }

}
