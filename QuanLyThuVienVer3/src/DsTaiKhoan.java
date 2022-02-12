import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp Danh sách tài khoản và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Ngày sửa gần nhất: 6/7/2021
 * Người tạo: Chien dev
 * Version: 3.0
 *
 * */
public class DsTaiKhoan {
    //    attributes
    private ArrayList<TaiKhoan> listTk;

    //    constructors
    public DsTaiKhoan() {
        this.listTk = new ArrayList<TaiKhoan>();
    }

    public DsTaiKhoan(ArrayList<TaiKhoan> listTk) {
        this.listTk = listTk;
    }

    //    set get
    public ArrayList<TaiKhoan> getListTk() {
        return listTk;
    }

    public void setListTk(ArrayList<TaiKhoan> listTk) {
        this.listTk = listTk;
    }

    //    input output
    public void themTk(TaiKhoan tk) {
        this.listTk.add(tk);
    }

    //    tạo dữ liệu
    public void taoDuLieuTaiKhoan() {
        try {
            FileReader reader = new FileReader("src/TaiKhoan.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] listInfo = line.split(" # ");
                TaiKhoan tk;
                if (listInfo[5].equalsIgnoreCase("STU")) {
                    tk = new HocVien();
                } else if (listInfo[5].equalsIgnoreCase("TT")) {
                    tk = new ThuThu();
                } else {
                    tk = new Admin();
                }
                tk.setTen(listInfo[0]);
                tk.setEmail(listInfo[1]);
                tk.setMatKhau(listInfo[2]);
                tk.setLoaiTk(listInfo[3]);
                tk.setTrangThai(Integer.parseInt(listInfo[4]));
                this.listTk.add(tk);

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void xuatFull() {
        for (TaiKhoan tk : this.listTk) {
            tk.xuat();
        }
    }

    //    business method

    //    login
    public TaiKhoan login(Scanner scan) {
        TaiKhoan taiKhoan = null;
        do {
            System.out.print("Nhập email: ");
            String email = scan.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String matKhau = scan.nextLine();
            for (TaiKhoan tk : this.listTk) {
                if (tk.getEmail().equals(email) && tk.getMatKhau().equals(matKhau)) {
                    taiKhoan = tk;
                    break;
                }
            }
            if (taiKhoan == null) {
                System.out.println("==============================================================");
                System.out.println("||     EMAIL HOẶC MẬT KHẨU BỊ SAI !! VUI LÒNG NHẬP LẠI      ||");
                System.out.println("==============================================================");
            }
        } while (taiKhoan == null);

        return taiKhoan;
    }

    //    kiểm tra trạng thái tài khoản
    public boolean checkTrangThai(TaiKhoan tk) {
        boolean flag = false;
        if (tk.getTrangThai() == 1) {
            flag = true;
        }
        return flag;
    }

    //    unlock và lock tài khoản
    public void thayDoiTrangThaiTk(Scanner scan, int trangThai, String thongBao) {
        TaiKhoan tk = timTkTheoEmail(scan);
        if (tk != null) {
            do {
                System.out.println(">>>>>  BẠN CÓ CHẮC MUỐN THỰC HIỆN THAO TÁC NÀY ?? -- Ấn yes để đồng ý -- phìm bất kì để thoát >>>>> ");
                String chon = scan.nextLine();
                if (chon.equalsIgnoreCase("yes")) {
                    tk.setTrangThai(trangThai);
                    System.out.println(thongBao);
                    break;
                } else {
                    break;
                }
            } while (true);
        }
    }

    //    reset mật khẩu
    public void resetMk(Scanner scan) {
        TaiKhoan tk = timTkTheoEmail(scan);
        if (tk != null) {
            do {
                System.out.print("Nhập vào mật khẩu mới: ");
                String mkMoi = scan.nextLine();
                System.out.print("Xác nhận mật khẩu mới: ");
                String xacNhanMk = scan.nextLine();
                if (!xacNhanMk.equals(mkMoi)) {
                    System.out.println("||>>>>>> Bạn nhập sai mật khẩu xác nhận !!! vui lòng nhập lại !!! >>>>>>>||");
                } else {
                    System.out.println(" >>>> Bạn có muốn thay đổi mật khẩu ? -- Ấn yes để đồng ý -- phìm bất kì để thoát >>>>");
                    String chon = scan.nextLine();
                    if (chon.equalsIgnoreCase("Yes")) {
                        tk.setMatKhau(mkMoi.trim());
                        System.out.println(">>> RESET MẬT KHẨU THÀNH CÔNG >>>");
                        break;
                    } else {
                        break;
                    }
                }
            }
            while (true);
        }
    }

    //   tìm tài khoản
    public TaiKhoan timTkTheoEmail(Scanner scan) {
        TaiKhoan tk = null;
        do {
            System.out.print("Nhập vào email : ");
            String email = scan.nextLine();
            for (TaiKhoan taiKhoan : this.listTk) {
                if (taiKhoan.getEmail().equals(email)) {
                    tk = taiKhoan;
                    break;
                }
            }
            if (tk == null) {
                System.out.println(">>> TÀI KHOẢN KHÔNG TỒN TẠI !!! VUI LÒNG NHẬP LẠI !!! >>>>>>");
            }
            System.out.println("******** BẠN CÓ MUỐN TIẾP TỤC ? -- ẤN No để thoát -- phím bất kì để thoát ");
            String chon = scan.nextLine();
            if (chon.equalsIgnoreCase("no")) {
                return tk;
            }

        } while (tk == null);
        return tk;
    }

    //    kiểm tra email tổn tại trong list
    public boolean ktEmailTonTai(String email) {
        for (TaiKhoan tk : this.getListTk()) {
            if (tk.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }


}
