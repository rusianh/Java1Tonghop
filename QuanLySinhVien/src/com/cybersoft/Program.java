package com.cybersoft;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// DanhSachSinhVien ds = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);

	}

	private static void inMenu() {
		System.out.println("================================");
		System.out.println("|  Vui long chon thuc hien:    |");
		System.out.println("|  1. Them sinh vien           |");
		System.out.println("|  2. Xuat danh sach sinh vien |");
		System.out.println("|  3. Xuat dssv DTB cao nhat   |");
		System.out.println("|  4. Xuat dssv Yeu            |");
		System.out.println("|  5. Tim SV theo ten          |");
		System.out.println("|  6. Tim SV theo ma           |");
		System.out.println("|  7. Xoa SV theo ma           |");
		System.out.println("|  0. Thoat                    |");
		System.out.println("================================");
	}

	private static void doMenu(TruongHoc truong) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.print("Moi chon:");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xepLoai();
				//truong.xuat();
				truong.xuatTheoFormat(truong.getDssvToanTruong().getListSV());
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timDSSVCoDTBCaoNhat();
				//truong.xuatHelper(list);
				truong.xuatTheoFormat(list);
//				for (SinhVien sv1 : list) {
//					sv1.xuat();
//				}
				break;
			case 4:
				ArrayList<SinhVien> listYeu = truong.lietKeDSSVYeu();
				//truong.xuatHelper(listYeu);
				truong.xuatTheoFormat(listYeu);
//				for(SinhVien sv1:listYeu) {
//					sv1.xuat();
//				}
				break;
			case 5:
				System.out.println("Vui long nhap sinh vien can tim");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listTen = truong.timSinhVienTheoTen(ten);
				//truong.xuatHelper(listTen);
				truong.xuatTheoFormat(listTen);
				break;
			case 6:
				System.out.println("Vui long nhap ma sinh vien can tim");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timSVTheoMa(ma);
				if (svFound != null) {
					svFound.xuat();
				} else {
					System.out.println("Khong co Sinh Vien co Ma: " + ma);
				}
				break;
			case 7:
				System.out.println("Vui long nhap ma sinh vien can xoa");
				int maXoa = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoaSinhVienTheoMa(maXoa);
				if(deleted) {
					System.out.println("Xoa thanh cong!!!");
				} else {
					System.out.println("Chua duoc xoa, hoac ma khong co trong danh sach!!!");
				}
				break;
			case 0:
				flag = false;
				break;

			}
		} while (flag);
	}
}

// Attribute
// Get, set methods
// Constructor methods
// Input, output methods
// Business methods