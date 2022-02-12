package com.quanlysinhvien;

import java.util.Scanner;

/**
 * Muc dich quan ly cac nghiep vu lien quan den nguoi dung
 * @author Cris Vu
 * Date: 01/07/2021
 * Version: 1.0
 */


public abstract class Users {
	//Attribute
	protected String emailUser;
	protected String passUser;
	protected int role;
	protected boolean active;

	//Get, Set methods
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getPassUser() {
		return passUser;
	}
	public void setPassUser(String passUser) {
		this.passUser = passUser;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	//Constructor
	public Users() {
		this.active = true;
	}
	
	public Users(String email, String pass, int role) {
		this.emailUser = email;
		this.passUser = pass;
		this.role = role;
		this.active = true;
	}
	//Input, output methods
	public void input(Scanner scan) {
		System.out.println("Nhap email: ");
		this.emailUser = scan.nextLine();
		
		System.out.println("Nhap mat khau: ");
		this.emailUser = scan.nextLine();
	}
	
	public void output() {
		System.out.println("Email: " + this.emailUser);
		
	};
	//Business methods
	public abstract String inMenu(Scanner scan);
	
	public void nhapMatKhau() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap mat khau: ");
		this.passUser = scan.nextLine();
	}
	
	public void changePassWord(Scanner scan) {
		boolean flag = true;
		do {
			System.out.print("Nhap mat khau cu:");
			String oldPassWord = scan.nextLine();
			if(this.getPassUser().equals(oldPassWord)) {
				System.out.print("Nhap mat khau moi");
				String newPassWord = scan.nextLine();
				this.passUser = newPassWord;
				System.out.println("Mat khau moi doi thanh cong");
				flag = false;
			} else {
				System.out.println("Mat khau cu sai... Vui long nhap lai");
			}
			
		} while (flag);
	}
	
	public void lockAcount() {
		this.active = false;
	}
	
	public void unLockAcount() {
		this.active = true;
	}

//	public abstract void test();
	
}
