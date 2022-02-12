import java.util.ArrayList;

/**
 * @note [QuanLyTaskCongTy] Tao lop Nhan Su de quan ly thong tin Nhan Su cho cac lop khac ke thua
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 21, 2021 (7:37:25 PM)
 * @version 1.0
 */
public abstract class NhanSu implements NhapXuat {
	//1. Attribute
	protected String maNV;
	protected String tenNV;
	protected String namSinh;
	protected String email;
	protected String soDienThoai;
	protected String maPhongBan;
	protected DanhSachTask objDSTask;
	protected float luong;
	protected float soNgayLamViec;
	// 2. Get, Set

	/**
	 * @return the maNV
	 */
	public String getMaNV() {
		return maNV;
	}

	/**
	 * @param maNV the maNV to set
	 */
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	/**
	 * @return the tenNV
	 */
	public String getTenNV() {
		return tenNV;
	}

	/**
	 * @param tenNV the tenNV to set
	 */
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	/**
	 * @return the namSinh
	 */
	public String getNamSinh() {
		return namSinh;
	}

	/**
	 * @param namSinh the namSinh to set
	 */
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}

	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	/**
	 * @return the maPhongBan
	 */
	public String getMaPhongBan() {
		return maPhongBan;
	}

	/**
	 * @param maPhongBan the maPhongBan to set
	 */
	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	/**
	 * @return the objDSTask
	 */
	public DanhSachTask getObjDSTask() {
		return objDSTask;
	}

	/**
	 * @param objDSTask the objDSTask to set
	 */
	public void setObjDSTask(DanhSachTask objDSTask) {
		this.objDSTask = objDSTask;
	}

	/**
	 * @return the soNgayLamViec
	 */
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	/**
	 * @param soNgayLamViec the soNgayLamViec to set
	 */
	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	/**
	 * @return the luong
	 */
	public float getLuong() {
		return luong;
	}

	// 3. Constructors
	// Thiet lap gia tri mac dinh
	private void init() {
		this.maPhongBan = "-1";
//		this.dsTask = new ArrayList<Task>();
	}

	public NhanSu() {
//		this.maPhongBan = "-1";
//		this.dsTask = new ArrayList<Task>();
		init();
	}

	/**
	 * @param maNV
	 * @param tenNV
	 * @param namSinh
	 * @param email
	 * @param soDienThoai
	 */
	public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDienThoai) {
		super();
		init();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.maPhongBan = "-1";
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
	public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDienThoai, String maPhongBan,
			float soNgayLamViec) {
		super();
		init();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.maPhongBan = maPhongBan;
		this.soNgayLamViec = soNgayLamViec;
	}

	// 4. Input, Output
	public void xuat() {
		String temp = this.maPhongBan;
		if (this.maPhongBan.equalsIgnoreCase("-1")) {
			temp = "Chua phan bo ";
		}
		System.out.println("Ma: " + this.maNV + "\t Ten: " + this.tenNV + "\t Nam sinh: " + this.namSinh + "\t Email: "
				+ this.email + "\t So dien thoai: " + this.soDienThoai + "\t Ma Phong Ban: " + temp
				+ " \t So ngay lam viec: " + this.soNgayLamViec + "\t\t Luong: " + this.luong);
		
		//Bo sung de xuat DS Task cua Nhan Su
		if(this.objDSTask.getDsTask().size()>0) {
			System.out.println("DAnh sach task cua nhan su nay dang duoc thuc hien: ");
			this.objDSTask.xuat();
		}
	}

	public void xuatTenVaMa() {
		System.out.println("Ma: " + this.maNV + "\t Ten: " + this.tenNV);
	}

	// 5. Business methods
	public abstract void tinhLuong();

}
