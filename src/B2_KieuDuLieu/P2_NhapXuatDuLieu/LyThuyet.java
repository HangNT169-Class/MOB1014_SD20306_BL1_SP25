/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieu.P2_NhapXuatDuLieu;

import java.util.Scanner; // tu dong import thu vien 

/**
 *
 * @author hangnt169
 */
public class LyThuyet {

    // C => scanf 
    // Java => Scanner
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        // nhap du lieu tu ban phim 
//        System.out.println("Moi nhap so nguyen:");
//        int number = scan.nextInt();
//        // scan.nextFloat()
//        // in so nguyen 
//        System.out.println("So vua nhap la :" + number);

        // 1. Nhap so thuc double -> in ra so thuc 
        // 2. Nhap so nguyen -> in ra so nguyen 
        System.out.println("Moi nhap chuoi:");
        // chuoi:
        // .next: khong doc duoc ky tu sau dau cach
        // .nextLine: doc duoc het
        String ten = scan.nextLine();
        System.out.println("Ten la:" + ten);
        // 1. Nhap thong tin ten, diaChi, nganhHoc, kyHoc cua ban than
        // va in ra man hinh
        // 2. Nhap thong tin chieuCao, canNang cua ban than va in ra man hinh
        // 3. Nhap 2 so nguyen. Tinh tong, hieu , tich, thuong cua 2 so nguyen vua nhap
        // 4. Nhap diem toan, ly, hoa. Tinh diem trung binh 
        // 5. Nhap chieu dai, chieu rong cua hcn. Tinh P,S cua hinh chu nhat
    }
}
