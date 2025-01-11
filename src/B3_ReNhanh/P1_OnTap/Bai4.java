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
public class Bai4 {

    // 4. Nhap tt ca nhan: mssv, ten, tuoi, diaChi, kyHoc, 
    //nganhHoc cua ban than va in ra man hinh
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap thong tin ca nhan!");
        System.out.println("Moi nhap mssv :");
        String mssv = scan.nextLine();
        System.out.println("Moi nhap ten :");
        String ten = scan.nextLine();
        System.out.println("Moi nhap tuoi :");
//        int tuoi = scan.nextInt();
        // C: fflush(stdin)
        // C1: Them scan.nextline
//        scan.nextLine();
        // C2: Ep kieu 
        // B1: COI TAT CA MOI THU NHAP TU BAN PHIM => LA CHOI 
        // B2: SAU DO SE EP KIEU VE KIEU DU LIEU TUONG UNG 
//        String tuoiStr = scan.nextLine();
//        int tuoi = Integer.valueOf(scan.nextLine());
        int tuoi = Integer.valueOf(scan.nextLine()); // ep tu String -> int
//        int number = Integer.parseInt(ten);
//        float number = Float.valueOf(ten);
        System.out.println("Moi nhap dia chi :");
        String diachi = scan.nextLine();
        System.out.println("Moi nhap ky hoc :");
//        int kyhoc = scan.nextInt();
//        scan.nextLine();
        int kyHoc = Integer.valueOf(scan.nextLine());
        System.out.println("Moi nhap nganh hoc :");
        String nganhhoc = scan.nextLine();
        System.out.println("MSSV cua ban la :" + mssv);
        System.out.println("Ten cua ban la :" + ten);
        System.out.println("Tuoi cua ban la :" + tuoi);
        System.out.println("Dia chi cua ban la :" + diachi);
        System.out.println("Ky hoc cua ban la :" + kyHoc);
    }
}
