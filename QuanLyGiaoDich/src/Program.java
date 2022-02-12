import java.util.Scanner;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}

	private static void inMenu() {
		System.out.println("Chon chuc nang: ");
		System.out.println("1. Nhap giao dich");
		System.out.println("2. Tong so luong cho tung loai");
		System.out.println("3. Tinh trung binh thanh tien cho giao dich ngoai te");
		System.out.println("4. Xuat giao dich co don gia hon 1TY");
		System.out.println("0. Thoat chuong trinh");
	}

	private static void doMenu(Scanner scan) {
		boolean flag = true;
		DanhSachGiaoDich xuLyGiaoDich = new DanhSachGiaoDich();
		xuLyGiaoDich.dummyData();
		xuLyGiaoDich.tinhTienChoCacGiaoDich();
		do {
			inMenu();
			System.out.println("Moi chon");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 0:
				flag = false;
			case 1:
				xuLyGiaoDich.nhap(scan);
				break;
			case 2:
				xuLyGiaoDich.tinhTongSLGDTienTe();
				xuLyGiaoDich.tinhTongSLGDVang();
				System.out.println("Tong So luong giao dich tien te: " + xuLyGiaoDich.getTongSLGDTienTe());
				System.out.println("Ton so luong giao dich Vang: "+ xuLyGiaoDich.getTongSLGDVang());
				break;
			case 3:
				xuLyGiaoDich.tinhTBThanhTienTienTe();
				System.out.println("Trung binh thanh tien giao dich tien te"+ xuLyGiaoDich.getTrungBinhThanhTienGDTienTe());
				break;
			case 4:
				xuLyGiaoDich.xuatGDTheoTieuChi();
				break;
			}
		} while (flag);
	}
}

//1. Attribute
//2. Get, set methods
//3. Constructor
//4. Input, output methods
//5. Business methods