/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Sep 4, 2021 (1:06:28 PM)
 * @version 1.0
 */
public class Bai13_DemPhanTu {
	private final static int MIN = -20;
	private final static int MAX = 20;
	/**
	 * @param args
	 * Tao ngau nhien mang
	 * Dem so phan tu chia het cho 4, va có chu so tan cung la 6
	 * Thay cac phan tu le bang 2 lan gia tri cua no
	 * => can than khi lay phep chia du so Am
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int[] a = taoMang(n);
		xuatMang(a);
		
		//Dem pt thoa man dkien
		int dem = demPTThoaDK(a);
		System.out.println("Có "+ dem + " pt chia het cho 4 va tan cung bang 6");
		
		// Thay pt gap doi
		System.out.println("Mang sau khi thay pt gap doi: ");
		a = gapDoiPTLe(a);
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
	
	public static int demPTThoaDK(int[] a) {
		int dem = 0;
		for(int pt: a) {
			if(pt%4==0 && Math.abs(pt)%10 ==6) {
				dem++;
			}
		}
		return dem;
	}
	
	public static int[] gapDoiPTLe(int[] a) {
//		for(int pt:a) {
//			if(pt%2!=0) {
//				pt = pt*2;
//			}
//		}
		// foreach khong cap nhat phai dung for i
		
		for(int i= 0; i< a.length; i++) {
			if(a[i]%2!= 0) {
				a[i]*= 2;
			}
		}
		return a;
	}
}




