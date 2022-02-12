import java.util.Scanner;

/**
 * 
 */

/**
 * @note QuanLyHocVien
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 19, 2021  (2:32:36 PM)
 * @version 1.0
 */
public class Students extends Person {
	//1. Attribute
	private float toan;
	private float ly;
	private float hoa;
	//2. Get, set methods
	
	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	//3. Constructor
	public Students() {
		
	}
	
	/**
	 * @param diaChi
	 * @param hoTen
	 * @param ma
	 * @param email
	 */
	public Students(String diaChi, String hoTen, String ma, String email, float toan, float ly, float hoa) {
		super(diaChi, hoTen, ma, email);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		
	}

	
	//4. Input, outputmethods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhap diem toan: ");
		this.toan = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhap diem Ly: ");
		this.toan = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhap diem Hoa: ");
		this.toan = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Toan: "+this.toan +"\t Ly: "+ this.ly+"\t Hoa: "+ this.hoa);
		
	}
	//5. Business methods
	/**
	 * 
	 */

}
