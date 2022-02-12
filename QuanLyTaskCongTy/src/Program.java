import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 21, 2021 (5:25:42 PM)
 * @version 1.0
 */
public class Program {

	public static void main(String[] args) {
		CongTy cty = new CongTy();
		cty.taoDuLieu();
//		cty.xuatDSNS();
//		cty.xuatDSPhongBan();
//		cty.xuatDSTask();
		cty.phanBoNhanVien();
		cty.chiDinhTruongPhong();
		cty.xuatDSNS();
		cty.xuatDSPhongBan();
	}
}

	//1. Attribute
	//2. Get, Set
	//3. Constructors
	//4. Input, Output
	//5. Business methods
