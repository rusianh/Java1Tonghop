package com.cybersoft;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

	// 1. Attribute
	private ArrayList<SinhVien> listSV;
	// 2. Get, set methods

	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	// 3. Constructor methods
	public DanhSachSinhVien() {
		thietLapDefault();
	}

	// Ham de khoi dong cac list va thiet lap gia tri mac dinh cho lop
	private void thietLapDefault() {
		listSV = new ArrayList<SinhVien>();
		// todo1
		// ...
	}

	// 4. Input, output methods
	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

	// 5. Business methods
	public void tinhDTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDTB();
		}
	}

	public void themSinhVien(SinhVien sv) {
		this.listSV.add(sv);
	}

	public void xepLoai() {
		// TODO Auto-generated method stub
		for (SinhVien sv : listSV) {
			sv.xepLoai();
		}
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0); //
			for (SinhVien svCurrent : this.listSV) {
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
				}
			}

			// Đã tìm thấy svmax
			for (SinhVien svCurrent : this.listSV) {
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}

		return list;

	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhatToiUu() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			int viTriMaxDauTien = 0;
			SinhVien svMax = this.listSV.get(0);
			for (int i = 0; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
					viTriMaxDauTien = i;
				}
			}
			// Them svMax vào list
			list.add(svMax);
			// Da tim thay svMax
			for (int i = viTriMaxDauTien + 1; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}
		return list;
	}

	public ArrayList<SinhVien> lietKeDSSVYeu() {
		ArrayList<SinhVien> listYeu = new ArrayList<SinhVien>();
		for (SinhVien sv : this.listSV) {
			if (sv.getDiemTB() < 5) {
				listYeu.add(sv);
			}
		}
		return listYeu;
	}

	public ArrayList<SinhVien> timSVTheoTen(String ten) {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for (SinhVien sv : this.listSV) {
			if (sv.getTenSV().equalsIgnoreCase(ten)) {
				list.add(sv);
			}
		}
		return list;
	}

	public SinhVien timSVTheoMa(int ma) {
		SinhVien sv = null; // chua tim thay
		for (SinhVien sv1 : this.listSV) {
			if (sv1.getMaSV() == ma) {
				sv = sv1;
				break; //thoat khoi vong lap
			}
		}
		return sv;
	}
	
	public boolean xoaSVTheoMa(int ma) {
		boolean deleted = false;
		for(SinhVien sv: this.listSV) {
			if(sv.getMaSV()==ma) {
				this.listSV.remove(sv);
				deleted = true;
				break;
			}
		}
		return deleted;
	}
}
