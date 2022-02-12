import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp Ds sách và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Người tạo: Chien dev
 * Version: 1.0
 *
 * */
public class DsSach {
    //    attributes
    private HashMap<Sach, Integer> listSach;

    //   get set

    public HashMap<Sach, Integer> getListSach() {
        return listSach;
    }

    public void setListSach(HashMap<Sach, Integer> listSach) {
        this.listSach = listSach;
    }

    //    constructors
    public DsSach() {
        this.listSach = new HashMap<Sach, Integer>();
    }

    //    input output
//    thêm sách
    public void nhapSach(Scanner scan) {
        System.out.print("Nhập vào mã sách: ");
        int ma = Integer.parseInt(scan.nextLine());
        Sach sach = timSachTheoMa(ma);
        if (sach != null) {
            System.out.println("Bạn đang thêm sách: " + sach.getTenSach());
        } else {
            sach = new Sach();
            sach.setMa(ma);
            sach.nhap(scan);
        }
        System.out.print("Mời bạn nhập số lượng sách muốn thêm: ");
        int soSach = Integer.parseInt(scan.nextLine());
        themSach(sach, soSach);
        System.out.println("==============================================================");
        System.out.println("||                   THÊM SÁCH THÀNH CÔNG                  ||");
        System.out.println("==============================================================");
        System.out.println(sach.getTenSach() + "- Tổng số: " + this.listSach.get(sach));
        System.out.println("==============================================================");

    }

    //    tạo dữ liệu
    public void taoDuLieuSach() {
        try {
            FileReader reader = new FileReader("src/Sach.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] listInfo = line.split(" # ");
                Sach sach = new Sach(Integer.parseInt(listInfo[0]), listInfo[2]);
                this.listSach.put(sach, Integer.parseInt(listInfo[1]));
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // tăng số lượng sách
    public void themSach(Sach sach, int soLuong) {
        if (this.listSach.containsKey(sach)) {
            int soSach = this.listSach.get(sach);
            this.listSach.put(sach, soSach + soLuong);
        } else {
            this.listSach.put(sach, soLuong);
        }
    }

    //    giảm số lượng sách
    public void giamSach(Sach sach, int soLuong) {
        if (this.listSach.get(sach) >= soLuong) {
            int soSach = this.listSach.get(sach);
            this.listSach.put(sach, soSach - soLuong);
        } else {
            System.out.println("số lượng sách mượn quá mức quy định");
        }
    }

    // xuất số lượng sách trong kho
    public void xuatSachKho() {
        for (Map.Entry<Sach, Integer> entry : this.listSach.entrySet()) {
            entry.getKey().tinhSoLuongSachMuon();
            entry.getKey().xuat();
            System.out.println("\t\t\t\t\t|| Số lượng trong kho: " + entry.getValue());
        }
    }


    //    business method
//    tinh số lượng sách mượn
    //    Tìm sách theo mã
    public Sach timSachTheoMa(int ma) {
        Sach sach = null;
        for (Map.Entry<Sach, Integer> entry : this.listSach.entrySet()) {
            if (entry.getKey().getMa() == ma) {
                sach = entry.getKey();
                break;
            }
        }
        return sach;
    }

    //    tìm kiếm sách
    public Sach timSach(Scanner scan) {
        Sach sach = null;
        boolean flag = true;
        do {
            System.out.print("Ấn 1 để tìm sách trong list và Ấn phím bất kì để thoát tìm sách: ");
            String chon = scan.nextLine();
            if (chon.equals("1")) {
                System.out.print("Nhập vào mã sách: ");
                int ma = Integer.parseInt(scan.nextLine());
                sach = timSachTheoMa(ma);
                if (sach != null) {
                    flag = false;
                } else {
                    System.out.println("==============================================================");
                    System.out.println("||      KHÔNG CÓ SÁCH CẦN TÌM !! VUI LÒNG NHẬP LẠI           ||");
                    System.out.println("==============================================================");
                }
            } else {
                flag = false;
            }
        } while (flag);
        return sach;
    }

    //    kiếm tra trạng thái, số lượng sách sách
    public Boolean checkSoLuong(Sach sach) {
        boolean checked = true;
        if (this.listSach.get(sach) == 0) {
            checked = false;
        }
        return checked;
    }
    
    
}
