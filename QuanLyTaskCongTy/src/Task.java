/**
 * 
 */

/**
 * @note [QuanLyTaskCongTy] Quan ly cac nghiep vu lien quan den Task cho nhan
 *       vien
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 21, 2021 (7:30:00 PM)
 * @version 1.0
 */
public class Task implements NhapXuat {
	// 1. Attributes
	private String maTask;
	private String tenTask;
	private float gioThucHien;
	private String maNV;
	// 2. Get, set

	public String getMaTask() {
		return maTask;
	}

	public void setMaTask(String maTask) {
		this.maTask = maTask;
	}

	public String getTenTask() {
		return tenTask;
	}

	public void setTenTask(String tenTask) {
		this.tenTask = tenTask;
	}

	public float getGioThucHien() {
		return gioThucHien;
	}

	public void setGioThucHien(float gioThucHien) {
		this.gioThucHien = gioThucHien;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	// 3. Constructors
	public Task() {

	}

	/**
	 * @param maTask
	 * @param tenTask
	 * @param gioThucHien
	 * @param maNV
	 */
	public Task(String maTask, String tenTask, float gioThucHien, String maNV) {
		super();
		this.maTask = maTask;
		this.tenTask = tenTask;
		this.gioThucHien = gioThucHien;
		this.maNV = maNV;
	}
	
	public Task(String maTask, String tenTask, float gioThucHien) {
		super();
		this.maTask = maTask;
		this.tenTask = tenTask;
		this.gioThucHien = gioThucHien;
	}

	// 4. Input, output
	public void xuat() {
		System.out.println("Task - Ma: "+this.maTask + "\t\t \t Ten Task" +this.tenTask + "\t\t\t Gio Thuc hien: "+this.gioThucHien);
	}
	
	
	// 5. Business methods
	

}
