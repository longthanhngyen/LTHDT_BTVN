package nguyenThanhLong_25689111;

public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private int soBonRua;

    public PhongThiNghiem(String maPhong, String dayNha,
                          double dienTich, int soBongDen,
                          String chuyenNganh, int sucChua,
                          int soBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen, false);
        setChuyenNganh(chuyenNganh);
        setSucChua(sucChua);
        setSoBonRua(soBonRua);
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if (chuyenNganh == null || chuyenNganh.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Chuyen nganh khong duoc rong."
            );
        }
        this.chuyenNganh = chuyenNganh.trim();
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        if (sucChua < 0) {
            throw new IllegalArgumentException(
                "Suc chua khong duoc am."
            );
        }
        this.sucChua = sucChua;
    }

    public int getSoBonRua() {
        return soBonRua;
    }

    public void setSoBonRua(int soBonRua) {
        if (soBonRua < 0) {
            throw new IllegalArgumentException(
                "So bon rua khong duoc am."
            );
        }
        this.soBonRua = soBonRua;
    }

    @Override
    public String getLoaiPhong() {
        return "Phong thi nghiem";
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && soBonRua >= 4;
    }

    @Override
    public void hienThi() {
        System.out.println(this);
        System.out.println("  Chuyen nganh: " + chuyenNganh);
        System.out.println("  Suc chua: " + sucChua);
        System.out.println("  So bon rua: " + soBonRua);
    }

    @Override
    public String toString() {
        return super.toString()
            + String.format(
                " | Chuyen nganh: %s | Suc chua: %d"
                    + " | So bon rua: %d",
                chuyenNganh, sucChua, soBonRua
            );
    }
}
