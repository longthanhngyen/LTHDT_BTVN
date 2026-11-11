package nguyenThanhLong_25689111;

public class PhongLyThuyet extends PhongHoc {
    private boolean mayChieu;

    public PhongLyThuyet(String maPhong, String dayNha,
                         double dienTich, int soBongDen,
                         boolean mayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen, false);
        this.mayChieu = mayChieu;
    }

    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }

    @Override
    public String getLoaiPhong() {
        return "Phong ly thuyet";
    }

    // Phong ly thuyet dat chuan khi du anh sang
    // va co may chieu.
    @Override
    public boolean datChuan() {
        return duAnhSang() && mayChieu;
    }

    @Override
    public void hienThi() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + " | May chieu: " + (mayChieu ? "Co" : "Khong");
    }
}
