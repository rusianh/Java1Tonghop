/**
 * 
 */
package com.product.test;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.product.computers.Computer;
import com.product.Product;
import com.product.books.Book;
import java.util.stream.Collectors;

/**
 * @note [ADF1]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 18, 2021 (11:16:03 AM)
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		Product product;
		List<Computer> listComputer = new ArrayList<>();
		List<Book> listBook = new ArrayList<>();
		do {
			System.out.println("Please select: ");
			nameMenu();
			String chon = scan.nextLine();
			switch (chon) {
			case "1":
				product = new Computer();
				product.input(scan);
				listComputer.add((Computer) product);
				break;
			case "2":
				product = new Book();
                product.input(scan);
                listBook.add((Book) product);
                break;
			case "3":
				Comparator<Computer> comparatorCom  = (p1, p2) -> (int) (p1.getPrice() - p2.getPrice());
                listComputer.sort(comparatorCom.reversed() );
                listComputer.forEach(Computer::display);
				break;
			case "4":
				//Collections.sort(listBook);
                ///listBook.forEach(Book::display);
				listBook.stream().sorted().collect(Collectors.toList());
				break;
			case "5":
				flag = false;
				break;
			default:
				System.out.println("Chose Again");
				break;
			}
		} while (flag);
	}

	

	private static void nameMenu() {
		System.out.println("1. Input information for n Computers");
		System.out.println("2. Input information for n Books");
		System.out.println("3. Display infomation of n Computer by sorting the price descending");
		System.out.println("4. Display infomation of n Books by sorting the publisher ascennding");
		System.out.println("5. Exit");
	}
}
