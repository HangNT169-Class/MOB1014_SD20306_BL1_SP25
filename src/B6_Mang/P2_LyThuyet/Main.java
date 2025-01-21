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
public class Main {
    /**
     * Mang la tap hop tat ca cac phan tu 
     * => Chung kieu du lieu 
     * Mang => []
     * Ham => ()
     * VD: Mang so nguyen, Mang so thuc
     * 1, 2, 3, 9, -1  => so nguyen
     * 'Hang', 1, 1.5, -9 => K phai 1 mang 
     * Mang:
     *  + Mang co dinh: Phai biet duoc size cua mang
     *  + Mang dong: se hoc trong Java (khong quan tam size cua mang)
     *    => Collections trong Java : ArrayList, List, LinkedList... 
     * VD: -1, 2, 9 , -3 ,8 
     * VT: 0   1  2   3   4 
     * => size: 5
     * => ten: arr 
     * => Vi tri cua mang, gia tri cua vi tri. 
     * => Vi tri bat dau 0 va ket thuc la size - 1 (i)
     * Lay gia tri cua vi tri:
     *  + Lay gia tri cua vi tri 0/ dau tien: arr[0] = -1 
     *  + Lay gia tri cua vi tri cuoi cung: arr[size -1] = 8
     *  + Lay gia tri cua vi tri i bat ky: arr[i]
     */
    public static void main(String[] args) {
        /**
         * 1. Nhap tt cua 1 mang so nguyen gom n phan tu. 
         *  In tt ra man hinh
         * 2. Nhap tt cua 1 mang so thuc gom n phan tu. 
         * In tt ra man hinh
         * 3. Nhap tt cua 1 mang so nguyen. 
         * Tinh tich cac phan tu trong mang
         * 4. Nhap tt cua 1 mang so nguyen.
         * Tinh tong cac phan tu o vi tri le trong mang
         */
        
        Scanner sc = new Scanner(System.in);
        // B1: Moi nhap so phan tu trong mang
        System.out.println("Moi hung nhap n: ");
        int n = Integer.valueOf(sc.nextLine());
        // B2: Khai bao mang 
        int arr[] = new int[n]; // Cu phap khai bao mang 
//        float arr1[] = new float[n];
        // B3: Nhap cac phan tu trong mang 
        System.out.println("Nhap cac phan tu trong mang");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(sc.nextLine());
        }
        System.out.println("In cac phan tu trong mang");
        // B4: In ra man hinh
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int tich = 1;
        for (int i = 0; i < n; i++) {
            tich *= arr[i];
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 !=0){
                tong+=arr[i];
            }
//            arr[i]% 2!=0 && i %2==0
        }
        System.out.println("Tich =  "+ tich);
    }
}
