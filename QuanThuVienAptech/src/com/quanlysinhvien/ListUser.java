package com.quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Tao ra de quan ly danh sach nhieu sinh vien
 * 
 * @author Admin
 *
 */
public class ListUser {
	// Attribute
	Scanner scan = new Scanner(System.in);
	private ArrayList<Users> listUser;

	// Get, set methods
	public ArrayList<Users> getListUser() {
		return listUser;
	}

	public void setListUser(ArrayList<Users> listUser) {
		this.listUser = listUser;
	}

	public ListUser() {
		listUser = new ArrayList<Users>();
	}
	// Constructor

	// Input, output methods
	public void xuatDSTaiKhoan() {
		for (Users user : this.listUser) {
			user.output();
		}
	}

	// Business methods
	public void addUser(Users user) {
		listUser.add(user);
	}

	public int size() {
		return listUser.size();
	}

	public Users getUser(int index) {
		return listUser.get(index);
	}
	
	// Return acount
	public Users returnAcount(String email) {
		for(Users user: this.listUser) {
			if(user.getEmailUser().equals(email)) {
				return user;
			}			
		}
		return null;
	}
	// Check email da ton tai chua
	public boolean checkEmailEmpty(String email) {
		for (Users user : this.listUser) {
			if (user.getEmailUser().equals(email)) {
				return false; // trung email tra ve false
			} else {
				return true; // khong bi trung email tra ve true
			}
		}
		return false;
	}

	// lock tai khoan
	public void lockAcount(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println(">>>Nhap email lock...");
			String email = scan.nextLine();
			Users user;
			if (checkEmailEmpty(email)) {
				System.out.println("email chua ton tai");
			} else {
				System.out.println("Ban co chac muon lock tai khoan YES/NO????");
				String chon = scan.nextLine();
				if(chon.equalsIgnoreCase("yes")) {
					user = returnAcount(email);
					user.setActive(false);
					System.out.println("Lock tai khoan thanh cong");
					flag = false;
				} else if(chon.equalsIgnoreCase("no")) {
					flag = false;
				}
			}
		} while (flag);
	}
	
	public void unLockAcount(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println(">>>Nhap email lock...");
			String email = scan.nextLine();
			Users user;
			if (checkEmailEmpty(email)) {
				System.out.println("email chua ton tai");
			} else {
				System.out.println("Ban co chac muon lock tai khoan YES/NO????");
				String chon = scan.nextLine();
				if(chon.equalsIgnoreCase("yes")) {
					user = returnAcount(email);
					user.setActive(true);
					System.out.println("Lock tai khoan thanh cong");
					flag = false;
				} else if(chon.equalsIgnoreCase("no")) {
					flag = false;
				}
			}
		} while (flag);
	}

}
