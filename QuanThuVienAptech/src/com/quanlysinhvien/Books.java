package com.quanlysinhvien;

import java.time.LocalDate;
import java.util.Scanner;

public class Books {
	// 1. Attribute
	protected int maSach;
	protected String tenSach;
	protected int soLuongSach;
	protected LocalDate thoiGianMuon;
	protected int tienPhat;
	// 2. Get, set methods
	public int getMaSach() {
		return maSach;
	}

	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public int getSoLuongSach() {
		return soLuongSach;
	}

	public void setSoLuongSach(int soLuongSach) {
		this.soLuongSach = soLuongSach;
	}
	
	public LocalDate getThoiGianMuon() {
		return thoiGianMuon;
	}

	public void setThoiGianMuon(LocalDate thoiGianMuon) {
		this.thoiGianMuon = thoiGianMuon;
	}

	public int getTienPhat() {
		return tienPhat;
	}

	public void setTienPhat(int tienPhat) {
		this.tienPhat = tienPhat;
	}

	// 3. Constructor
	public Books() {
		super();
	}

	/**
	 * @param maSach
	 * @param tenSach
	 * @param soLuongSach
	 */
	public Books(int maSach, String tenSach, int soLuongSach) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.soLuongSach = soLuongSach;
	}

	// 4. Input, output methods
	public void nhapSach(Scanner scan) {
		boolean flag = true;
		do {
			System.out.print("Ban dang them sach " + this.tenSach + "Vui long nhap so luong sach");
			int count = Integer.parseInt(scan.nextLine());
			if (count >= 0) {
				this.soLuongSach += count;
				flag = false;
			} else {
				System.out.println("Vui long nhap so luong sach dung ( so sach >= 0) ");
			}
		} while (flag);
	}

	public void nhapSachMoi(Scanner scan) {
		System.out.print("Tên sách: ");
		this.tenSach = scan.nextLine();
		System.out.print("So Luong sách: ");
		this.soLuongSach = Integer.parseInt(scan.nextLine());
	}

	public void xuatSach() {
		System.out.println("Sach" + this.tenSach + "hien co " + this.soLuongSach + " quyen");
	}
	// 5. Business methods
	public boolean checkSoLuongSach() {
		if(this.getSoLuongSach()>0) {
			System.out.println("So luong sach"+ this.getTenSach()+"dang co la: "+ this.getSoLuongSach());
			return true;
		}
		return false;
	}
}
