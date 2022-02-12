/**
 * 
 */

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 22, 2021 (4:03:38 AM)
 * @version 1.0
 */
public class TruongPhong extends NhanSu {
	//1. Attribute
	//2. Get, Set
	//3. Constructors
	/**
	 * 
	 */
	public TruongPhong() {
		super();
	}
	
	/**
	 * @param maNV
	 * @param tenNV
	 * @param namSinh
	 * @param email
	 * @param soDienThoai
	 */
	public TruongPhong(String maNV, String tenNV, String namSinh, String email, String soDienThoai) {
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
	public TruongPhong(String maNV, String tenNV, String namSinh, String email, String soDienThoai, String maPhongBan,
			float soNgayLamViec) {
		super(maNV, tenNV, namSinh, email, soDienThoai, maPhongBan, soNgayLamViec);
		// TODO Auto-generated constructor stub
	}
	//4. Input, Output
	//5. Business methods

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub

	}

}
