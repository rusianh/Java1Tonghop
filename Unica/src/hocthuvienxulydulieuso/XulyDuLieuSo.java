package hocthuvienxulydulieuso;

import java.text.DecimalFormat;
import java.util.Scanner;

public class XulyDuLieuSo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("insert Toan: ");
		double toan = scan.nextDouble();
		System.out.println("insert Lý: ");
		double ly = scan.nextDouble();
		System.out.println("insert Hoa': ");
		double hoa = scan.nextDouble();
		double avg = (toan+ly+hoa)/3;
		System.out.println("Diem trung binh là :" + avg);
		
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("Diem trung binh"+dcf.format(avg));
		
	}

}
