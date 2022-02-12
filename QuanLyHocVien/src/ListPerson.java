import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLyHocVien] quang li nghiep vu cho danh sach
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021 (4:18:56 PM)
 * @version 1.0
 */
public class ListPerson {
	// 1. Attribute
	private ArrayList<Person> listPerson;
	// 2. Get, set methods

	public ArrayList<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(ArrayList<Person> listPerson) {
		this.listPerson = listPerson;
	}

	// 3. Constructor
	public ListPerson() {
		listPerson = new ArrayList<Person>();
	}

	// 4. Input, output methods
	private void inMenu() {
		System.out.println("Vui long chon menu");
		System.out.println(" 1. Nhap Student");
		System.out.println(" 2. Nhap Employee");
		System.out.println(" 3. Nhap Customer");
		System.out.println(" 0. Thoat");
	}

	public void nhap(Scanner scan) {
		boolean flag = true;
		do {
			inMenu();
			int chon = Integer.parseInt(scan.nextLine());
			Person person;
			switch (chon) {
			case 1:
				person = new Students();
				person.nhap(scan);
				this.listPerson.add(person);
				break;
			case 2:
				person = new Employee();
				person.nhap(scan);
				this.listPerson.add(person);
				break;
			case 3:
				person = new Customer();
				person.nhap(scan);
				this.listPerson.add(person);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhap 0-3");
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (Person person : this.listPerson) {
			person.xuat();
		}
	}

	// 5. Business methods
	private void interchangeSort(ArrayList<Person> listPerson) {
		int i, j;
		for (i = 0; i < listPerson.size() - 1; i++) {
			for (j = i + 1; j < listPerson.size(); j++) {
				Person personI = listPerson.get(i);
				Person personJ = listPerson.get(j);
				if(personJ.getHoTen().compareToIgnoreCase(personJ.getHoTen())<0) {
					Collections.swap(listPerson, i, j); //hoan vi doi cho dung colection
				}

			}
		}
	}
	
	public void sortName() {
		interchangeSort(this.listPerson);
	}

	public void dummyData() {
		// TODO Auto-generated method stub
		
	}
}
