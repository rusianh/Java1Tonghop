package com.quanlysinhvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Quan ly thu vien
 * 
 * @author Admin
 *
 */
public class Library {
	// Constants
	public final int TienPhat_1_3 = 10; // K vnđ
	public final int TienPhat_3_7 = 20; // K vnđ
	public final int TienPhat_7   =  3;    // K vnđ
	// Attribute
	private ListUser  listUser;
	private ListBooks listSachKho;
	private ListBooks listSachMuon;
	private String    tenThuVien;
	private LocalDate time = LocalDate.of(2021, 01, 21);
	// Get, set methods
	public ListUser getListUser() {
		return listUser;
	}

	public void setListUser(ListUser listUser) {
		this.listUser = listUser;
	}

	// Constructor
	public Library() {
		listUser = new ListUser();
	}

	// Input, output methods
	public void line() {
		System.out.println("=========================================");
	}
	
	public void xuatDSTaiKhoan() {
		this.listUser.xuatDSTaiKhoan();
	}
	
	public ListBooks getListSachKho() {
		return listSachKho;
	}
	
	public void setListSachKho(ListBooks listSachKho) {
		this.listSachKho = listSachKho;
	}
	
	public ListBooks getListSachMuon() {
		return listSachMuon;
	}
	
	public void setListSachMuon(ListBooks listSachMuon) {
		this.listSachMuon = listSachMuon;
	}
	// Business methods
	// CreatData


	public void creatDummyData() {
		Users deffaultAcount;
		deffaultAcount = new Admin();
		deffaultAcount.setEmailUser("admin@");
		deffaultAcount.setPassUser("123456");
		deffaultAcount.setRole(1);
		deffaultAcount.setActive(true);
		this.listUser.addUser(deffaultAcount);

		deffaultAcount = new Admin();
		deffaultAcount.setEmailUser("cris@");
		deffaultAcount.setPassUser("123");
		deffaultAcount.setRole(1);
		deffaultAcount.setActive(false);
		this.listUser.addUser(deffaultAcount);

		deffaultAcount = new Students();
		deffaultAcount.setEmailUser("student1@");
		deffaultAcount.setPassUser("123");
		deffaultAcount.setRole(3);
		deffaultAcount.setActive(true);
		this.listUser.addUser(deffaultAcount);

		deffaultAcount = new Librian();
		deffaultAcount.setEmailUser("librian@");
		deffaultAcount.setPassUser("123");
		deffaultAcount.setRole(2);
		deffaultAcount.setActive(true);
		this.listUser.addUser(deffaultAcount);

	}

	public void inLogIn() {
		System.out.println("=========================================");
		System.out.println("|    Moi ban dang nhap vao he thong     |");
		System.out.println("=========================================");
	}

	public Users doLogIn() {
		// 		Cho nguoi dung nhap id password
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		// 		Duyet danh sach so sanh voi tai khoan dang nhap
		do {
			System.out.println("Moi nhap email: ");
			String user = scan.nextLine();
			line();
			System.out.println("Moi nhap password: ");
			String pass = scan.nextLine();
			for (int i = 0; i < this.listUser.size(); i++) {
				Users userInListUser = this.listUser.getUser(i);
				if (userInListUser.getEmailUser().equals(user)) {
					if (userInListUser.getPassUser().equals(pass)) {
						if (userInListUser.getActive()) {
							line();
							System.out.println("Login thanh cong. Chao mung: " + userInListUser.getEmailUser());
							flag = false;
							return userInListUser;
						} else {
							System.out.println(">>> Tai khoan chua duoc kich hoat!!! Vui long dang nhap tai khoan khac");
						}
					}
				}
			}
			System.out.println("Tài khoan khong ton tai. Vui long dang nhap lai !!!");
			
		} while(flag);
		return null;
	}

	// 		Kiem Tra Role
	public int checkRoleUser(Users user) {
//		Users user = this.doLogIn();
		return user.getRole();
	}
	// 		ChangePassword

