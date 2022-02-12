/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jan 24, 2022 (7:27:26 PM)
 * @version 1.0
 */
public class Bai18_MangBaiTapDoiXungDiChuyenPhanTu {

	/**
	 * 
	 */
	public Bai18_MangBaiTapDoiXungDiChuyenPhanTu() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		boolean doiXung = ktDoiXung(a);
		if(doiXung) {
			System.out.println("Mang doi xung...");
		} else {
			System.out.println("Mang khong doi xung");
		}

		a = xoayTrai(a, scan);
		xuatMang(a);
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
	
	public static boolean ktDoiXung(int a[]) {
		for(int i = 0; i<a.length/2 ; i++) {
			if(a[i] != a[a.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] xoayTrai(int a[], Scanner scan) {
		int k;
		int tam;
		
		do {
			System.out.println("Vui long nhap k>0: ");
			k = Integer.parseInt(scan.nextLine());
			
		} while(k<0);
		k = k%a.length;
		for(int i =0; i<k; i++) {
			//Tao bien tam luu tru a[0]
			tam = a[0];
			for(int j = 0; i<a.length-2 ; j++) {
				a[j]= a[j+1];
			}
			a[a.length -1]= tam;
		}
		return a;
	}
}
