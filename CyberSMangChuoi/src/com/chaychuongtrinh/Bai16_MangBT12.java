/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Sep 20, 2021 (12:21:38 AM)
 * @version 1.0
 */
public class Bai16_MangBT12 {
	private final static int MIN = -100;
	private final static int MAX = 100;

	/**
	 * @param args Tao ngau nhien mang mot chieu n phan tu nguyen co gia tri chua
	 *             trog doan [-100,100] va xuat mang Xuat ra man hinh "run" tăng dài
	 *             nhat tim thay đau tien
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		printMaxRun(a);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap N");
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
	
	public static void printMaxRun(int[] a) {
		int head = 0;
		int maxHead = 0;
		int maxLen = 0;
		do {
			int i;
			int len = 1;
			for(i = head;i< a.length-1 && a[i] < a[i+1]; i++ ) {
				len++;
			}
			if(len > maxLen) {
				maxLen = len;
				maxHead =  head;
			}
			head = i +1;
		}while(head < a.length);
		
		System.out.println("Run dai nhat la: ");
		for(int i = 0; i<maxLen; i++) {
			System.out.print(a[maxHead+i] + "\t");
		}
	}
}
//1. Attribute
//2. Get set
//3. Constructor
//4. Input output
//5. Busineess methods