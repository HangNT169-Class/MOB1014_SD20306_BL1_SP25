/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Bai2 {
    // 2. Nhap chieu dai, chieu rong cua hcn. Tinh P,S cua hcn

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double chieuDai = scan.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double chieuRong = scan.nextDouble();
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        System.out.println("Chu vi hcn la : " + chuVi);
        System.out.println("Dien tich la: " + dienTich);
    }

}