	// 		Creat new acount
	public boolean creatAcount(Scanner scan, int role) {
		Users newUser;
		boolean flag = true;
		do {
			System.out.println(">>> Nhap email moi: ");
			String newEmail = scan.nextLine();
			if (!this.listUser.checkEmailEmpty(newEmail)) {
				System.out.println("Email da ton tai");
			} else {
				switch (role) {
				case 1:
					newUser = new Admin();
					newUser.setEmailUser(newEmail);  
					newUser.nhapMatKhau();
					break;
				case 2:
					newUser = new Librian();
					newUser.setEmailUser(newEmail);
					newUser.nhapMatKhau();
					break;
				case 3:
					newUser = new Students();
					newUser.setEmailUser(newEmail);
					newUser.nhapMatKhau();
					break;
				}
			}
		} while (flag);
		return false;
	}
	
	public void resetMatKhau(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("Nhap email");
			String email = scan.nextLine();
			if(this.listUser.checkEmailEmpty(email)) {
				System.out.println("Email chua ton tai"); 
			} else {
				for(Users user: this.listUser.getListUser()) {
					if(user.getEmailUser().equals(email)) {
						System.out.println("Nhap mat khau moi");
						user.setPassUser(scan.nextLine());
						flag = false;
					}
				}
			}
		} while(flag);
		
	}
	
	public void lockAcount(Scanner scan) {
		this.listUser.lockAcount(scan);
	}
	
	public void unLockAcount(Scanner scan) {
		this.listUser.unLockAcount(scan);
	}
	
	//===================================================Librian==========================================================
	
	// them sach
	public void themSach(Scanner scan) {
		this.listSachKho.nhapSach(scan);
	}
	
	// show danh sach trong kho 
	public void showDSSachKho() {
		this.listSachKho.xuat();
	}
	// show danh sach dang duoc muon
	
	
	//===================================================Student==========================================================
	// Muon sach
	public void muonSach(Scanner scan, Users user) {
		//B1: La sach can muon
		System.out.println("Nhap ma sach muon tim");
		int ma = Integer.parseInt(scan.nextLine());
		Books book = this.listSachKho.timSachTheoMa(ma);
		//B2: Kiem tra sach co tron list khong
		if(book == null) {
			System.out.println("Khong co ma sach can tim");
		} else {
			if(book.checkSoLuongSach()) {
				System.out.println("NAHP SO LUONG SACH CAN MUON (Nho hon hoac bang so sach dang co!) ");
				int soLuongSachMuon = Integer.parseInt(scan.nextLine());
				if(soLuongSachMuon <= book.getSoLuongSach()) {
					updateKhoSachSauMuon(book, soLuongSachMuon, user);
				} else {
					System.out.println("Muon sach that bai do so luong muon vuot qua yeu cau");
				}
			}
		}
	}
	
	public void traSach(Scanner scan, Users user) {
		System.out.println("Nhap ma sach can tra: ");
		int ma = Integer.parseInt(scan.nextLine());
		Books book = this.listSachMuon.timSachTheoMa(ma);
		if(book== null) {
			System.out.println("MA SACH KHONG TON TAI");
		} else {
			if(book.checkSoLuongSach()) {
				System.out.println("NHAP SO LUONG SACH MUON TRA");
				int soLuongTra = Integer.parseInt(scan.nextLine());
				if(soLuongTra<=book.getSoLuongSach()) {
					updateKhoSachSauTra(book, soLuongTra, user);
				}
			} else {
				System.out.println("KHONG CO SACH DANG MUON");
			}
			
		}
		
	}
	
	private void updateKhoSachSauMuon(Books book, int soLuongSach, Users student) {
		this.listSachKho.giamSach(book, soLuongSach);
		this.listSachMuon.themSach(book, soLuongSach);
		((Students)student).getListMuonSach().themSach(book, soLuongSach);
	}
	private void updateKhoSachSauTra(Books book, int soLuongSach, Users student) {
		this.listSachKho.themSach(book, soLuongSach);
		this.listSachMuon.giamSach(book, soLuongSach);
		((Students)student).getListMuonSach().giamSach(book, soLuongSach);
	}
	
	
}
