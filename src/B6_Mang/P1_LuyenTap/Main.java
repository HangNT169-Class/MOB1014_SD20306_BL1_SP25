/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_Mang.P1_LuyenTap;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Main {

   /**
     * Tao 1 menu gom cac chuc nang sau. menu lap lai toi khi chon chuc nang thao 
     * 1. Nhap tt cua dong vat nyc: ten, loai, can nang, giong loai 
     * 2. Tinh tong hieu tich thuong cua 3 so nguyen nhap tu ban phim
     * 3. Tinh tong cua cac so chan tu 1-n 
     * 4. Kiem tra so nguyen duong hoac nguyen am cua 1 so nguyen nhap tu ban phim
     * 5. Tinh tich cua cac so chan va chia het cho 5 tu 1 - n
     * 6. Thoat
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Moi chon chuc nang: ");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1 -> {
                    System.out.println("Sv nyc");

                }
                case 2 -> {
                    System.out.println("Tinh tong, hieu, tich, thuong");
                    System.out.println("Nhap a= ");
                    int a = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap b= ");
                    int b = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap c= ");
                    int c = Integer.valueOf(sc.nextLine());
                    int tong = a + b + c;
                    int hieu = a - b - c;
                    int tich = a * b * c;
                    double thuong = (double) a / b / c;
                    System.out.println("Tong 3 so la: " + tong);
                    System.out.println("Hieu 3 so la: " + hieu);
                    System.out.println("Tich 3 so la: " + tich);
                    System.out.println("Thuong 3 so la: " + thuong);
                }
                case 3 -> {
                    System.out.println("chuc nANG 3");

                }
                case 4 -> {
                    System.out.println("chuc nang 4");

                }
                case 5 -> {
                    System.out.println("chuc nang 5");
                    System.out.println("Nhap So n");
                    int n = Integer.valueOf(sc.nextLine());
                    int tich = 1;
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 2 == 0 && i % 5 == 0) {
                            tich *= i;
                        }
                    }
                    System.out.println("tich" + tich);
                }
                case 6 -> {
                    System.exit(0);

                }
                default -> {
                    System.out.println("Khong co chuc nang nay vui long chon lai");
                }

            }
        }
    }
}
