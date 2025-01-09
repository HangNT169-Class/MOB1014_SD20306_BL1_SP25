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
public class Bai1 {

    // 1. Nhap thong tin ten, diaChi, nganhHoc, kyHoc cua ban than va in ra man hinh
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("moi nhap ten");
        String ten = scan.nextLine();
        System.out.println("moi nhap dia chi");
        String diachi = scan.nextLine();
        System.out.println("moi nhap nganh hoc");
        String nganhhoc = scan.nextLine();
        System.out.println("moi nhap ky hoc");
        String kyhoc = scan.nextLine();
        System.out.println("ten la" + ten);
        System.out.println("dia chi la" + diachi);
        System.out.println("nganh hoc la" + nganhhoc);
        System.out.println("ky hoc la" + kyhoc);

    }
}
