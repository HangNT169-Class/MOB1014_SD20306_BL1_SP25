/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_VongLap.P1_LuyenTap;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class LuyenTap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban chon chuc nang: ");
        int chon = Integer.valueOf(sc.nextLine());

        switch (chon) {
            case 1 -> {

            }
            case 2 -> {
                System.out.println("Moi nhap ten :");
                String ten = sc.nextLine();
                System.out.println("Moi nhap tuoi :");
                int tuoi = Integer.valueOf(sc.nextLine());
                System.out.println("Moi nhap que quan :");
                String quequan = sc.nextLine();
                System.out.println("Moi nhap can nang :");
                Double cannang = Double.valueOf(sc.nextLine());
                System.out.println("moi nhap ky hoc:");
                String kyhoc = sc.nextLine();
                System.out.println("moi nhap chuyen nganh :");
                String chuyennganh = sc.nextLine();
                System.out.println("moi nhap so nha :");
                int sonha = Integer.valueOf(sc.nextLine());
                System.out.println("moi nhap phuong :");
                String phuong = sc.nextLine();
                System.out.println("ten cua ban la" + ten);
                System.out.println("tuoi cua ban la" + tuoi);
                System.out.println("que quan cua ban la" + quequan);
                System.out.println("can nang cua ban la" + cannang);
                System.out.println("ky hoc cua ban la" + kyhoc);
                System.out.println("chuyen nganh cua ban la" + chuyennganh);
                System.out.println("so nha cua ban la" + sonha);
                System.out.println("phuong cua ban la" + phuong);
            }
            case 3 -> {
                System.out.println("Moi nhap diem toan");
                double toan = Double.valueOf(sc.nextLine());
                System.out.println("Moi nhap diem ly");
                double ly = Double.valueOf(sc.nextLine());
                System.out.println("Moi nhap diem hoa");
                double hoa = Double.valueOf(sc.nextLine());
                double diemTb = (toan + ly + hoa) / 3;
                if (diemTb >= 0 && diemTb < 5) {
                    System.out.println("Hoc luc yeu");
                }else if(diemTb >=5 && diemTb < 7){
                    System.out.println("Hoc luc TB");
                }
                // Tu lam not
            }

            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {

            }
            case 7 -> {

            }
            case 8 -> {

            }
            default -> {
                System.out.println("muc ban chon khong co!! moi ban chon lai");
            }

        }
    }
}
