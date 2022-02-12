package aptechday1.com.ex1;

import java.util.Scanner;

public class PrimeNumberGenerator 
{
	// business methods
	private static boolean checkPrimeNumber(int number){
		boolean isPrime = true;
		if(number<=0){
			isPrime = false;
		}  
		else {
			double temp = Math.sqrt(number);
			for (int i = 2; i <= temp; i++) {
				if((number%i)==0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	
	public static void generateBasePrimeNumber(Scanner scan) 
	{
		System.out.println("Enter the number of prime you want to print");
		int number = Integer.parseInt(scan.nextLine());
		int count = 0;
		int start = 1;
		do {
			if(checkPrimeNumber(start)) {
				System.out.print(start + "\t");
				count++;
			} 
			start ++;
		} while (count!=number);
	}
	
	public static void generateBasePrimeFrom(Scanner scan){
		System.out.println("Enter the number of prime you want print");
		int number = Integer.parseInt(scan.nextLine());
		System.out.println("Enter the value number less prime number ");
		int lessPrime = Integer.parseInt(scan.nextLine());
		int count=0;
		int start=1;
		do {			
			if (checkPrimeNumber(start)) {
				if(start> lessPrime) {
					System.out.print(start + "\t");
					count ++;
				} 
			} start ++;
		} while (count !=number);	
	}
	
	public static void generateBasePrimeTo(Scanner scan){
		System.out.println("Enter the number of prime you want print");
		int number = Integer.parseInt(scan.nextLine());
		System.out.println("Enter the value number greater prime number ");
		int greatNum = Integer.parseInt(scan.nextLine());
		int count=0;
		int start=1;
		do {			
			if (checkPrimeNumber(start)) {
				if(start < greatNum) {
					System.out.print(start + "\t");
					count ++;
				} 
			} start ++;
		} while (count !=number);
		
	}	
}

	
	
	

