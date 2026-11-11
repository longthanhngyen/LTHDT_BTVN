package ThanhLong2568911;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham	 {
	private double TGBH;

	public double getTGBH() {
		return TGBH;
	}

	public void setTGBH(double tGBH) {
		TGBH = tGBH;
	}
	@Override
	public void setGiaBan() {
		giaBan= giaNhap*1.1 + TGBH*50000;
	}

	public SanPhamDienTu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPhamDienTu(String maSP, String tenSP, LocalDate ngaySX,
			double giaNhap, int soLuongTon,double TGBH) {
		super(maSP, tenSP, ngaySX, giaNhap, soLuongTon);
		setTGBH(TGBH);
	}
	
}
