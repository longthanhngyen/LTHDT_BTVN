package nguyenThanhLong_25689111;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<PhongHoc> danhSach = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n===== QUAN LY PHONG HOC =====");
            System.out.println("1. Them phong ly thuyet");
            System.out.println("2. Them phong may tinh");
            System.out.println("3. Them phong thi nghiem");
            System.out.println("4. Hien thi danh sach phong");
            System.out.println("5. Hien thi phong dat chuan");
            System.out.println("6. Dem tong so phong");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            try {
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1: {
                        System.out.print("Ma phong: ");
                        String ma = sc.nextLine();

                        System.out.print("Day nha: ");
                        String day = sc.nextLine();

                        System.out.print("Dien tich: ");
                        double dt = Double.parseDouble(sc.nextLine());

                        System.out.print("So bong den: ");
                        int den = Integer.parseInt(sc.nextLine());

                        System.out.print("Co may chieu (true/false): ");
                        boolean mayChieu = Boolean.parseBoolean(sc.nextLine());

                        danhSach.add(
                            new PhongLyThuyet(ma, day, dt, den, mayChieu)
                        );

                        System.out.println("Them phong ly thuyet thanh cong!");
                        break;
                    }

                    case 2: {
                        System.out.print("Ma phong: ");
                        String ma = sc.nextLine();

                        System.out.print("Day nha: ");
                        String day = sc.nextLine();

                        System.out.print("Dien tich: ");
                        double dt = Double.parseDouble(sc.nextLine());

                        System.out.print("So bong den: ");
                        int den = Integer.parseInt(sc.nextLine());

                        System.out.print("So may tinh: ");
                        int soMay = Integer.parseInt(sc.nextLine());

                        danhSach.add(
                            new PhongMayTinh(ma, day, dt, den, soMay)
                        );

                        System.out.println("Them phong may tinh thanh cong!");
                        break;
                    }

                    case 3: {
                        System.out.print("Ma phong: ");
                        String ma = sc.nextLine();

                        System.out.print("Day nha: ");
                        String day = sc.nextLine();

                        System.out.print("Dien tich: ");
                        double dt = Double.parseDouble(sc.nextLine());

                        System.out.print("So bong den: ");
                        int den = Integer.parseInt(sc.nextLine());

                        System.out.print("Chuyen nganh: ");
                        String chuyenNganh = sc.nextLine();

                        System.out.print("Suc chua: ");
                        int sucChua = Integer.parseInt(sc.nextLine());

                        System.out.print("So bon rua: ");
                        int bonRua = Integer.parseInt(sc.nextLine());

                        danhSach.add(
                            new PhongThiNghiem(
                                ma, day, dt, den,
                                chuyenNganh, sucChua, bonRua
                            )
                        );

                        System.out.println("Them phong thi nghiem thanh cong!");
                        break;
                    }

                    case 4:
                        if (danhSach.isEmpty()) {
                            System.out.println("Danh sach phong hoc rong.");
                        } else {
                            for (PhongHoc p : danhSach) {
                                System.out.println(p);
                            }
                        }
                        break;

                    case 5:
                        boolean timThay = false;

                        for (PhongHoc p : danhSach) {
                            if (p.datChuan()) {
                                System.out.println(p);
                                timThay = true;
                            }
                        }

                        if (!timThay) {
                            System.out.println("Khong co phong dat chuan.");
                        }
                        break;

                    case 6:
                        System.out.println(
                            "Tong so phong: " + danhSach.size()
                        );
                        break;

                    case 0:
                        System.out.println("Ket thuc chuong trinh.");
                        break;

                    default:
                        System.out.println("Lua chon khong hop le.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap dung dinh dang so.");
                chon = -1;
            } catch (IllegalArgumentException e) {
                System.out.println("Du lieu khong hop le: " + e.getMessage());
                chon = -1;
            }

        } while (chon != 0);

        sc.close();
    }
}
