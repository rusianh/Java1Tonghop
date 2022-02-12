 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * Mục đích: Quản lý lớp Ds sách và nghiệp vụ liên quan
 * Ngày tạo: 29.06.2021
 * Ngày sửa gần nhất: 6/7/2021
 * Người tạo: Chien dev
 * Version: 3.0
 *
 * */
public class DsSach {
    //    attributes
    private ArrayList<Sach> listSach;

    //   get set


    public ArrayList<Sach> getListSach() {
        return listSach;
    }

    public void setListSach(ArrayList<Sach> listSach) {
        this.listSach = listSach;
    }

    //    constructors
    public DsSach() {
        this.listSach = new ArrayList<Sach>();
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
        System.out.println(">>>>> THÊM SÁCH THÀNH CÔNG >>>>>");
        System.out.println(sach.getTenSach() + "- Tổng số: " + sach.getSoLuong());

    }

    //    tạo dữ liệu
    public void taoDuLieuSach() {
        try {
            FileReader reader = new FileReader("src/Sach.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] listInfo = line.split(" # ");
                Sach sach = new Sach(Integer.parseInt(listInfo[0]), Integer.parseInt(listInfo[1]), listInfo[2]);
                this.listSach.add(sach);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // tăng số lượng sách
    public void themSach(Sach sach, int soLuong) {
        if (this.listSach.contains(sach)) {
            int slCo = sach.getSoLuong();
            sach.setSoLuong(soLuong + slCo);
        } else {
            this.listSach.add(sach);
        }
    }

    //    giảm số lượng sách
    public void giamSach(Sach sach, int soLuong) {
        if (this.listSach.contains(sach)) {
            int slCo = sach.getSoLuong();
            sach.setSoLuong(slCo - soLuong);
        }
    }

    // xuất số lượng sách trong kho
    public void xuat() {
        for (Sach sach : this.listSach) {
                sach.xuat();
        }
    }


    //    business method

    //    tìm kiếm bằng được sach
    public Sach timSach(Scanner scan) {
        do {
            System.out.print("Ấn 1 để tìm sách trong list và Ấn phím bất kì để thoát tìm sách: ");
            String chon = scan.nextLine();
            if (!chon.equals("1")) {
                return null;
            } else {
                System.out.print("Nhập vào mã sách: ");
                int ma = Integer.parseInt(scan.nextLine());
                Sach sach = timSachTheoMa(ma);
                if (sach != null) {
                    return sach;
                }
                System.out.println(">>>> KHÔNG CÓ SÁCH CẦN TÌM !! VUI LÒNG NHẬP LẠI >>>>");

            }
        } while (true);
    }


    //    Tìm sách theo mã
    private Sach timSachTheoMa(int ma) {
        Sach sach = null;
        for (Sach sach1 : this.listSach) {
            if (sach1.getMa() == ma) {
                sach = sach1;
            }
        }
        return sach;
    }

}
