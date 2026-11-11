package Tuan1.HCN;

public class HinhChuNhat {
// private value:
	private double _chieudai;
	private double _chieurong;
	
// public 

// Ham lay gia tri HCN
	public double getHCN(int value) {
		return (value == 0?_chieudai:_chieurong);
	}
// Ham gan gia tri HCN
	public void setHCN(double _dai,double _rong) {
		this._chieudai=_dai;
		this._chieurong=_rong;
	}
// Ham tinh dien tich
	public double dtHCN() {
		return this._chieudai*this._chieurong;
	}
// Ham khoi tao doi tuong
	public HinhChuNhat(double _cdai,double _crong) throws Exception {
		if(_cdai >0 && _crong>0) {
			setHCN(_cdai,_crong);
		}
		else {
			throw new Exception( (_cdai<0?"_cdai":"_crong")+ ">0" );
		}
	}
	public HinhChuNhat() {}

// Main
	public static void main(String[] args) throws Exception {
// Tao doi tuong
		HinhChuNhat ABCD = new HinhChuNhat(6,7);
// Xuat thong tin HCN
		System.out.println("Chieu dai HCN: "+ABCD.getHCN(0));
		System.out.println("Chieu rong HCN: "+ABCD.getHCN(1));
		System.out.println("Dien tich HCN: "+ABCD.dtHCN());
	}

}
