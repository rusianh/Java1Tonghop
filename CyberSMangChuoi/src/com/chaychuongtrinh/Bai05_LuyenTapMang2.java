/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 4, 2021 (12:01:34 AM)
 * @version 1.0
 */
public class Bai05_LuyenTapMang2 {
	final static int MIN = -100;
	final static int MAX =  100;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[]= taoMang(n);
		xuatMang(a);
		lietKetTrongDoan(scan, a);
		
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap n > 0 va N chan");
			n = Integer.parseInt(scan.nextLine());
		} while (n<1 || n%2 != 0);
		return n;
			
	}
	
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = MIN + (int)(Math.random()*((MAX - MIN) + 1)); 
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
		for(int pt: a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static void lietKetTrongDoan(Scanner scan, int[] a) {
		System.out.println("Nhap gia tri x duoi:");
		int x = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhap gia tri y tren:");
		int y = Integer.parseInt(scan.nextLine());
		
		for(int pt: a) {
			if(pt>=x && pt<= y) {
				System.out.print(pt + "\t");
			}
		}
		System.out.println("\n");
	}
}
