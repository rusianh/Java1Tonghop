import java.util.Scanner;

public class Program {

	public Program() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}

	private static void inMenu() {
		System.out.println("Chon thuc hien: ");
		System.out.println("1. Them nguoi vao");
		System.out.println("2. Xoa theo ma");
		System.out.println("3. Sap xep theo ten");
		System.out.println("4. Xuat Danh Sach");
		System.out.println("0. Thoat");
	}

	private static void doMenu(Scanner scan) {
		boolean flag = true;
		ListPerson objListPerson = new ListPerson();
		objListPerson.dummyData();
		
		do {
			inMenu();
			System.out.println("Moi chon");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				objListPerson.nhap(scan);
				break;
			case 2:

				break; 
			case 3:
				break;
			case 4:
				objListPerson.sortName();
				objListPerson.xuat();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhap 0-3");
				break;
			}
		} while (flag);
	}
}

// 1. Attribute
// 2. Get, set methods
// 3. Constructor
// 4. Input, outputmethods
// 5. Business methods