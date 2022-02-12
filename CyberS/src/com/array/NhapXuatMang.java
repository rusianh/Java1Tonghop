package com.array;

import java.util.Scanner;

public class NhapXuatMang {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a = new int[n];

		for (int number : a) {
			System.out.println(number);
		}
	}
}
