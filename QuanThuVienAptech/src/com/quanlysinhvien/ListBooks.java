package com.quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class ListBooks {
	// 1. Attribute
	private ArrayList<Books> listBook;
	// 2. Get, set methods

	public ArrayList<Books> getListBook() {
		return listBook;
	}

	public void setListBook(ArrayList<Books> listBook) {
		this.listBook = listBook;
	}
	// 3. Constructor

	/**
	 * 
	 */
	public ListBooks() {
		super();
		listBook = new ArrayList<Books>();
	}

	/**
	 * @param listBook
	 */
	public ListBooks(ArrayList<Books> listBook) {
		super();
		this.listBook = listBook;
	}

	// 4. Input, output methods
	public void xuat() {
		for (Books book : this.listBook) {
			book.xuatSach();
		}
	}
	// 5. Business methods

	// them sach
	public void nhapSach(Scanner scan) {
		System.out.println("Nhap ma sach");
		int ma = Integer.parseInt(scan.nextLine());
		Books book = timSachTheoMa(ma);
		if (book != null) {
			System.out.println("Ban Dang Them Sach: " + book.getTenSach());
		} else {
			book = new Books();
			book.setMaSach(ma);
			book.nhapSachMoi(scan);
		}
		book.nhapSach(scan);
		System.out.println(">>>>> THÊM SÁCH THÀNH CÔNG >>>>>");
		System.out.println(book.getTenSach() + " - TONG SO" + book.getSoLuongSach());
	}

	// Tang soluong sach
	public void themSach(Books book, int soLuongThem) {
		if (this.listBook.contains(book)) {
			book.setSoLuongSach(soLuongThem + book.getSoLuongSach());
		} else {
			this.listBook.add(book);
		}
	}
	
	public void giamSach(Books book, int soLuong) {
		if(this.listBook.contains(book)) {
			book.soLuongSach -= soLuong;
		}
	}
	
	public Books timSachTheoMa(int ma) {
		for (Books book : this.listBook) {
			if (book.getMaSach() == ma) {
				return book;
			}
		}
		return null;
	}
	
	
}
