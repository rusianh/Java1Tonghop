/**
 * 
 */
package aptech;

/**
 * @note [ExamJava1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 13, 2021 (5:26:07 PM)
 * @version 1.0
 */
public class Employee extends Person {
	//1. Attribute
	private double salary;
	//2. Get, Set methods
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//3. Constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 * @param age
	 */
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;

	}
	//4. Output, input methods
	@Override
	public void display() {
		super.display();
		System.out.print("\t Salary is: " + this.salary);
	}
	
	//5. Business methods
	public void increaseSalary(int x) {
		this.salary += x;
	}
	
	public void increaseSalary(double x) {
		this.salary *= x;
	}
	
}
