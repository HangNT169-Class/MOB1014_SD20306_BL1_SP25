/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Moi nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Hang: ");
        String hang = sc.nextLine();
        System.out.println("Gia: ");
        float gia = Float.valueOf(sc.nextLine());
        System.out.println("Mau sac: ");
        String mau = sc.nextLine();
        System.out.println("So nam bao hanh: ");
        int baoHanh = Integer.valueOf(sc.nextLine());
        DongHo dh = new DongHo(ma, ten, hang, gia, mau, baoHanh);
        dh.inThongTin();
    }

}
