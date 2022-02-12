/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jan 8, 2022 (2:02:40 AM)
 * @version 1.0
 */
public class Bai17_MangBaiTapThongKe {

	/**
	 * Tao mang mot chieu n phan tu nguyen co gia tri nhap tu ban phim.
	 * Thong ke so lan xuat hien cua cac phan tu trong mang
	 * => Dung ky thuat mang tam
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[]= nhapMang(scan, n);
		xuatMang(a);
		inSoLuongPhanTuGiongNhau(a);

	}
	
	public static int[] nhapMang(Scanner scan, int n) {
		int a[]= new int[n];
		for(int i =0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i]= Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap n: ");
			n = Integer.parseInt(scan.nextLine());
		} while(n<1);
		return n;
	}
	
	public static void xuatMang(int a[]) {
		for(int pt:a) {
			System.out.println(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static int[] demPhanTu(int a[]) {
		int b[] = new int[a.length];
		for (int i= 0 ; i< a.length ; i++) {
			b[i]= 0;
			for(int j = 0; j< a.length ; j++) {
				if(a[i]== a[j]) {
					if( j<i) {
						break;
					} else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}
	
	public static void inSoLuongPhanTuGiongNhau(int a[]) {
		int b[] = demPhanTu(a);
		for( int i =0; i< b.length ; i++) {
			if(b[i] != 0) {
				System.out.println(a[i] + "[" + b[i] + "]" + "\t");
			}
		}
	}
}
