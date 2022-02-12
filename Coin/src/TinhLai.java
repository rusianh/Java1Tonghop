
public class TinhLai {
	private final static double LAI_SUAT_THANG = 1.3;
	private final static int THANG_CHOT_LAI = 12;

	public static void main(String[] args) {
		double tongTien;
		tongTien = tinhLaiSuat(LAI_SUAT_THANG, THANG_CHOT_LAI, 1.0);
		System.out.println(tongTien);
	}

	private static double tinhLaiSuat(double laiSuat, int thangChotLai, double von) {
		double tongTien= 0;
		
		for (int i = 1; i <= thangChotLai; i++) {
			tongTien += ((tongTien*laiSuat - tongTien) + von*laiSuat);
		}
		return tongTien;
	}
}
