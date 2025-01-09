/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieu.P3_LuyenTap;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Bai3 {

    // 3. Nhap 2 so nguyen. Tinh tong, hieu , tich, thuong cua 2 so nguyen vua nhap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap 2 so nguyen thu nhat:");
        int a = sc.nextInt();
        System.out.println("Moi nhap so nguyen thu hai:");
        int b = sc.nextInt();
        int tong1 = a + b;
        int hieu1 = a - b;
        int tich2 = a * b;
        double thuong = (double) a / b;
        double thuong1 = 1.0 * a / b;
        System.out.println("tong:" + tong1);
        System.out.println("hieu" + hieu1);
        System.out.println("tich" + tich2);
        System.out.println("Thuong:" + thuong);
        System.out.println("Thuong:" + thuong1);

    }

}
