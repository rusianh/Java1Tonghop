package com.quanlysinhvien;

import java.util.Scanner;

public class Librian extends Users {

	public Librian() {
		
	}

	public Librian(String email, String pass, int role) {
		super(email, pass, role);
		
	}

	@Override
	public String inMenu(Scanner scan) {
		System.out.println("************************************************");
        System.out.println("1. Doi Mat Khau ");
        System.out.println("2. Them Sach");
        System.out.println("3. Danh Sach Sach Trong Kho");
        System.out.println("4. Danh Sach Sach Dang Duoc Muon");
        System.out.println("5. Doi Tai Khoan ");
        System.out.println("6. Thoat Chuon Trinh");
        System.out.println("7. Tang Thoi Gian");
        System.out.println("8. Danh Sach Nop Muon va Tien Phat");
        System.out.print("Moi Chon >>>> ");
        System.out.println("************************************************");
		return scan.nextLine();
	}

}
