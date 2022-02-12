import java.time.LocalDate;

public interface TuongTacAdminCallBack {
	
	public abstract void addSanPham(SanPham sanPham);
	void hienThiDanhSachSanPham();
	SanPham checkMaSanPhamTonTai(int ma);
	void hienThiLogNhapKho();
	void tangThoiGian(int soNgayMuonTang);
	void hienThiDanhSachLoaiKho();
	LocalDate getNgayHienTai();
}
