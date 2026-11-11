package nguyenThanhLong_25689111;

public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha,
                        double dienTich, int soBongDen,
                        int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen, false);
        setSoMayTinh(soMayTinh);
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        if (soMayTinh < 0) {
            throw new IllegalArgumentException(
                "So may tinh khong duoc am."
            );
        }
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String getLoaiPhong() {
        return "Phong may tinh";
    }

    // Dien tich binh quan moi may tinh phai dat 1.5 m2.
    public boolean duDienTichMayTinh() {
        return soMayTinh == 0 || dienTich / soMayTinh >= 1.5;
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && duDienTichMayTinh();
    }

    @Override
    public void hienThi() {
        System.out.println(this);
        System.out.println("  So may tinh: " + soMayTinh);
    }

    @Override
    public String toString() {
        return super.toString()
            + String.format(" | So may tinh: %d", soMayTinh);
    }
}
