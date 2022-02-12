/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 21, 2021 (3:22:03 PM)
 * @version 1.0
 */
public class Bai10_MangBaiTapThemGiaTriTaiViTriNhap {
	private final static int MIN = -20;
	private final static int MAX = 20;
	/**
	 * Tao ngau nhien mang mot chieu n phan tu do  nguoi dung nhap, Co gia tri chua trong doan [-100,100] va xuat mang.
	 * Them 1 phan tu tai x tai vi tri k do nguoi dung nhap vao
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int[] a= taoMang(n);
		xuatMang(a);
		a = themPhanTu(a, scan);
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
	
	public static int[] themPhanTu(int[] a, Scanner scan) {
		int k;
		do {
			System.out.println("Vui long nhap k = 0 -> " + (a.length-1) );
			k = Integer.parseInt(scan.nextLine());
		} while(k<0 || k>= a.length);
		
		System.out.println("Vui long nhap gia tri phan tu can them: x= ");
		int x = Integer.parseInt(scan.nextLine());
		int[] b = new int[a.length +1]; //Tao mang tam voi kich thuoc tang them 1
		for(int i= 0; i<b.length ; i++) {
			if(i<k) {
				b[i] = a[i]; 
			} else if(i==k) {
				b[i]=x;
			} else if(i>k) {
				b[i]= a[i-1];
			}
		}
		a=b; // gán mang goc bang mang tam
		return a;
	}
}
