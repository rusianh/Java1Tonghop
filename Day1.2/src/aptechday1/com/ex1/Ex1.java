package aptechday1.com.ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) 
	{
		PrimeNumberGenerator priNum = new PrimeNumberGenerator();
		Scanner scan = new Scanner(System.in);
		doMenu(scan, priNum);
		
	}
	
	private static void inMenu()
	{
		System.out.println("1.Generate Base Prime >>>");
		System.out.println("2.Generate Base Prime From >>>");
		System.out.println("3.Generate Base Prime To >>>");
		System.out.println("4.Exit");
		
	}
	
	private static void doMenu(Scanner scan,PrimeNumberGenerator priNum )
	{
		boolean flag = true;
		do {
			System.out.println("==========================");
			inMenu();
			System.out.println("Choose");
			String choose = scan.nextLine();
			switch (choose) {
			case "1":
				priNum.generateBasePrimeNumber(scan);
				break;
			case "2":
				priNum.generateBasePrimeFrom(scan);
				break;
			case "3":
				priNum.generateBasePrimeTo(scan);
				break;
			case "4":
				flag = false;
				break;
			default:
				System.out.println("Pls try insert correct!");
				break;
			}
			
		} while (flag);
	}
}


