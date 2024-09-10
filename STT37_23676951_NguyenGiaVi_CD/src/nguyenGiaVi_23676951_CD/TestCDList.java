package nguyenGiaVi_23676951_CD;

import java.util.Scanner;

public class TestCDList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CDList cdList = new CDList(10); // Tạo danh sách CD với kích thước tối đa 10

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Them CD");
            System.out.println("2. Xoa CD theo ma");
            System.out.println("3. Xem tat ca CD");
            System.out.println("4. Tinh tong gia thanh");
            System.out.println("5. Tim CD theo ma");
            System.out.println("6. Sap xep theo gia giam dan");
            System.out.println("7. Sap xep theo tua CD tang dan");
            System.out.println("8. Thoat");
            System.out.print("Chon tuy chon: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma CD: ");
                    int maCD = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nhap tua CD: ");
                    String tuaCD = scanner.nextLine();
                    System.out.print("Nhap so bai hat: ");
                    int soBaiHat = scanner.nextInt();
                    System.out.print("Nhap gia thanh: ");
                    double giaThanh = scanner.nextDouble();
                    CD cd = new CD(maCD, tuaCD, soBaiHat, giaThanh);
                    if (cdList.themCD(cd)) {
                        System.out.println("Them CD thanh cong!");
                    } else {
                        System.out.println("Them CD that bai (co the do danh sach day hoac ma da ton tai).");
                    }
                    break;
                case 2:
                    System.out.print("Nhap ma CD de xoa: ");
                    int xoaMaCD = scanner.nextInt();
                    if (cdList.xoaCD(xoaMaCD)) {
                        System.out.println("Xoa CD thanh cong!");
                    } else {
                        System.out.println("Xoa CD that bai (ma khong ton tai).");
                    }
                    break;
                case 3:
                    System.out.println("Danh sach CD:");
                    System.out.println(cdList.toString());
                    break;
                case 4:
                    System.out.println("Tong gia thanh cua cac CD: " + cdList.tongGiaThanh());
                    break;
                case 5:
                    System.out.print("Nhap ma CD de tim: ");
                    int timMaCD = scanner.nextInt();
                    CD foundCD = cdList.timCD(timMaCD);
                    if (foundCD != null) {
                        System.out.println("CD tim duoc: " + foundCD.toString());
                    } else {
                        System.out.println("CD khong ton tai.");
                    }
                    break;
                case 6:
                    cdList.sapXepTheoGia();
                    System.out.println("Danh sach CD sau khi sap xep theo gia giam dan:");
                    System.out.println(cdList.toString());
                    break;
                case 7:
                    cdList.sapXepTheoTua();
                    System.out.println("Danh sach CD sau khi sap xep theo tua CD tang dan:");
                    System.out.println(cdList.toString());
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
