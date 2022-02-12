package com.quanlysinhvien;

import java.util.Scanner;

/**
 * @note Quan ly nghiep vu sinh vien
 * @author Admin
 *
 */
public class Students extends Users {
	//1. Attribute
	protected ListBooks listMuonSach;
	//2. Get, set methods
	
	public ListBooks getListMuonSach() {
		return listMuonSach;
	}
	
	public void setListMuonSach(ListBooks listMuonSach) {
		this.listMuonSach = listMuonSach;
	}
	
	//3. Constructor

	public Students() {
		// TODO Auto-generated constructor stub
		listMuonSach = new ListBooks();
	}

	@Override
	public String inMenu(Scanner scan) {
		System.out.println("************************************************");
        System.out.println("1. Doi Mat Khau ");
        System.out.println("2. Danh Sach Sach Trong Kho  ");
        System.out.println("3. Muon Sach ");
        System.out.println("4. Tra Sach ");
        System.out.println("5. Danh Sach Sach Dang Muon");
        System.out.println("6. Doi Tai Khoan");
        System.out.println("7. Thoat Chuong Trinh");
        System.out.println("************************************************");
        System.out.print("Moi Chon >>>> ");
		return scan.nextLine();
	}
	
}


//1. Attribute
//2. Get, set methods
//3. Constructor
//4. Input, output methods
//5. Business methods