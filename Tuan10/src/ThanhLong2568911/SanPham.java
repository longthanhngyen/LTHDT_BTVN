package ThanhLong2568911;
import java.time.LocalDate;
import java.util.*;
public abstract class SanPham {
	enum LOAISP {DIENTU,THUCPHAM};
	protected String maSP, tenSP;
	protected LocalDate ngaySX;
	protected double giaNhap,giaBan;
	protected int soLuongTon;
	protected LOAISP loaiSP;
	
	
	public String getMaSP() {
		return maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public double getGiaBan() {
		return giaBan;
	}
///
	
	public abstract void setGiaBan();
	
	
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	


	public LOAISP getLoaiSP() {
		return loaiSP;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public void setLoaiSP(LOAISP loaiSP) {
		this.loaiSP = loaiSP;
	}
	public SanPham() {
		
	}
	public SanPham(String maSP, String tenSP, LocalDate ngaySX, double giaNhap, int soLuongTon,LOAISP loai) {
		super();
		setGiaBan();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.ngaySX = ngaySX;
		this.giaNhap = giaNhap;
		this.soLuongTon = soLuongTon;
		this.loaiSP = loai;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", ngaySX=" + ngaySX + ", giaNhap=" + giaNhap
				+ ", giaBan=" + giaBan + ", soLuongTon=" + soLuongTon + "]";
	}
	
}
