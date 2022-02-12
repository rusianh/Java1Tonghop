/**
 * 
 */
package com.product.computers;

import java.util.Scanner;

import com.product.Product;

/**
 * @note [ADF1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 18, 2021 (10:52:06 AM)
 * @version 1.0
 */
public class Computer extends Product {
	//1. Attribute
	private String speed;
	private String producer;
	//2. Get set methods
	
	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	//3. Constructor
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param proId
	 * @param proName
	 * @param year
	 * @param price
	 * @param speed
	 * @param producer
	 */
	public Computer(String proId, String proName, int year, float price, String speed, String producer) {
		super(proId, proName, year, price);
		this.speed = speed;
		this.producer = producer;
	}

	//4. Input, output 
	@Override
	public void input(Scanner scan) {
		System.out.print("Enter Id Computer: ");
		this.proId = scan.nextLine();
		System.out.print("Enter Name Computer: ");
		this.proName = scan.nextLine();
		System.out.print("Enter Year Computer: ");
		this.year = Integer.parseInt(scan.nextLine());
		System.out.print("Enter Price Computer: ");
		this.price = Float.parseFloat(scan.nextLine());
		System.out.print("Enter Speed Computer: ");
		this.speed = scan.nextLine();
		System.out.print("Enter Producer Computer: ");
		this.producer = scan.nextLine();
	}
	
	@Override
	public void display() {
		System.out.println("Computer Information: " );
		System.out.println("Id: " + this.proId + "\t Name: " + this.proName + "\t Years: " + this.year + "\t Price: " + this.price
				+ "\t Speed: " + this.speed + "\t Producer: " + this.producer);
	}
	
}
	//5. Business methods

