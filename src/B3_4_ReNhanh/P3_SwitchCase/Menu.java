/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_4_ReNhanh.P3_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Menu {

    /**
     * Tao 1 menu gom cac chuc nang sau: 1. Nhap tt ca nhan cua ban than va in
     * ra man hinh: ten, tuoi, diaChi 2. Nhap 2 so nguyen. Tinh tong cua 2 so
     * nguyen 3. Thoat
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // in menu 
        System.out.println("Moi chon chuc nang:");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1: {
                // thuc hien chuc nang 1
                System.out.println("nhap ten");
                String ten = sc.nextLine();
                System.out.println("tuoi la");
                int tuoi = Integer.valueOf(sc.nextLine());
                System.out.println("moi nhap diaChi");
                String diaChi = sc.nextLine();
                System.out.println("ten la" + ten);
                System.out.println("tuoi la " + tuoi);
                System.out.println("diaChi la " + diaChi);
                break;
            }
            case 2: {
                // thuc hien chuc nang 2
                break;
            }
            case 3: {
                break;
            }
            default: {
                System.out.println("Chuc nang khong ton tai");
                break;
            }
        }
    }
}
