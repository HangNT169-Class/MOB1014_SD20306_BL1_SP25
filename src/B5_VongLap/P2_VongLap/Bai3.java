/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_VongLap.P2_VongLap;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Bai3 {

    // In cac so chan va chia het cho 5 tu 0 -> n  
    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
