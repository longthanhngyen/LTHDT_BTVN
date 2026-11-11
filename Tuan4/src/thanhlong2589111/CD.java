package thanhlong2589111;

public class CD {
//-- private attribute cua CD
	private String _maCD; 		//  - maCD    : ma dinh danh CD (duy nhat)
	private String _tuaCD;		//  - tuaCD   : tua de cua CD
	private String _caSy;		//  - caSy    : ten ca sy the hien
	private int _soBaiHat;		//  - soBaiHat: so bai hat trong CD (phai > 0)
	private float _gia; 			//  - gia     : don gia cua CD
	
//-- public method 
	
//====== Getter/Setter==================
	public String get_maCD() 	{return _maCD;}
	public String get_tuaCD() 	{return _tuaCD;}
	public String get_caSy() 	{return _caSy;}
	public int get_soBaiHat() 	{return _soBaiHat;}
	public float get_gia() 		{return _gia;}
	
	public void set_maCD(String _maCD) 		{this._maCD = _maCD;}
	public void set_tuaCD(String _tuaCD) 	{this._tuaCD = _tuaCD;}
	public void set_caSy(String _caSy) 		{this._caSy = _caSy;}
	public void set_gia(float _gia)			{this._gia=_gia;}		// SUA: int -> float cho dong bo voi thuoc tinh _gia
	
	public void set_soBaiHat(int _soBaiHat) throws Exception 	{
		if(_soBaiHat>0) {
			this._soBaiHat = _soBaiHat;}
		else {
			throw new Exception("So bai hat phai > 0 !\n");
			}
	}

//===== Constructor===========
	public CD() { }
	public CD(String _maCD,String _tuaCD,String _caSy,int _soBaiHat,float _gia)throws Exception {
		this._maCD = _maCD;
		this._tuaCD = _tuaCD;
		this._caSy = _caSy;
		this._gia=_gia;
		this.set_soBaiHat(_soBaiHat); // su dung rang buoc trong ham 
	}

//========= In tieu de==============
	public static void tieuDe() {
		System.out.println("Danh sach CD");

// In dong gach ngang (SUA: dung repeat thay vi println tung ki tu)
		System.out.println("=".repeat(67));

// In tieu de (canh le phai, moi cot 10 ki tu) (SUA: %s cho tat ca cot, du 6 cot)
		String s= String.format("|%10s|%10s|%10s|%10s|%10s|%10s|",
				"Ma CD", "Tua CD", "Ca Sy","So Bai", "Don Gia", "Thanh Tien");
		System.out.println(s);
		
// In dong gach ngang duoi
		System.out.println("-".repeat(67));
	}
	
//======== Tao toString moi============
	@Override
	public String toString() {
		// SUA: in du 6 cot cho khop tieu de (them don gia)
		return String.format("|%10s|%10s|%10s|%10d|%10.2f|%10.2f|",_maCD,_tuaCD,_caSy,_soBaiHat,_gia,_gia*_soBaiHat);
	}
}