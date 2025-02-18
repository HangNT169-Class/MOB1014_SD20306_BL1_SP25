/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThuaString.P1_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("moi nhap tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap que quan:");
        String queQuan = sc.nextLine();
        System.out.println("moi nhap gioi tinh:");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap email:");
        String email = sc.nextLine();
        System.out.println("moi nhap sdt:");
        String sdt = sc.nextLine();
        System.out.println("moi nhap diem:");
        double diem = Double.valueOf(sc.nextLine());
        System.out.println("moi nhap mssv:");
        String mssv = sc.nextLine();
        SinhVien sv = new SinhVien(diem, mssv, ten, tuoi, queQuan, gioiTinh, email, sdt);
        sv.display();
    }

}
