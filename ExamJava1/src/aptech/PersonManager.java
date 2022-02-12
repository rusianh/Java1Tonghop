package aptech;

import java.util.Scanner;

public class PersonManager {
	//1. Attribute
	//2. Get, Set methods
	//3. Constructor
	Person[] listPerson;

	public PersonManager() {
		
	}
	//4. Output, input methods
	
	//5. Business methods
	public  void setPerson(Scanner scan) {
		
		System.out.println("Nhap so phan tu mang Person");
		try {
			int n = Integer.parseInt(scan.nextLine());
			listPerson = new Person[n];
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Create method getPersons() to display all Persons
	public  void getPerson(Person[] list) {
		for(Person pt: list) {
			pt.display();
		}
	}
	
	public void findPerson(Scanner scan) {
		try {
			System.out.println("Enter index to search person: ");
			int index = Integer.parseInt(scan.nextLine());
			this.listPerson[index].display();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
