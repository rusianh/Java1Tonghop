import java.util.Scanner;

/**
 * @note Quang ly cac loai Studetn, Employee, Customer o muc cha
 * @author Cris Vu
 * @since 19/01
 * @version 1.0
 */
public class Person {
	// 1. Attribute
	protected String diaChi;
	protected String hoTen;
	protected String ma;
	protected String email;
	// 2. Get, set methods
	public String getDiaChi() {
		return diaChi;
	}
	
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getMa() {
		return ma;
	}
	
	public void setMa(String ma) {
		this.ma = ma;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	// 3. Constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param diaChi
	 * @param hoTen
	 * @param ma
	 * @param email
	 */
	public Person(String diaChi, String hoTen, String ma, String email) {
		super();
		this.diaChi = diaChi;
		this.hoTen = hoTen;
		this.ma = ma;
		this.email = email;
	}
	
	// 4. Input, output methods
	public void nhap(Scanner scan) {
		System.out.println("Nhap ho ten");
		this.hoTen = scan.nextLine();
		
		System.out.println("Nhap dia chi");
		this.diaChi = scan.nextLine();
		
		System.out.println("Nhap ma");
		this.ma = scan.nextLine();
		
		System.out.println("Nhap email");
		this.email = scan.nextLine();
	}
	
	public void xuat() {
		System.out.print(" HO ten: "+ this.hoTen 
						+"\t Ma: " + this.ma
						+"\t Dia chi: " + this.diaChi
						+"\t Emai:l " + this.email);
	}
	// 5. Business methods


}
