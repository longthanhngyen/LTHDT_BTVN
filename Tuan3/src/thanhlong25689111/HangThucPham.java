package thanhlong25689111;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class HangThucPham {
	private String _maHang;
	private String _tenHang;
	private double _donGia;
	private LocalDate _ngaySX;
	private LocalDate _ngayHH;
	private int _soLuong;
//---------------------------------------
//------------- Mã hàng------------------
	public String get_maHang() {
		return _maHang;
	}
	public void set_maHang(String _maHang) {
		this._maHang = _maHang;
	}
//---------------------------------------\\
//-- Tên hàng-----
	public String get_tenHang() {
		return _tenHang;
	}
	public void set_tenHang(String _tenHang) {
// Nếu tên hàng rỗng thì đặt gtri mặc định
		if(_tenHang==null || _tenHang.isBlank())
		{ this._tenHang =  "xxx"; 
		}
		else{this._tenHang = _tenHang;}
	}

//---------------------------------------\\
//-- Đơn giá---
	public double get_donGia() {
		return _donGia;
	}
	public void set_dg(double _donGia) {
		if(_donGia<0) {
			throw new IllegalArgumentException("Đơn giá phải >=0 !");
		}
		this._donGia = _donGia;
	}
// Hàm nhập đơn giá 
	public void set_donGia(double _donGia) {
		try {
			set_dg(_donGia);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Lỗi nhập giá trị, "+e.getMessage());
		}
		
	}
	
//---------------------------------------\\
//-- Ngày sản xuất ----
	public LocalDate get_ngaySX() {
		return _ngaySX;
	}
	public void set_ngaySX(LocalDate _ngaySX) {
		if(_ngaySX ==null ||_ngaySX.isAfter(LocalDate.now())){// ĐK: ngày ko sau hôm nay
			_ngaySX=LocalDate.now();
		} else {
		this._ngaySX = _ngaySX; }
	}
	
//---------------------------------------\\	
//-- Ngày hết hạn
	public LocalDate get_ngayHH() {
		return _ngayHH;
	}
	public void set_ngayHH(LocalDate _ngayHH) {
		if(_ngayHH==null||_ngayHH.isBefore(LocalDate.now())) { // DK: ngày hh ko trước hôm nay
			_ngayHH=LocalDate.now();
		} else {
		this._ngayHH = _ngayHH;
		}
}
	
//---------------------------------------\\
//-- Số lượng 
	public int get_soLuong() {
		return _soLuong;
	}
	public void set_soLuong(int _soLuong) {
		this._soLuong = _soLuong;
	}

//------ Constructor---------------------
	public HangThucPham(String _maH,String _tenH,double _gia,LocalDate _ngSX,LocalDate _ngHH) {
		set_maHang(_maH);
		set_tenHang(_tenH);
		set_donGia(_gia);
		set_ngaySX(_ngSX);
		set_ngayHH(_ngHH);
	}
	public HangThucPham(String _maH) {
		set_maHang(_maH);
		set_tenHang(null);
		set_donGia(0);
		set_ngaySX(null);
		set_ngayHH(null);
	}

//--- Hàm kiểm tra hạn sử dụng----
	public boolean _conHangSuDung() {
// Sai nếu mặt hàng không có hạn sử dụng, thời gian
		if(this._ngaySX==null || this._ngayHH==null) {
			return false;
		}
		LocalDate _homNay=LocalDate.now();
// DK: hôm nay không sau HH, không trước SX (vẫn tính trong ngày nếu HSD trong ngày)
return (!_homNay.isBefore(this._ngaySX)&&!_homNay.isAfter(this._ngayHH) );
	}
	
//-----Hàm trả về chuỗi để in ra dãy thông tin
	@Override
	public String toString() {
		DecimalFormat _df= new DecimalFormat("#,##.00");
		DateTimeFormatter _dtf =  DateTimeFormatter.ofPattern("dd/mm/yyyy");
		
		String ghiChu = _conHangSuDung() ? "Hàng hết hạn" : "Còn hạn sử dụng";
		
		return String.format("%-9s %-15s %15s   %-15s %-15s %s", 
	            this._maHang, 
	            this._tenHang, 
	            _df.format(this._donGia), 
	            _dtf.format(this._ngaySX), 
	            _dtf.format(this._ngayHH), 
	            ghiChu);
	}
}
