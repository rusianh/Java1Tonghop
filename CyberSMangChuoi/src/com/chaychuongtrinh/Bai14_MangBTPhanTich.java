/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Sep 6, 2021 (1:19:06 PM)
 * @version 1.0
 */
public class Bai14_MangBTPhanTich {
	private final static int MIN = -20;
	private final static int MAX = 20;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int[] a = taoMang(n);
		int[] b = a;
		xuatMang(a);
		a = shuffle(a);
		xuatMang(a);
		
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap N Odd > 2: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <=2 || n%2 !=0);
		return n;
	}
	
	public static int[] taoMang(int n) {
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i]= MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	
	public static void xuatMang(int[] a) {
		for(int pt: a) {
			System.out.print(pt + "\t");
		}
		System.out.print("\n");
	}
	
	public static int[] shuffle(int[] a) {
		int[] temp = new int[a.length];
		for(int i= 0; i< a.length/2; i++) {
			temp[2*i] = a[i];
			temp[2*i+1] =  a[a.length/2 +i];
		}
		a= temp;
		return a;
	}
}
