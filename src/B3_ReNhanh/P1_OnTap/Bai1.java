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
public class Bai1 {
    /**
     * 1. Nhap tt ca nhan cua ban than: mssv,ten,nganhHoc 
     * va in ra man hinh
     * 2. Nhap chieu dai, chieu rong cua hcn. Tinh P,S cua hcn
     * 3. Nhap tt ca nhan: diem toan, diem ly,diem hoa cua 
     * ban than va in ra man hinh
     * 4. Nhap tt ca nhan: mssv, ten, tuoi, diaChi, kyHoc, 
     * nganhHoc cua ban than va in ra man hinfh
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap mssv: ");
        String mssv = sc.nextLine();
        System.out.println("Moi nhap ten:  ");
        String ten = sc.nextLine();
        System.out.println("Moi nhap nganh hoc: ");
        String nganhHoc = sc.nextLine();
        System.out.println("mssv la: "+mssv);
        System.out.println("Ten la: "+ten);
        System.out.println("nganh hoc la: "+nganhHoc);
    }
}
