package com.cybersoft;

import java.util.Scanner;

/**
 * Quan ly nghiep vu lien quan den sinh vien
 * 
 * @author Admin Date: 7/2/21
 */
public class SinhVien {
	// Attribute
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	// Get, set methods
	public String getTenSV() {
		return this.tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return this.maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return this.diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	// Constructor methods
	public SinhVien() {

	}

	/**
	 * @param tenSV
	 * @param maSV
	 * @param diemToan
	 * @param diemLy
	 * @param diemHoa
	 */
	public SinhVien(String tenSV, int maSV, float diemToan, float diemLy, float diemHoa) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// Input, output methods
	public void nhap(Scanner scan) {
		System.out.println("Nhap ten:");
		this.tenSV = scan.nextLine();

		System.out.println("Nhap ma:");
		this.maSV = Integer.parseInt(scan.nextLine());

		System.out.println("Nhap toan");
		this.diemToan = Float.parseFloat(scan.nextLine());

		System.out.println("Nhap ly");
		this.diemLy = Float.parseFloat(scan.nextLine());

		System.out.println("Nhap hoa");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Sinh Vien - Ma" + this.maSV + "\t Ten: " + this.tenSV + "\t Toan: " + this.diemToan
				+ "\t Ly: " + this.diemLy + "\t Hoa: " + this.diemHoa + "\t DTB: " + this.diemTB + "\t Xep loai: "
				+ this.xepLoai);

	}

	// Business methods
	public void tinhDTB() {
		// TODO Auto-generated method stub
		this.diemTB = (this.diemToan + this.diemHoa + this.diemLy) / 3;
	}

	public void xepLoai() {
		if (this.diemTB >= 9) {
			this.xepLoai = "Xuat Sac";
		} else if (this.diemTB >= 8) {
			this.xepLoai = "Gioi";
		} else if (this.diemTB >= 7) {
			this.xepLoai = "Kha";
		} else if (this.diemTB >= 6) {
			this.xepLoai = "TB - Kha";
		} else {
			this.xepLoai = "Yeu";
		}
	}

	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddRight, " ") + String.format(paddRight, num) + "|";
	}

	private String formatTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}

	public void xuatRowFormat() {
		String text;
		text = formatNumCell(this.maSV);
		text += formatTextCell(this.tenSV) + "|";
		text += formatNumCell(this.diemToan);
		text += formatNumCell(this.diemLy);
		text += formatNumCell(this.diemHoa);

		double dtb = Math.round(this.diemTB * 100.0) / 100.0; // lam tron den 2 chu so phan thap phan
		text += formatNumCell(dtb);
		text += formatTextCell(this.xepLoai);
		System.out.println(text);
	}
}
