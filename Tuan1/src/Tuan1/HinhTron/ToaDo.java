package Tuan1.HinhTron;

public class ToaDo {
// private gia tri toa do
	private String _ten;
	private double _x,_y;
// public
	// Ham lay gia tri hinh tron
		public double getHinhTron(int value) {
			return (value == 0?_x:_y);
		}
		public String getHinhTron() {
			return _ten;
		}
	// Ham gan gia tri hinh tron
		public void setToaDo(double x,double y,String _ten) {
			this._x = x;
			this._y = y;
			this._ten = _ten;
		}
		ToaDo(double x,double y,String _ten){
			setToaDo(x,y,_ten);
		}

}
