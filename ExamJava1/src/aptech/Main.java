/**
 * 
 */
package aptech;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @note [ExamJava1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 13, 2021 (6:03:02 PM)
 * @version 1.0
 */
public class Main {
	static ArrayList<Person> list = new ArrayList<Person>();

	public static void main(String[] args) {

		// insert Array

		// Taodummy Data
		dummyData();

		// Xuat list
		list.forEach(p -> p.display());
		// =================================
		System.out.print("\n==============================");
		System.out.print("\n\n sort list by age: ");
		 sortByAge(list);

	}

	// Business methods
	

	public static void sortByAge(ArrayList<Person> list) {
		list.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(p -> p.display());
	}

	public static void dummyData() {
		// Person
		Person person;
		person = new Person("Person1", 22);
		list.add(person);
		person = new Person("Person2", 24);
		list.add(person);
		person = new Person("Person3", 18);
		list.add(person);

		// Employ
		Employee employee;
		employee = new Employee("emp1", 17, 17);
		employee.increaseSalary(10);
		employee.increaseSalary(1.5);
		list.add(employee);

		employee = new Employee("emp2", 17, 20);
		employee.increaseSalary(11);
		employee.increaseSalary(1.6);
		list.add(employee);

		employee = new Employee("emp3", 17, 20);
		employee.increaseSalary(20);
		employee.increaseSalary(1.6);
		list.add(employee);

		// Manager
		Manager manager;
		manager = new Manager("Manager1", 20, 30);
		list.add(manager);
		manager = new Manager("Manager2", 30, 40);
		list.add(manager);

	}
}
