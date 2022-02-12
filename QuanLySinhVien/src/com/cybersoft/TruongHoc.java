package com.cybersoft;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @mucdic Quan ly toan bo nghiep vu truong hoc
 * @author Admin
 * @since 20/04/21
 */
public class TruongHoc {
	// 1. Attribute
	private DanhSachSinhVien dssvToanTruong;

	// 2. Get, set methods
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}

	// 3. Constructor methods
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSinhVien();

	}

	// 4. Input, output methods
	public void themSinhVien(SinhVien sv) {
		this.dssvToanTruong.themSinhVien(sv);
	}

	public void nhap() {
		SinhVien sv = new SinhVien("lan", 1, 9.3f, 9, 9);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Hung", 2, 4.3f, 3, 5.3f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Toan", 3, 4.3f, 2, 3.3f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Hung", 4, 9.3f, 10, 7.3f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Huy", 5, 6.3f, 7, 7.3f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Lan", 6, 7.3f, 6, 7.8f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Thuy", 7, 7.3f, 8, 7.5f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Mai", 8, 9.3f, 10, 8.3f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Nga", 9, 5.3f, 6, 7.3f);
		this.dssvToanTruong.themSinhVien(sv);

		sv = new SinhVien("Tuan", 10, 6.3f, 10, 4.3f);
		this.dssvToanTruong.themSinhVien(sv);
	}

	public void xuat() {
		this.dssvToanTruong.xuat();
	}

	// 5. Business methods
	public void tinhDTB() {
		this.dssvToanTruong.tinhDTB();
	}

	public void xepLoai() {
		this.dssvToanTruong.xepLoai();
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {
		return this.dssvToanTruong.timDSSVCoDTBCaoNhat();
	}

	public ArrayList<SinhVien> lietKeDSSVYeu() {

		return this.dssvToanTruong.lietKeDSSVYeu();

	}

	public void xuatHelper(ArrayList<SinhVien> list) {
		for (SinhVien sv : list) {
			sv.xuat();
		}
	}

	public ArrayList<SinhVien> timSinhVienTheoTen(String tenSV) {
//		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
//		for(SinhVien sv: this.dssvToanTruong.getListSV()) {
//			if(sv.getTenSV().equalsIgnoreCase(tenSV)) {
//				list.add(sv);
//			}
//		}
		return this.dssvToanTruong.timSVTheoTen(tenSV);
	}

	public SinhVien timSVTheoMa(int ma) {
		return this.dssvToanTruong.timSVTheoMa(ma);
	}

	public boolean xoaSinhVienTheoMa(int ma) {
		return this.dssvToanTruong.xoaSVTheoMa(ma);
	}

	private void xuatLine() {
		System.out.println("============================================================================================================");
	}

	private String formatCell(String paddLeft, String title, String paddRight) {
		return String.format(paddLeft, " ") + title + String.format(paddLeft, " ");
	}

	private void xuatRowHeader() {
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";

		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1)+ "|";
		text += formatCell(paddString2, "Ma SV", paddString2)+ "|";
		text += formatCell(paddString3, "Ten SV", paddString2)+ "|";
		text += formatCell(paddString3, "Toan", paddString2)+ "|";
		text += formatCell(paddString3, "Ly", paddString4)+ "|";
		text += formatCell(paddString3, "Hoa", paddString3)+ "|";
		text += formatCell(paddString3, "DTB", paddString3)+ "|";
		text += formatCell(paddString2, "Xep Loai", paddString1) + "||";
		System.out.println(text);
		xuatLine();

	}

	private void xuatCellThuTu(int i) {
		String paddLeft = "%3s";
		String paddRight = "%-6s";
		String text = "||" + String.format(paddLeft, " ") + String.format(paddRight, "" + i) + "|";
		System.out.print(text);
	}
	
	public void xuatTheoFormat(ArrayList<SinhVien> list) {
		xuatRowHeader();
		int i = 0;
		for(SinhVien sv: list) {
			xuatCellThuTu(i);
			sv.xuatRowFormat();
			i++;
		}
	}
}
