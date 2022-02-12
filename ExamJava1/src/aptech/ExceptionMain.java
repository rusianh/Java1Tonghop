/**
 * 
 */
package aptech;

import java.util.Scanner;

/**
 * @note [ExamJava1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 13, 2021 (7:15:12 PM)
 * @version 1.0
 */
public class ExceptionMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PersonManager pM = new PersonManager();
		doMenu(scan, pM);

	}
	public static void doMenu(Scanner scan, PersonManager pM) {
		boolean flag = true;
		do {
			System.out.println("1. Input person");
			System.out.println("2. Find person");
			System.out.println("3. Exit");
			System.out.print("Moi ban lua chon: ");
			String chon = scan.nextLine();
			switch (chon) {
			case "1":
				pM.setPerson(scan);
				break;
			case "2":
				pM.findPerson(scan);
				break;
			case "3":
				flag = false;
				break;
			}
		} while (flag);
	}
}
