package com.quanlychuyenxe;

import java.util.Scanner;

/**
 * @note Quan ly nghiep vu lien quan den chuyen xe noi thanh
 * @author Admin
 *
 */
public class ChuyenXeNoiThanh extends ChuyenXe {
	
	//1. Attribute
	protected String soTuyen;
	protected float soKM;
	//2. Set, get
	public String getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	public float getSoKM() {
		return soKM;
	}
	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}
	//3. Constructor
	public ChuyenXeNoiThanh()	{
		super();
	}
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenLaiXe, String soXe, float doanhThu, 
			String soTuyen, float soKM) {
		super(maSoChuyen, hoTenLaiXe, soXe, doanhThu);
		this.soKM = soKM;
		this.soTuyen = soTuyen;
		
	}
	//4. Input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("So tuyen: ");
		this.soTuyen =  scan.nextLine();
		System.out.println("So KM: ");
		this.soKM = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t So tuyen: "+ this.soTuyen+ "\t so KM: " + this.soKM);
	}
	//5. Business methods
}
