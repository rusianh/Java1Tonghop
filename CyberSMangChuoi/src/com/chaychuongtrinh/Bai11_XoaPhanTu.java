/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 25, 2021 (2:28:10 PM)
 * @version 1.0
 */
public class Bai11_XoaPhanTu {

	/**
	 * @param args
	 * Xoa tat ca phan tu trung x, x do nguoi dung nhap vao
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int[] a = taoMang(scan,n);
		xuatMang(a);
		
		System.out.println("Nhap gia tri x can xoa");
		int x = Integer.parseInt(scan.nextLine());
		a = xoatTatCaPhanTuGiaTriX(a, x);
		xuatMang(a);
		
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap N >= 1");
			n = Integer.parseInt(scan.nextLine());
		} while(n<1);
		return n;
	}
	
	public static int[] taoMang(Scanner scan, int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap gia tri: a" + i );
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static void xuatMang(int[] a) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static int demPhanTu(int[] a,int x) {
		int dem = 0;
		for(int pt: a) {
			if(pt==x) {
				dem++;
			}
		}
		return dem;
	}
	
	public static int[] xoatTatCaPhanTuGiaTriX(int[] a, int x) {
		int dem = demPhanTu(a,x);
		if(dem >0) {
			int[] b = new int[a.length - dem];
			int j = 0;
			for(int i =0; i<a.length; i++) {
				if(a[i] != x) {
					b[j++] = a [i];
					//j++;
				}
				a = b;
			}
		} else {
			System.out.println("Khong co phan tu ");
		}
		return a;
	}
}
