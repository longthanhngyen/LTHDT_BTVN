package thanhlong25689111;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        HangThucPham tp1 = new HangThucPham("001", "Gao", 100000, LocalDate.of(2018, 1, 10), LocalDate.of(2018, 7, 10));
        HangThucPham tp2 = new HangThucPham("002", "Mi", 5000, LocalDate.of(2025, 1, 1), LocalDate.of(2026, 12, 31));
        HangThucPham tp3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.of(2017, 1, 1), LocalDate.of(2018, 1, 1));

        System.out.printf("%-10s %-12s %20s %15s %15s %15s%n",
                "MaHang", "TenHang", "DonGia", "NgaySanXuat", "NgayHetHan", "GhiChu");
        System.out.println("-".repeat(98));

        in(tp1);
        in(tp2);
        in(tp3);
    }

    private static void in(HangThucPham h) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // MM = tháng, mm = phút
        String ghiChu = h.get_ngayHH().isBefore(LocalDate.now()) ? "Het han" : "Con han su dung";

        System.out.printf("%-10s %-12s %20s %15s %15s %15s%n",
                h.get_maHang(), h.get_tenHang(), df.format(h.get_donGia()),
                dtf.format(h.get_ngaySX()), dtf.format(h.get_ngayHH()), ghiChu);
    }
}