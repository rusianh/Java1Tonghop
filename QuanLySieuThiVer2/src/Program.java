import java.util.Scanner;

/**
 * 
 */

/**
 * @note [QuanLySieuThiVer2]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 24, 2021 (5:17:16 PM)
 * @version 1.0
 */
public class Program {

	public static void main(String[] args) {
		SieuThi sieuThi = new SieuThi();
		Scanner scan = new Scanner(System.in);
		
		sieuThi.getObjListHangHoa().creatDummyData();
		sieuThi.doMenuStart(scan);
	}

}

	//1. Attribute
	//2. Get, set methods
	//3. Constructor
	//4. Input, output methods
	//5. Business methods