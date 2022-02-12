/**
 * 
 */

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 22, 2021 (3:54:32 AM)
 * @version 1.0
 */
public class NhanVienThuong extends NhanSu implements NhapXuat {
	final int LUONG_NGAY = 200;
	final int PHU_CAP1 = 300;
	final int PHU_CAP2 = 1000;
	//1. Attribute
	//2. Get, Set
	//3. Constructors
	public NhanVienThuong() {
		super();
	}
	
	/**
	 * @param maNV
	 * @param tenNV
	 * @param namSinh
	 * @param email
	 * @param soDienThoai
	 */
	public NhanVienThuong(String maNV, String tenNV, String namSinh, String email, String soDienThoai) {
		super(maNV, tenNV, namSinh, email, soDienThoai);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param maNV
	 * @param tenNV
	 * @param namSinh
	 * @param email
	 * @param soDienThoai
	 * @param maPhongBan
	 * @param soNgayLamViec
	 */
	public NhanVienThuong(String maNV, String tenNV, String namSinh, String email, String soDienThoai,
			String maPhongBan, float soNgayLamViec) {
		super(maNV, tenNV, namSinh, email, soDienThoai, maPhongBan, soNgayLamViec);
		// TODO Auto-generated constructor stub
	}
	//4. Input, Output
	//5. Business methods
	/**
	 * 
	 */

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub

	}

}
