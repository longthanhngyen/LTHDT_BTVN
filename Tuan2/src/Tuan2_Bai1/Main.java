package Tuan2_Bai1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SinhVien _sv1 = new SinhVien(1,"Nguyen Van A",6.5,7.0);
		SinhVien _sv2 = new SinhVien(2,"Nguyen Van B",8.0,7.5);
		SinhVien _sv3 = new SinhVien();

        System.out.println("Nhập mã số sinh viên của sinh viên sv3:");
        int maSV = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập họ và tên của sinh viên sv3:");
        String hoTen = sc.nextLine();

        System.out.println("Nhập điểm lý thuyết của sinh viên sv3:");
        float diemLT = sc.nextFloat();

        System.out.println("Nhập điểm thực hành của sinh viên sv3:");
        float diemTH = sc.nextFloat();

        _sv3.setMaSV(maSV);
        _sv3.setHoTen(hoTen);
        _sv3.setDiemLT(diemLT);
        _sv3.setDiemTH(diemTH);

        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-8s %-30s %10s %10s %10s%n", "masv", "hoten", "diemLT", "diemTH", "diemTB");

        System.out.println(_sv1);
        System.out.println(_sv2);
        System.out.println(_sv3);

        sc.close();
	}

}
