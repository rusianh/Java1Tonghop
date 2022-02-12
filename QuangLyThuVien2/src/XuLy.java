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
            if (tk.getTrangThai().equalsIgnoreCase("lock")) {
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
                    TaiKhoan thuThuMoi = new ThuThu();
                    thuVien.taoTk(scan, thuThuMoi);
                    System.out.println("==============================================================");
                    System.out.println("||           TẠO TÀI KHOẢN THỦ THƯ THÀNH CÔNG                ||");
                    System.out.println("==============================================================");
                    break;
                case "3":
                    TaiKhoan hocVienMoi = new HocVien();
                    thuVien.taoTk(scan, hocVienMoi);
                    System.out.println("==============================================================");
                    System.out.println("||           TẠO TÀI KHOẢN HỌC VIÊN THÀNH CÔNG              ||");
                    System.out.println("==============================================================");
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
                    thuVien.xuatDsSachKho();
                    break;
                case "3":
                    thuVien.muonSach(tk, scan);
                    break;
                case "4":
                    thuVien.traSach(tk, scan);
                    break;
                case "5":
                    ((HocVien) tk).xuatListSachMuon();
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
                    thuVien.xuatDsSachKho();
                    break;
                case "4":
                    thuVien.xuatListSachMuon();
                    break;
                case "5":
                    flag = false;
                    break;
                case "6":
                    return false;
                default:
                    System.out.println("Vui lòng nhập giá trị từ 1 - 7");
            }
        } while (flag);
        return true;
    }


}



