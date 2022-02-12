/**
 * 
 */
package com.product;

import java.util.Scanner;

/**
 * @note [ADF1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 18, 2021 (10:44:26 AM)
 * @version 1.0
 */
public abstract class  Product {
	//1. Attribute
	protected String proId;
	protected String proName;
	protected int year;
	protected float price;
	//2. Get set methods
	
	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//3. Constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param proId
	 * @param proName
	 * @param year
	 * @param price
	 */
	public Product(String proId, String proName, int year, float price) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.year = year;
		this.price = price;
	}
	
	//4. Input, output 
	public abstract void input(Scanner scan);
	public abstract void display();
	//5. Business methods

}
//1. Attribute
//2. Get set methods
//3. Constructor
//4. Input, output 
//5. Business methods