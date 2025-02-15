/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_CRUDListFixCung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1: Goi class DienThoaiService
        DienThoaiService service1 = new DienThoaiService();
        // B2: Khoi tao 1 doi tuong ArrayList
        ArrayList<DienThoai>listDienThoai = new ArrayList<>();
        
        while (true) {
            System.out.println("moi chon chuc nang:");
            int menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1 -> {
                    System.out.println("chuc nang 1");
                    service1.themDienThoai(listDienThoai);
                }
                case 2 -> {
                    System.out.println("chuc nang 2");
                    service1.inThongTinDienThoai(listDienThoai);
                }
                case 3 -> {
                    System.out.println("chuc nang 3");
                    System.out.println("Moi nhap gia muon tim kiem");
                    int gia = Integer.valueOf(sc.nextLine());
                    service1.timDienThoaiCoGiaTriNhapTuBanPhim(listDienThoai, gia);
                }
                case 4 -> {
                    System.out.println("chuc nang 4");
                }
                case 5 -> {
                    System.out.println("chuc nang 5");
                    service1.sapXepDienThoaiTheoGiaTangDan(listDienThoai);
                    // in lai 
                    service1.inThongTinDienThoai(listDienThoai);
                }
                case 6 -> {
                    System.out.println("chuc nang 6");
                }
                case 7 -> {
                    System.out.println("chuc nang 7");
                }
                case 8 -> {
                    System.out.println("chuc nang 8");
                }
                case 0 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("chuc nang nay ko ton tai hay chon lai");
                }

            }
        }
    }
}
