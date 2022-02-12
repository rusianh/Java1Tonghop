/**
 * 
 */
package com.chaychuongtrinh;

import java.util.Scanner;

/**
 * @note [CyberSMangChuoi] 
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 5, 2021 (1:40:18 AM)
 * @version 1.0
 */
public class Bai06_TimPhanTuSoAmDauTien {

	/**
	 * Tao ngau nhien mang mot chieu n phan tu, n Do nguoi dung nhap vao, co gia tri chua trong doan [-100,100] va xuat mang . 
	 * Hay liet ke cac vi tri trong manng 1 chieu cac so thuc ma gia tri tai do bang gia tri am dau tien.
	 * @param args
	 */
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[]  = nhapMang(scan, n);
		xuatMang(a);
		lietKeChiSo(a);
				

	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i  = 0; i < n; i++) {
			System.out.print("a[" +i +"] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1 );
		return n;
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

	public static int timChiSoAmDauTien(int a[]) {
		int index = -1; // chưa tìm thấy
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				index = i;// đã tìm thấy phần tử âm tại chỉ số là i
				break; // thoát khỏi vòng lặp vì đã tìm thấy phần tử âm đầu tiên
			}
		}
		return index;
	}

	public static void lietKeChiSo(int a[]) {
		int index = timChiSoAmDauTien(a);

		if (index == -1) {
			System.out.println("Mảng không có số âm");
		} else {
			System.out.println("Các chỉ số tại đó có giá trị bằng " + a[index]);
			for (int i = index + 1; i < a.length; i++) { // duyệt từ index là số âm đầu tiên
				if (a[i] == a[index]) {
					System.out.println(i + "\t");
				}
			}
		}
	}

}
