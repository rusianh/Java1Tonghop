/**
 * 
 */
package aptech;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @note [ExamJava1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 13, 2021 (5:15:52 PM)
 * @version 1.0
 */
public class Person {

	//1. Attribute
	private String name;
	private int age;
	//2. Get, Set methods
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//3. Constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//4. Output, input methods
	public void display() {
		System.out.print("\nName: " + this.name + "\t Age: " + this.age);
	}
	
	public void input(Scanner scan) {
		System.out.print("Enter name person: ");
		this.name = scan.nextLine();
		System.out.print("\n Enter age person: ");
		this.age = Integer.parseInt(scan.nextLine());
		System.out.println("Enter Successfuly!!!");
	}
	//5. Business methods
	

}

//1. Attribute
//2. Get, Set methods
//3. Constructor
//4. Output, input methods
//5. Business methods