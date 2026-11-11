package Tuan2_Bai1;



public class SinhVien {
	private int _maSV;
	private String _hoTen;
	private double _diemLT,_diemTH;
//-------------------------------------------
	public SinhVien() {}
	public SinhVien(int _masv,String _hoten,double _diemlt, double _diemth) {
		this._maSV=_masv;
		this._hoTen=_hoten;
		this._diemLT=_diemlt;
		this._diemTH=_diemth;
	}
	
	public void setMaSV(int _masv) {
		this._maSV=_masv;
	}
	public void setHoTen(String _hoten) {
		this._hoTen=_hoten;
	}
	public void setDiemLT(double _diemlt) {
		this._diemLT=_diemlt;

	}
	public void setDiemTH(double _diemth) {
		this._diemTH=_diemth;
	}
	public int getMaSV() {
		return this._maSV;
	}
	public String getTenSV() {
		return this._hoTen;
	}
	public double getDiemLT() {
		return this._diemLT;
	}
	public double getDiemTH() {
		return this._diemTH;
	}
	public double getDTB() {
		 return (_diemTH+_diemLT)/2;
	}
	
//	public void toString() {
//		System.out.printf("", null)
//	}
	 @Override
	    public String toString() {
	        return String.format("%-5d %-30s %10.2f %10.2f %10.2f", _maSV, _hoTen, _diemLT, _diemTH, getDTB());
	    }
}
