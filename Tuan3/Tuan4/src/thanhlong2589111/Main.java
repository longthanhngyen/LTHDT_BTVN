package thanhlong2589111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListCD list = new ListCD(5);		// danh sach CD, ban dau chua toi da 5 dia (tu dong tang gap doi)
		int choice = -1;

		do {
// In menu
			System.out.println("\n--- QUAN LY DIA CD ---");
			System.out.println("1. Them dia CD moi");
			System.out.println("2. Xoa dia CD theo ma");
			System.out.println("3. Cap nhat gia CD");
			System.out.println("4. In danh sach CD");
			System.out.println("5. Tinh tong thanh tien");
			System.out.println("0. Thoat");
			System.out.print("Chon chuc nang: ");

			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				choice = -1;				// nhap khong phai so => lua chon khong hop le
			}

			switch (choice) {
				case 1: list.nhapCD(sc); 		break;
				case 2: list.xoaCD(sc); 		break;
				case 3: list.capnhatGiaCD(sc); 	break;
				case 4: list.inDS(); 			break;
				case 5:
					float tong = list.tongThanhTien();
					System.out.printf("=> Tong thanh tien cua tat ca CD: %.2f%n", tong);
					break;
				case 0:
					System.out.println("=> Thoat chuong trinh. Tam biet!");
					break;
				default:
					System.out.println("=> Loi: lua chon khong hop le! Vui long chon tu 0 den 5.");
			}
		} while (choice != 0);

		sc.close();
	}
}