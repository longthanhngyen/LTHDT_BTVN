package ThanhLong2568911;

public class QuanLySanPham {
	private SanPham[] ds;
	private int num;

	public QuanLySanPham() {
		super();
		num=0;
	}
	public QuanLySanPham(SanPham[] ds, int num) {
		super();
		this.ds = ds;
		this.num = num;
	}
	public int timSP(String x) {
		for(int i=0;i<num;i++) {
			if(ds[i].getMaSP().equalsIgnoreCase(x)) {
				return i;
			}
		}
		return -1;
	}
	
	public void themSP(SanPham x) {
		if(timSP(x.getMaSP()) !=-1) {
			System.out.println("San pham da ton tai!");
			return;
		}	ds[num++]=x;

	}
	
	public void xoaSP(String maX) {
		int i=timSP(maX);
		if(i !=-1) {
			for(;i<num-1;i++) {
				ds[i]=ds[i+1];
			} num--;
		}else {System.out.println("Ma khong ton tai!");}
	}
	
	public void suaSoLuong(String maX,int soLuongMoi) {
		int i=timSP(maX);
		if(i !=-1) {
			ds[i].setSoLuongTon(soLuongMoi);
		}else {System.out.println("Ma khong ton tai!");}
		
	}
}
