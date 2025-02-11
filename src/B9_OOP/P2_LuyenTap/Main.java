/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP.P2_LuyenTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
// Tao class DongVat gom cac thuoc tinh: ma - String, ten - String, 
// loai - String va cac contructor, getter, setter va ham inThongTin(): void
// Tao class Main:
// Nhap tt cua 1 doi tuong DongVat tu ban phim 
    // va in ra man hinh tt DongVat

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap tt dong vat: ma, ten,loai
        // B1: Nhap tt cua doi tuong dong vat 
        System.out.println("Moi nhap ma:");
        String ma1 = sc.nextLine();
        System.out.println("Moi nhap ten:");
        String ten1 = sc.nextLine();
        System.out.println("Moi nhap loai:");
        String loai1 = sc.nextLine();
        // B2: Khoi tao doi tuong dong vat 
        DongVat dv = new DongVat(ma1, ten1, loai1);
        // B3: in tt 
        dv.inThongTin();
    }
}
