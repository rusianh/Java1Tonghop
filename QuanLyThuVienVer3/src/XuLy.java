import java.util.Scanner;

public class XuLy {
    public static void main(String[] args) {
        TaiKhoan tk;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        ThuVien thuVien = new ThuVien();
        thuVien.taoDuLieuTaiKhoan();
        thuVien.taoDuLieuSach();
        do {
            tk = thuVien.login(scan);
            if (tk.getTrangThai() == 0) {
                System.out.println("==============================================================");
                System.out.println("||     TÀI KHOẢN BỊ KHÓA !! VUI LÒNG LIÊN HỆ ADMIN          ||");
                System.out.println("==============================================================");
            } else if (tk instanceof HocVien) {
                flag = doMenuHocVien(scan, tk, thuVien);
            } else if (tk instanceof Admin) {
                flag = doMenuAdmin(scan, tk, thuVien);
            } else {
                flag = doMenuThuThu(scan, tk, thuVien);
            }
        } while (flag);

    } 


    private static boolean doMenuAdmin(Scanner scan, TaiKhoan tk, ThuVien thuVien) {
        boolean flag = true;
        do {
            String chon = tk.inMenu(scan);
            switch (chon) {
                case "1":
                    tk.doiMk(scan);
                    break;
                case "2":
                    thuVien.taoTk(scan, 2);
                    System.out.println(">>>>>>> TẠO TÀI KHOẢN THỦ THƯ THÀNH CÔNG >>>>>>");
                    break;
                case "3":
                    thuVien.taoTk(scan, 1);
                    System.out.println(">>>>> TẠO TÀI KHOẢN HỌC VIÊN THÀNH CÔNG >>>>");
                    break;
                case "4":
                    thuVien.xuatDsTk();
                    break;
                case "5":
                    thuVien.resetMatKhau(scan);
                    break;
                case "6":
                    thuVien.lockTk(scan);
                    break;
                case "7":
                    thuVien.unlockTk(scan);
                    break;
                case "8":
                    flag = false;
                    break;
                case "9":
                    return false;
                default:
                    System.out.println("Vui lòng nhập giá trị từ 1 - 9");
            }
        } while (flag);
        return true;
    }

    private static boolean doMenuHocVien(Scanner scan, TaiKhoan tk, ThuVien thuVien) {
        boolean flag = true;
        do {
            String chon = tk.inMenu(scan);
            switch (chon) {
                case "1":
                    tk.doiMk(scan);
                    break;
                case "2":
                    thuVien.getListSachKho().xuat();
                    break;
                case "3":
                    thuVien.muonSach(tk, scan);
                    break;
                case "4":
                    thuVien.traSach(tk, scan);
                    break;
                case "5":
                    ((HocVien) tk).getListSachMuon().xuat();
                    break;
                case "6":
                    flag = false;
                    break;
                case "7":
                    return false;
                default:
                    System.out.println("Vui lòng nhập giá trị từ 1 - 7");
            }
        } while (flag);
        return true;
    }

    private static boolean doMenuThuThu(Scanner scan, TaiKhoan tk, ThuVien thuVien) {
        boolean flag = true;
        do {
            String chon = tk.inMenu(scan);
            switch (chon) {
                case "1":
                    tk.doiMk(scan);
                    break;
                case "2":
                    thuVien.themSach(scan);
                    break;
                case "3":
                    thuVien.getListSachKho().xuat();
                    break;
                case "4":
                    thuVien.getListSachMuon().xuat();
                    break;
                case "5":
                    flag = false;
                    break;
                case "6":
                    return false;
                case "7":
                    thuVien.themThoiGian(scan);
                    System.out.println(">>>>>>> TĂNG THỜI GIAN THÀNH CÔNG >>>>>>>");
                    break;
                case "8":
                    thuVien.xuatListTraSachMuon();
                    break;
                default:
                    System.out.println("Vui lòng nhập giá trị từ 1 - 7");
            }
        } while (flag);
        return true;
    }


}



