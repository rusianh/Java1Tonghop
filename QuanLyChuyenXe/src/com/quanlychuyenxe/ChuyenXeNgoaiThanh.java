package com.quanlychuyenxe;

import java.util.Scanner;

/**
 * @note Quang ly nghiep vu lien quan chuyen xe ngoai thanh
 * @author Admin
 *
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
	//1. Attribute
	protected String noiDen;
	protected float soNgayDiDuoc;
	//2. Get, set
	
	/**
	 * @return the noiDen
	 */
	public String getNoiDen() {
		return noiDen;
	}

	/**
	 * @param noiDen the noiDen to set
	 */
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	/**
	 * @return the soNgayDiDuoc
	 */
	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	/**
	 * @param soNgayDiDuoc the soNgayDiDuoc to set
	 */
	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	//3. Constuctor
	public ChuyenXeNgoaiThanh() {
		super();
	}

	/**
	 * @param maSoChuyen
	 * @param hoTenLaiXe
	 * @param soXe
	 * @param doanhThu
	 */
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenLaiXe, String soXe, float doanhThu, 
			String noiDen, float soNgayDiDuoc) {
		super(maSoChuyen, hoTenLaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	//4. Output, input
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhap noi den: ");
		this.noiDen = scan.nextLine();
		System.out.println("Nhap so ngay di duoc");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Noi den: "+ this.noiDen + "\t So ngay di duoc: "+ this.soNgayDiDuoc);
	}
	//5. Business methods
}
