/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Sep 3, 2021 (4:36:00 PM)
 * @version 1.0
 */
public class Bai12_XoaPhanTuMoRong {
	private final static int MIN = -20;
	private final static int MAX = 20;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		a = xoaTaiIndex(a, scan);
		xuatMang(a);

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
	
	public static int[] xoaTaiIndex(int[] a,Scanner scan) {
		int b[] = new int[a.length - 1];
		int index;
		
		do {
			System.out.print("Nhap chi so index muon xóa... =");
			index = Integer.parseInt(scan.nextLine());
		} while(index<0 || index >=a.length);
		// Chép mang
		for(int i = 0, j =0; j<a.length -1 ; i++, j++) {
			if(j == index) {
				j++;
			}
			b[i]= a[j];
		}
		a = b;
		return a;
	}
}
