/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 8, 2021 (11:17:55 PM)
 * @version 1.0
 */
public class Bai07_TimPhanTuDuongNhoNhat {
	/**
	 * 1.Tao ngau nhien mang mot chieu n do nguoi dung nhap vao, co gia tri chua
	 * trong doan [-100, 100] va xuat mang. 2.Hay liet ke cac vi tri ma gia tri tai
	 * cac vi tri do bang gia tri duong nho nhat trong mang 1 chieu cac so thuc
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1.
		int n = nhapN(scan);
		int[] a = taoMang(n);
		xuatMang(a);
		System.out.println("\n=============================================");

		// 2.
		int index = timChiSoAmDauTienCuaSoMin(a);
		lietKetSoMin(index, a);

	}

	// CONST
	final static int MIN = -100;
	final static int MAX = 100;

	// Attribute
	int indexMin;

	// Business Methods
	private static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap so phan tu mang: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	private static int[] taoMang(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	private static void xuatMang(int[] a) {
		for (int pt : a) {
			System.out.print("\t" + pt);
		}
	}

	private static int timChiSoAmDauTienCuaSoMin(int[] a) {
		int index = -1;
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				if (a[i] < 0) {
					index = i;
					min = a[i];
				}
			} else {
				if (a[i] < 0 && a[i] < min) {
					index = i;
					min = a[i];
				}
			}
		}
		System.out.println("chi so index cua so am dau tien nho nhat: " + index + "\t -  "+ a[index] + "\t a.length: "+ a.length);
		return index;
	}

	private static void lietKetSoMin(int index, int[] a) {
		System.out.println("\n==========================================");
		if (index == -1) {
			System.out.println("Mang khong co gia tri am: ");
		} else {
			//int temp = index;
			for (int i = index; i < a.length; i++) {
				if (i == index || a[index] == a[i]) {
					System.out.print("\t " + a[i] + "\t index: "+ index);
				}
			}
		}
	}
}
