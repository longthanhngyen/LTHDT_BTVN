package ThanhLong2568911;
import java.time.LocalDate;
public class SanPhamThucPham extends SanPham{
	private LocalDate ngayHH;

	public LocalDate getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}
	@Override
	public void setGiaBan() {
		giaBan= (ngayHH.isAfter(LocalDate.now())? 
								0.0:giaNhap*1.0);
	}

	public SanPhamThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPhamThucPham(String maSP, String tenSP, LocalDate ngaySX,
			double giaNhap, int soLuongTon,LocalDate ngayHH) {
		super(maSP, tenSP, ngaySX, giaNhap, soLuongTon);
		setNgayHH(ngayHH);
	}
	
}
