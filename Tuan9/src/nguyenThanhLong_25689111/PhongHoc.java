package nguyenThanhLong_25689111;

public class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    // PhongHoc dai dien cho phong ly thuyet
    protected boolean mayChieu;

    public PhongHoc(String maPhong, String dayNha,
                    double dienTich, int soBongDen,
                    boolean mayChieu) {
        setMaPhong(maPhong);
        setDayNha(dayNha);
        setDienTich(dienTich);
        setSoBongDen(soBongDen);
        this.mayChieu = mayChieu;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        if (maPhong == null || maPhong.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma phong khong duoc rong.");
        }
        this.maPhong = maPhong.trim();
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        if (dayNha == null || dayNha.trim().isEmpty()) {
            throw new IllegalArgumentException("Day nha khong duoc rong.");
        }
        this.dayNha = dayNha.trim();
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        if (dienTich <= 0) {
            throw new IllegalArgumentException(
                "Dien tich phai lon hon 0."
            );
        }
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        if (soBongDen < 0) {
            throw new IllegalArgumentException(
                "So bong den khong duoc am."
            );
        }
        this.soBongDen = soBongDen;
    }

    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }

    public String getLoaiPhong() {
        return "Phong ly thuyet";
    }

    // Moi 10 m2 can it nhat 1 bong den.
    public boolean duAnhSang() {
        return soBongDen >= Math.ceil(dienTich / 10.0);
    }

    // Phong ly thuyet phai co may chieu.
    public boolean datChuan() {
        return duAnhSang() && mayChieu;
    }

    public void hienThi() {
        System.out.printf(
            "%-12s %-18s %10.2f %10d %-20s%n",
            maPhong,
            dayNha,
            dienTich,
            soBongDen,
            getLoaiPhong()
        );
        System.out.println("  May chieu: " + (mayChieu ? "Co" : "Khong"));
        System.out.println("  Dat chuan: " + (datChuan() ? "Co" : "Khong"));
    }

    @Override
    public String toString() {
        return String.format(
            "Loai: %s | Ma phong: %s | Day nha: %s"
                + " | Dien tich: %.2f m2 | Bong den: %d"
                + " | Dat chuan: %s",
            getLoaiPhong(), maPhong, dayNha, dienTich,
            soBongDen, datChuan() ? "Co" : "Khong"
        );
    }
}
