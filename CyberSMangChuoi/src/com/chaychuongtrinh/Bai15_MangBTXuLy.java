/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Sep 14, 2021 (2:14:59 PM)
 * @version 1.0
 */
public class Bai15_MangBTXuLy {
	private final static int MIN = -20;
	private final static int MAX = 20;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int[] a = taoMang(n);
		int[] b = a;
		xuatMang(a);
		a = shuffle(a);
		xuatMang(a);
		
		b= shuffle(a);
		int count = countShuffle(a, b);
		System.out.println("Can " + count + " lan de hoan doi ve mang ban dau ");
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
	
	public static boolean isEqual(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int countShuffle(int[] a, int[] b) {
		int count =0;
		do {
			b = shuffle(b);
			xuatMang(b);
			count++;
		} while(!isEqual(a, b));
		return count;
	}
}
