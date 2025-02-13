/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThucVat> listThucVat = new ArrayList<>();

        System.out.println("moi nhap thong tin:");
        System.out.println("moi nhap ma:");
        String ma = sc.nextLine();
        System.out.println("moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("moi nhap gioi tinh");
        String gioiTinh = sc.nextLine();
        System.out.println("moi nhap tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        ThucVat tv = new ThucVat(ma, ten, gioiTinh, tuoi);

        System.out.println("moi nhap lan nua:");
        System.out.println("moi nhap ma:");
        String ma1 = sc.nextLine();
        System.out.println("moi nhap ten:");
        String ten1 = sc.nextLine();
        System.out.println("moi nhap gioi tinh");
        String gioiTinh1 = sc.nextLine();
        System.out.println("moi nhap tuoi:");
        int tuoi1 = Integer.valueOf(sc.nextLine());
        ThucVat tv1 = new ThucVat(ma1, ten1, gioiTinh1, tuoi1);

        listThucVat.add(tv);
        listThucVat.add(tv1);

        for (ThucVat thucVat : listThucVat) {
            thucVat.inThongTin();
        }
    }
}
