package com.quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Quan ly nghiep vu cua admin
 * 
 * @author Admin
 *
 */
public class Admin extends Users {
	// Attribute
	// Get, set methods
	// Constructor
	public Admin() {
		super();
		this.role = 1;
	}

	// Input, output methods
	// Business methods
	public void showMenu() {
		System.out.println("1. Doi Mat Khau\n" + "2. Tao Tai Khoan Thu Thu\n" + "3. Tao Tai Khoan Sinh Vien\n"
				+ "4. Danh Sach Tai Khoan\n" + "5. Reset Mat Khau\n" + "6. Lock Tai Khoan\n" + "7. Un-Lock Tai Khoan\n"
				+ "8. Doi Tai Khoan\n" + "9. Thoat Chuong Trinh\n");
	}
//	@Override
	public String inMenu(Scanner scan) {
		System.out.println("************************************************");
        System.out.println("1. Doi Mat Khau ");
        System.out.println("2. Tao Tai Khoan Thu Thu ");
        System.out.println("3. Tao Tai Khoan Sinh Vien ");
        System.out.println("4. Danh Sach tai khoan ");
        System.out.println("5. Reset mat khau ");
        System.out.println("6. Lock tai khoan");
        System.out.println("7. Un-Lock tai khoan");
        System.out.println("8. Doi Tai Khoan");
        System.out.println("9. Thoát Chuong Trinh");
        System.out.println("************************************************");
        System.out.print("Moi Nhap lua chon");
        return scan.nextLine();
	}
//	@Override
//	public String inMenu(Scanner scan, String a) {
//		return scan.nextLine();
//	}
	
	

}
