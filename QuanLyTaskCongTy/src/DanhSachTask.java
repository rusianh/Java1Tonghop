import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @note [QuanLyTaskCongTy]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 22, 2021 (5:03:23 PM)
 * @version 1.0
 */
public class DanhSachTask implements NhapXuat {
	//1. Attribute
	private ArrayList<Task> dsTask;
	//2. Get, Set
	
	/**
	 * @return the dsTask
	 */
	public ArrayList<Task> getDsTask() {
		return dsTask;
	}

	/**
	 * @param dsTask the dsTask to set
	 */
	public void setDsTask(ArrayList<Task> dsTask) {
		this.dsTask = dsTask;
	}

	//3. Constructors
	//4. Input, Output
	//5. Business methods
	/**
	 * 
	 */
	public DanhSachTask() {
		// TODO Auto-generated constructor stub
		this.dsTask = new ArrayList<Task>();
	}

	@Override
	public void xuat() {
		for(Task task: this.dsTask) {
			task.xuat();
		}

	}
	
	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/Task.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				Task task = new Task(listInfo[0], listInfo[1], Float.parseFloat(listInfo[2])); // Vi Nhan vien chua biet la nhan vien thuong hay truong phong nen khong the truyen tham so vao phuong thuc khoi tao
				
				// Them nhan su vao list
				this.dsTask.add(task);

			}
			reader.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
