package com.quanlychuyenxe;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachChuyenXe objDSCX = new DanhSachChuyenXe();
		Scanner scan = new Scanner(System.in);
//		objDSCX.nhap(scan);
//		objDSCX.xuat();
//		
//		objDSCX.tinhTongDoanhThu();
//		System.out.println("Tong Doanh Thu"+ objDSCX.getTongDoanhThu());
//		
//		objDSCX.tinhDoanhThuNgoai();
//		System.out.println("Tong Doanh Thu"+ objDSCX.getDoanhThuNgoai());
//
//		objDSCX.tinhDoanhThuNoi();
//		System.out.println("Tong Doanh Thu"+ objDSCX.getDoanhThuNoi());
		objDSCX.dummyData();
		objDSCX.xuat();
		float doanhThu = objDSCX.tinhDTCXBinhThuan();
		System.out.println("Doanh thu Binh Thuan: " + doanhThu);
		
	}

}
