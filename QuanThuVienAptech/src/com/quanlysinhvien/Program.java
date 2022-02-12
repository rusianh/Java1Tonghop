package com.quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Running Program
 * 
 * @author CrisVu
 *
 */
public class Program {

	public static void main(String[] args) {
		// Library start
		Library library = new Library();
		Scanner scan = new Scanner(System.in);
		Users user;
		library.creatDummyData();
		// Menu start
		boolean flag = true;
		do {
			library.inLogIn();
			user = library.doLogIn();
			switch (library.checkRoleUser(user)) {
			// Admin
			case 1:
				flag = doMenuAdmin(scan, user, library);
				break;
			case 2:
				flag = doMenuLibrian(scan, user, library);
				break;
			case 3:
				flag = doMenuStudent(scan, user, library);
				break;
			default:
				break;
			}
		} while (flag);
	}

	private static boolean doMenuAdmin(Scanner scan, Users user, Library library) {
		boolean flag = true;
		do {
			String chon = user.inMenu(scan);
			switch (chon) {
			case "1":
				user.changePassWord(scan);
				break;
			case "2":
				library.creatAcount(scan, 2);
				System.out.println(">>>>>>> TAO TAI KHOAN THU THU THANH CONG >>>>>>");
				break;
			case "3":
				library.creatAcount(scan, 3);
				System.out.println(">>>>>>> TAO TAI KHOAN SINH VIEN THANH CONG >>>>>>");
				break;
			case "4":
				library.xuatDSTaiKhoan();
				break;
			case "5":
				library.resetMatKhau(scan);
				break;
			case "6":
				library.lockAcount(scan);
				break;
			case "7":
				library.unLockAcount(scan);
				break;
			case "8":
				flag = false;
				break;
			case "9":
				return false;
			default:
				System.out.println(">>>> Vui long nhap lai gia tri tu 1 - 9 !!!");
				break;
			}
		} while (flag);
		return true;
	}

	private static boolean doMenuLibrian(Scanner scan, Users user, Library library) {
		boolean flag = true;
		do {
			System.out.println("Moi nhap lua chon: ");
			String chon = user.inMenu(scan);
			switch (chon) {
			case "1":
				user.changePassWord(scan);
				break;
			case "2":
				library.themSach(scan);
				break;
			case "3":
				library.showDSSachKho();
				break;

			case "4":
				library.getListSachMuon().xuat();
				break;
			case "5":
				flag = false;
				
				break;
			case "6":
				return false;
			default:
				System.out.println(">>>> Vui long nhap lai gia tri tu 1 - 6 !!!");
				break;
			}
		} while (flag);
		return true;
	}

	private static boolean doMenuStudent(Scanner scanner, Users user, Library library) {
		boolean flag = true;
		do {
			System.out.println("Moi nhap lua chon: ....");
			String chon = user.inMenu(scanner);
			switch (chon) {
			case "1":
				user.changePassWord(scanner);
				break;
			case "2":
				library.showDSSachKho();
				break;
			case "3":
				library.muonSach(scanner, user);
				break;
			case "4":
				library.traSach(scanner, user);
				break;
			case "5":
				((Students)user).getListMuonSach().xuat();
				break;
			case "6":
				flag = false;
				break;
			case "7":
				return false;
			default:
				System.out.println(">>>> Vui long nhap lai gia tri tu 1 - 7 !!!");
				break;
			}
		} while (flag);
		return true;
	}
}

//1. Attribute
//2. Get, set methods
//3. Constructor
//4. Input, output methods
//5. Business methods