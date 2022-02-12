package aptechday1.com.ex1;

import java.util.Scanner;

/*
 * Create a student class with name, age, health. (health default = 100)
Create: 2 functions learn and sleep
Function Learn :
Each hour to learn health will decrease 5. if health &lt;= 60 print your health is …. You should
sleep. else print you have learned .. hours your health is ...
Function Sleep :
Each sleeping hour, health will increase by 10.
print you have slept.. hours your health is …. if health ==100 you sleep, please learn!
Create a menu with the option
1. Input student info
2. Let student learn (input learning hours)
3. Let student sleep (input sleeping hours)
4. Exit
 */
public class Program {
	public static void main(String[] args) {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		//	MENU
		do {
			//	Chose menu
			inMenu();
			System.out.println("Choose the menu >>>>");
			String key = sc.nextLine();
			
			//	Menu option
		switch (key) {
			case "1":
				student.input(sc);
				System.out.println(">>>>>> Successfully ^^ >>>>>>>>>");
				break;
			case "2":
				if (student.getName() != null) {
					System.out.println("Insert hours: ");
					System.out.println("line42");
					int hours = new Scanner(System.in).nextInt();
					student.Learn(hours);
				} else {
					System.out.println("No infomation of student");
				}
				break;			
			case "3":
				if (student.getName() != null) {
					System.out.println("Insert hours: ");
					int hours = new Scanner(System.in).nextInt();
					student.Sleep(hours);
				} else {
					System.out.println("No infomation of student");
				}
				break;		
			case "4":
				flag = false;
				break;
				
			}
			
		} while (flag);
						
	
	}
	
	private static void inMenu() {
        System.out.println("1. Input student info");
        System.out.println("2. Let student learn (input learning hours)");
        System.out.println("3. Let student sleep (input sleeping hours)");
        System.out.println("4. Exit");
    }
}

 