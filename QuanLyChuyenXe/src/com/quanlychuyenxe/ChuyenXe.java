package com.quanlychuyenxe;

import java.util.Scanner;

/**
 * @Note Lop cha quan lý chuyen xe
 * @author Admin
 * @since
 * @version
 */
public class ChuyenXe {
	//1. Attribute
	protected String maSoChuyen;
	protected String hoTenLaiXe;
	protected String soXe;
	protected float doanhThu;
	//2. Get, set
	public String getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoTenLaiXe() {
		return hoTenLaiXe;
	}
	public void setHoTenLaiXe(String hoTenLaiXe) {
		this.hoTenLaiXe = hoTenLaiXe;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public float getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	//3. Constructor
	public ChuyenXe() {
		
	}
	/**
	 * @param maSoChuyen
	 * @param hoTenLaiXe
	 * @param soXe
	 * @param doanhThu
	 */
	public ChuyenXe(String maSoChuyen, String hoTenLaiXe, String soXe, float doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.hoTenLaiXe = hoTenLaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	
	//4. Input, Output
	public void nhap(Scanner scan) {
		System.out.println("Nhap ma so chuyen");
		this.maSoChuyen = scan.nextLine();
		System.out.println("Nhap ho ten tai xe");
		this.hoTenLaiXe = scan.nextLine();
		System.out.println("Nhap so xe");
		this.soXe = scan.nextLine();
		System.out.println("Nhap ma doanh thu");
		this.doanhThu = Float.parseFloat(scan.nextLine());
		
	}
	
	public void xuat() {
		System.out.print("Ma so chuyen:" + this.maSoChuyen
							+"\t Ho ten tai xe: "+ this.hoTenLaiXe
							+"\t So xe: "+ this.soXe
							+"\t doanh thu: "+ this.doanhThu);
	}
	//5. Business methods
	
}
