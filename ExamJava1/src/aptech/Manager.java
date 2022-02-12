/**
 * 
 */
package aptech;

/**
 * @note [ExamJava1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 13, 2021 (5:36:35 PM)
 * @version 1.0
 */
public class Manager extends Employee implements Tax {
	//1. Attribute
	private double bonus;
	private double tax;
	private double totalBonus;
	//2. Get, Set methods
	//3. Constructor
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 * @param age
	 * @param salary
	 */
	public Manager(String name, int age, double salary) {
		super(name, age, salary);
		this.bonus = this.getSalary() * 0.2;
		this.tax = this.getSalary() * 0.1;
		this.setSalary(calculateTax());
		totalBonus();
	}
	//4. Output, input methods
	//5. Business methods
	
	@Override
	public double calculateTax() {
		double salary;
		salary = this.getSalary() + bonus - tax;
		return salary;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.print("\tBonus values of Manager: " + this.totalBonus);
	}
	
	public void totalBonus() {
		this.totalBonus = bonus - tax;
	}
}
