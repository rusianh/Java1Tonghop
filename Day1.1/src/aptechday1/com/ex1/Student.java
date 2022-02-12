package aptechday1.com.ex1;

import java.util.Scanner;

public class Student {
	//	Constants
	final int HEALTH_DEFAULT = 100;
	final int HEALTH_DECREASE = 5;
	final int HEALTH_INCREASE = 10;
	final int HEALTH_BOUNDARY = 60;
	
	
	//	Attribute
	private String name;
	private int age;
	private float health;
	
	//	Getter Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHealth () {
		return age;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
	//Constructor
	public Student() {
		this.health = HEALTH_DEFAULT;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.health = HEALTH_DEFAULT;
	}

	public Student(int HoursLean, int HoursSleep) {
		
	}
	
	//	Input and out put
	public void input(Scanner scan) {
		System.out.println("Name: ");
		this.name = scan.nextLine();
		System.out.println("Age: ");
    //	this.age = Integer.parseInt(scan.nextLine());
		this.age = new Scanner(System.in).nextInt(); //Nhap nhieu dong tranh loi 
	}
	
	//	Method
	public void Learn(int hours) {
		this.health -= hours * HEALTH_DECREASE;
		
		if (this.health <= 60) 
		{
			System.out.println("Your health is " + this.health + "You should sleep");
		} else 
		{
			System.out.println("You have learned" + hours + "hours" + "Your healt is " + this.health);
		}
	}
	
	void Sleep(int hours) {
		this.health += hours * HEALTH_INCREASE;
		
		if (health == 100) {
			System.out.println("You have sleep"+ hours + "hours Your health is " + this.health + "Please leanr");
					} else {
						System.out.println("you have slept " + hours + " hours your health is " + this.health);
					}
	}
	
}