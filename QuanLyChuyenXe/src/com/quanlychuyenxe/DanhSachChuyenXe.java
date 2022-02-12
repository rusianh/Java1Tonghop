package com.quanlychuyenxe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Note Xu ly nghiep vu lien quan den danh sch chuyen xe
 * @author Admin
 *
 */
public class DanhSachChuyenXe {

	// 1. Attribute
	private ArrayList<ChuyenXe> listChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;
	// 2. Get, set

	public float getDoanhThuNoi() {
		return this.doanhThuNoi;
	}

	public float getDoanhThuNgoai() {
		return this.doanhThuNgoai;
	}

	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	/**
	 * @return the listChuyenXe
	 */
	public ArrayList<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}

	/**
	 * @param listChuyenXe the listChuyenXe to set
	 */
	public void setListChuyenXe(ArrayList<ChuyenXe> listChuyenXe) {
		this.listChuyenXe = listChuyenXe;
	}

	// 3. Constructor
	public DanhSachChuyenXe() {
		// TODO Auto-generated constructor stub
		listChuyenXe = new ArrayList<ChuyenXe>();
	}

	// 4. Input, output
	public void nhap(Scanner scan) {
		boolean flag = true;
		ChuyenXe chuyenXe;
		do {
			System.out.println("Nhap 1. Chuyen xe noi thanh");
			System.out.println("Nhap 2. Chuyen xe ngoai thanh");
			System.out.println("Nhap 0. Thoat nhap");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				chuyenXe = new ChuyenXeNoiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 2:
				chuyenXe = new ChuyenXeNgoaiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (ChuyenXe cx : this.listChuyenXe) {
			cx.xuat();
		}
	}

	// 5. Business methods
	public void tinhTongDoanhThu() {
		this.tongDoanhThu = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			this.tongDoanhThu += cx.getDoanhThu();
		}
	}

	public void tinhDoanhThuNoi() {
		this.doanhThuNoi = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNoiThanh) { // instaceof | Kiem tra chuyen xe dang chay la the hien cua Class nao
				this.doanhThuNoi += cx.getDoanhThu(); // hoac cx duoc new ra tu lop nao
			}
		}
	}
	
	public void tinhDoanhThuNgoai() {
		this.doanhThuNgoai = 0;
		for(ChuyenXe cx: this.listChuyenXe) {
			if(cx instanceof ChuyenXeNgoaiThanh) {
				this.doanhThuNgoai += cx.getDoanhThu();
			}
		}
	}
	
	public void dummyData() {
		ChuyenXe chuyenXe;
		chuyenXe = new ChuyenXeNoiThanh("1", "noi 1", "02", 1200, "So 12", 35);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNoiThanh("2", "noi 2", "03", 1300, "So 11", 38f);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNgoaiThanh("2", "ngoai 1", "05", 2000, "Binh Thuan", 2);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNgoaiThanh("4", "ngoai 2", "06", 3000, "Binh Thuan", 2);
		this.listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNgoaiThanh("2", "ngoai 3", "07", 7000, "Binh Thuan", 2);
		this.listChuyenXe.add(chuyenXe);
	}
	
	public float tinhDTCXBinhThuan() {
		float doanhThu = 0;
		for(ChuyenXe cx: this.listChuyenXe) {
			if(cx instanceof ChuyenXeNgoaiThanh) {
				ChuyenXeNgoaiThanh ngoai = ((ChuyenXeNgoaiThanh)cx); //Cassting - Ep kieu cho instance | 
				if(ngoai.getNoiDen().equalsIgnoreCase("Binh Thuan")) {  // Neu khong ep kieu thi obj/instance se duoc hieu la thuoc lop cha ChuyenXe
					doanhThu += ngoai.getDoanhThu();
				}
			}
		}
		return doanhThu;
	}
}
