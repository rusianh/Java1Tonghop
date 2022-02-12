package hocgoloidebug;
/*
 * Hoc cach dat Break point
 * Cách debug từng dòng
 */

import java.util.Scanner;

public class ProgramDebug {
	public static void Cong(int a, int b)
	{
		int c = a+b;
		System.out.println("C= "+ c);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap a");
		int a = scan.nextInt();
		System.out.println("nhap b");
		int b = scan.nextInt();
		
		Cong(a,b);
		}

}
