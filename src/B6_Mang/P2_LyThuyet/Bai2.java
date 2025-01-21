/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_Mang.P2_LyThuyet;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class Bai2 {
    // 2. Nhap tt cua 1 mang so thuc gom n phan tu. 
    // In tt ra man hinh
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("moi nhap mang");
        int soNguyen = Integer.valueOf(scan.nextLine());
        double[] arr = new double[soNguyen];
        System.out.println("moi nhap cac phan tu trong mang");
        for (int i = 0; i < soNguyen; i++) {
            arr[i] = Double.valueOf(scan.nextLine());
        }
        for (int i = 0; i < soNguyen; i++) {
            System.out.println(arr[i]);
        }
    }
}
