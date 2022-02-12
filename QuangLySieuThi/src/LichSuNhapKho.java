import java.time.LocalDate;

/**
 * 
 */

/**
 * @note [QuangLySieuThi]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 21, 2021 (10:03:47 PM)
 * @version 1.0
 */
public class LichSuNhapKho {
	//Attribute
	private int maSanPham;
	private String tenSanPham;
	private float soLuong;
	private LocalDate ngayTao;
	private LocalDate ngayHetHan = null;
	private int trangThai; //0: Chua xy ly. 1:Da ban het. 2: HetHan loai kho
	
	
	// get set
	
	/**
	 * @return the maSanPham
	 */
	public int getMaSanPham() {
		return maSanPham;
	}
	/**
	 * @param maSanPham the maSanPham to set
	 */
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	/**
	 * @return the tenSanPham
	 */
	public String getTenSanPham() {
		return tenSanPham;
	}
	/**
	 * @param tenSanPham the tenSanPham to set
	 */
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	/**
	 * @return the soLuong
	 */
	public float getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}
	/**
	 * @return the ngayNhap
	 */
	public LocalDate getNgayTao() {
		return ngayTao;
	}
	/**
	 * @param ngayNhap the ngayNhap to set
	 */
	public void setNgayTao(LocalDate ngayNhap) {
		this.ngayTao = ngayNhap;
	}
	/**
	 * @return the ngayHetHan
	 */
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	/**
	 * @param ngayHetHan the ngayHetHan to set
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	
	
	/**
	 * @return the trangThai
	 */
	public int getTrangThai() {
		return trangThai;
	}
	/**
	 * @param trangThai the trangThai to set
	 */
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	/**
	 * 
	 */
	public LichSuNhapKho() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maSanPham
	 * @param tenSanPham
	 * @param soLuong
	 * @param ngayNhap
	 */
	public LichSuNhapKho(int maSanPham, String tenSanPham, float soLuong, LocalDate ngayNhap) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.soLuong = soLuong;
		this.ngayTao = ngayNhap;
//		this.ngayHetHan = ngayNhap.plusDays(3);
	}
	
	public void hienThiLichSuNhapKho() {
		System.out.println("#"+ this.maSanPham +  "\t _ "+ this.tenSanPham + "\t So luong: " + this.soLuong + "\t Ngay nhap: " + this.ngayTao
				+ "\t Ngay Het Han: " + this.ngayHetHan);
	}
	

}
