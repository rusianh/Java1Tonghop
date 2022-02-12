/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 11, 2021 (6:56:25 PM)
 * @version 1.0
 */
public class Bai08_TimChuSoLeDauTien {

	/**
	 * Tao ngau nhien mang mot chieu n phan tu do nguoi dung nhap, co gia tri trong dong [-1000,1000]
	 * Liet ke cac gia tri trong mang 1 chieu cac so nguyen co chu so dau tien le.
	 * @param args
	 */
	public static void main(String[] args) {
		boolean test = kiemTraChuSoDauTien(3); 
		System.out.println(test);
	}
	/**
	 * Giai thuat
	 * 1.Nhap so phan tu tao
	 * 2.Tao mang ngau nhien
	 * 3.Ham tim chu so le dau tien => tach cac chu so 
	 * 4.Liet ke cac gia tri trong mang chi dinh
	 */
	//1. Attribute
	final static int MIN = -1000;
	final static int MAX = 1000;
	
	//2. Get, set methods
	//3. Constructor
	//4. Input, output methods
	//5. Business methods
	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i  = 0; i < n; i++) {
			System.out.print("a[" +i +"] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static boolean kiemTraChuSoDauTien(int x) {
		while(x >=10) {
			x/=10;
		}
		if(x % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void lietKe(int[] a) {
		for(int pt: a) {
			if(kiemTraChuSoDauTien(pt)) {
				System.out.print("\t "+ pt);
			}
		}
	}
}
