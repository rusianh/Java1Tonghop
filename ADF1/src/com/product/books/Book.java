/**
 * 
 */
package com.product.books;

import java.util.Scanner;

import com.product.Product;

/**
 * @note [ADF1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 18, 2021 (11:09:57 AM)
 * @version 1.0
 */
public class Book extends Product {
	//1. Attribute
	private  String type;
	private String publisher;
	//2. Get set methods
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	//3. Constructor
	public Book() {
	
	}
	
	/**
	 * @param proId
	 * @param proName
	 * @param year
	 * @param price
	 */
	public Book(String proId, String proName, int year, float price, String type, String publisher) {
		super(proId, proName, year, price);
		this.type = type;
		this.publisher = publisher;
	}
	//4. Input, output 
	@Override
	public void input(Scanner scan) {
		System.out.print("Enter Id Book: ");
		this.proId = scan.nextLine();
		System.out.print("Enter Name Book: ");
		this.proName = scan.nextLine();
		System.out.print("Enter Year Book: ");
		this.year = Integer.parseInt(scan.nextLine());
		System.out.print("Enter Price Book: ");
		this.price = Float.parseFloat(scan.nextLine());
		System.out.print("Enter Type Book: ");
		this.type = scan.nextLine();
		System.out.print("Enter Publisher Book: ");
		this.publisher = scan.nextLine();
	}
	
	@Override
	public void display() {
		System.out.println("Book Information: " );
		System.out.println("Id: " + this.proId + "\t Name: " + this.proName + "\t Years: " + this.year + "\t Price: " + this.price
				+ "\t Type: " + this.type + "\t Publisher: " + this.publisher);
	}
	//5. Business methods

}
