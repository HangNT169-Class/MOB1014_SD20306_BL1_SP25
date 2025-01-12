/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_4_ReNhanh.P2_ReNhanh_IfElse;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("xin moi nhap so tien: ");
        int tien = Integer.valueOf(scan.nextLine());
        double hoaHong = 0;
        if (tien <= 100) {
            hoaHong = 0.05 * tien;
        } else if (tien <= 300 && tien > 100) {
            hoaHong = 0.1 * tien;
        } else {
            hoaHong = 0.2 * tien;
        }
        System.out.println("tong hoa hong la:" + hoaHong);
    }
   
}
