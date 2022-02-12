/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 29, 2021 (1:58:00 PM)
 * @version 1.0
 */
public class Program {

	/**
	 * Chay chuong trih
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		nhapMang(3, scan);
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		System.out.println("Nhap so phan tu mang 1 chieu: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu a."+ i );
			a[i] = Integer.parseInt(scan.nextLine());
		}
		System.out.println(a[1]);
		return a;
	}
	
	public void xuatMang(int mang[]) {
		System.out.println("");
	}
}
