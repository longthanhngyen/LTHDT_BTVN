package thanhlong2589111;

import java.util.Scanner;

public class ListCD {
//--- private attribute
	private CD _cdr[]; 		// mang doi tuong cd
	private int _cdCount; 	// so luong CD hien co

//--- public methods
	public ListCD(int n){
		this._cdr= new CD[n];
		this._cdCount=0; 		// thuc the = 0 vi chua nhap vao
	}
// Lay so luong dia CD da nhap
	public int get_cdCount() 	{return _cdCount;}

	
//====== Tang kich thuoc mang=====
	public void tangKT() {
		if(_cdr.length == _cdCount) {  						// Mang day 
			CD _newAr[] = new CD[(_cdr.length*2)];			// Tao mang gap doi kich thuoc	
			System.arraycopy(_cdr,0,_newAr,0,_cdCount); 	// Copy value tu mang 
			_cdr = _newAr;  								// Gan lai dia chi, doi kich thuoc mang
		}
	}
//===== Tim 1 dia CD ========
	public int findCD(String _CD) {
		for(int i=0;i<_cdCount;i++) {
			if(_cdr[i].get_maCD().equalsIgnoreCase(_CD) ) //equalsIgnoreCase: so sanh 2 chuoi co giong nhau k, bat ke hoa thuong
				{return i;} // tra ve vi tri dia CD
		}
		return -1; // ko thay dia CD (thong bao de cho ham goi xu li)
	}


//===== Them 1 dia CD moi=========
	public boolean themCD(CD _newCD) {
// B1: kiem tra dia da co chua
		if(findCD(_newCD.get_maCD()) != -1) {
			return false;
		}
// B2: kiem tra kich thuoc con trong
		tangKT();
// B3: Gan _newCD vao cuoi mang
		_cdr[_cdCount++]=_newCD;
		return true;  
	}
	
//====== Xoa dia CD==========
	public boolean xoaCD(String _maXoa) {
		int _pos=findCD(_maXoa);
		if(_pos != -1) {
			for(int j=_pos;j<_cdCount-1;j++) 	{ // Xoa bang cach: lui cac phan tu phia sau ve truoc
				_cdr[j]=_cdr[j+1];				
			}
			_cdr[--_cdCount]=null;				// Giam so luong truoc, roi lam trong o cuoi cung
			return true;
		}	
		return false;
	}
	
//===== Cap nhat gia CD ========
	public boolean capnhatGiaCD(String _maCN,float _newGia) {
		int _pos=findCD(_maCN);
		if(_pos != -1) {
			_cdr[_pos].set_gia(_newGia);
			return true;
		}
		return false;
	}
	
//====== In danh sach ========
	public void inDS() {
        CD.tieuDe();                        // in tieu de bang
        for (int i = 0; i < _cdCount; i++) {
            System.out.println(_cdr[i]);         // tu goi toString()
        }
    }
	
//===== Tinh tong thanh tien ======
	public float tongThanhTien() {
		float tong = 0;
		for (int i = 0; i < _cdCount; i++) {
			tong += _cdr[i].get_gia() * _cdr[i].get_soBaiHat();
		}
		return tong;
	}
	  
//===== Nhap CD tu ban phim ======
	public void nhapCD(Scanner sc) {
		try {
// Nhap vao thong tin CD
			System.out.print("Nhap ma CD: ");
			String maCD = sc.nextLine();
			  
			System.out.print("Nhap tua de CD: ");
			String tuaCD = sc.nextLine();
			  
			System.out.print("Nhap ten ca sy: ");
			String casy = sc.nextLine();
			  
			System.out.print("Nhap so luong bai hat: ");
			int soBaiHat = Integer.parseInt(sc.nextLine());
			  
			System.out.print("Nhap gia CD: ");
			float gia = Float.parseFloat(sc.nextLine()); 
			  
// Khoi tao CD
			CD _newCD = new CD(maCD,tuaCD,casy,soBaiHat,gia);
// Them dia CD
			if(themCD(_newCD) == true) {
				System.out.println("Them dia CD moi thanh cong! ");
			}
			else {
				System.out.println("Dia CD da ton tai, them that bai! ");
			}
		}
// Xu li cac loi phat sinh khi nhap lieu
		catch(Exception E){
			System.out.println("Loi nhap lieu: "+E.getMessage());
		}
	}

//===== HAM MOI 1: Xoa CD theo ma (nhap tu ban phim) ======
	public void xoaCD(Scanner sc) {
// Nhap ma CD can xoa
		System.out.print("Nhap ma CD can xoa: ");
		String _maXoa = sc.nextLine();
// Goi ham xoa theo ma, thong bao ket qua
		if(xoaCD(_maXoa)) {
			System.out.println("Xoa thanh cong dia CD co ma: " + _maXoa);
		}
		else {
			System.out.println("Xoa that bai: khong tim thay ma CD!");
		}
	}

//===== HAM MOI 2: Cap nhat gia CD (nhap tu ban phim) ======
	public void capnhatGiaCD(Scanner sc) {
		try {
// Nhap ma CD can cap nhat va gia moi
			System.out.print("Nhap ma CD can cap nhat gia: ");
			String _maCN = sc.nextLine();

			System.out.print("Nhap gia moi: ");
			float _newGia = Float.parseFloat(sc.nextLine());

// Rang buoc: gia khong duoc am
			if(_newGia < 0) {
				System.out.println("Cap nhat that bai: gia phai >= 0!");
				return;
			}
// Goi ham cap nhat theo ma, thong bao ket qua
			if(capnhatGiaCD(_maCN,_newGia)) {
				System.out.println("Cap nhat gia thanh cong cho CD co ma: " + _maCN);
			}
			else {
				System.out.println("Cap nhat that bai: khong tim thay ma CD!");
			}
		}
// Xu li loi khi nhap gia khong phai so
		catch(NumberFormatException E) {
			System.out.println("Loi nhap lieu: gia phai la so!");
		}
	}
}