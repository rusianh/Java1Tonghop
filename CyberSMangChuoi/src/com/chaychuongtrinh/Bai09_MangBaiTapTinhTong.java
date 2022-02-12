/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 20, 2021 (2:02:06 PM)
 * @version 1.0
 */
public class Bai09_MangBaiTapTinhTong {
	private final static int MIN = -10;
	private final static int MAX = 10;

	/**
	 * Tao ngau nhien mang mot chieu n phan tu - n do nguoi dung nhap vao, co gia
	 * tri chua doan [-1000,1000] va xuat mang. Tinh Tong các gia tri lon hon gia
	 * tri dung lien truoc no trong mang 1 chieu cac so thuc
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		int tong = tinhTongLienKe(a);
		System.out.println(tong);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap N > 0: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int[] a) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static int tinhTongLienKe(int[] a) {
		int tong = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				tong += a[i];
			}
		}
		return tong;
	}
}
