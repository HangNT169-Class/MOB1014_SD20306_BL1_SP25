/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong;

import B10_MangDong.P1_OnTap.DongHo;
import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class LyThuyet {

    public static void main(String[] args) {
        // Mang dong: K co dinh so luong phan tu trong mang
        // Collection: ArrayList 
        // Cu phap:
//        ArrayList<Kieu du lieu>ten bien = new ArrayList<>();
        // Kieu du lieu k nhan kieu du lieu nguyen thuy 
//        ArrayList<Integer> listSoNguyen = new ArrayList<>();
//        System.out.println(listSoNguyen.size()); // lay do dai cua mang
//        listSoNguyen.add(5);
//        listSoNguyen.add(15);
//        listSoNguyen.add(25);
//        System.out.println(listSoNguyen.size()); // lay do dai cua mang
//        listSoNguyen.remove(1);
//        System.out.println(listSoNguyen.size()); // lay do dai cua mang
//        ArrayList<String> listStr = new ArrayList<>();
//        listStr.add("Str 1");
//        listStr.add("Str 2");
//        System.out.println(listStr);
////        listStr.remove(1); // xoa : vi tri 
//        listStr.remove("Str 2"); // xoa : gia tri 
//        System.out.println("List luc sau");
//        System.out.println(listStr);
//        
        ArrayList<DongHo> listDongHo = new ArrayList<>();
        listDongHo.add(new DongHo("Dh1", "ff", "ff",
                10.5F, "f", 0));
        listDongHo.add(new DongHo("Dh12", "ff", "ff",
                10.5F, "f", 0));
        // arr , vi tri i => gia tri cua vi tri i: arr[i] 
        // => doi vs mang co dinh
        // list, vi tri i => gia tri cua vi tri i: list.get(i)
        // => doi voi mang dong

        // C1: for i: thuong
        for (int i = 0; i < listDongHo.size(); i++) {
            listDongHo.get(i).inThongTin();
        }
        // C2: for..each 
        for (DongHo dh : listDongHo) {
            dh.inThongTin();
        }
        /**
         * Tao class ThucVat gom cac thuoc tinh:
         * ma - int, ten - String , gioiTinh - int, tuoi - int,
         * loaiThucVat - String va contructor getter setter va ham inThongTIn(): void
         * Tao class Main:
         * Su dung ArrayList de in ra thong tin cua 3 phan tu ThucVat voi gia tri cua 
         * doi tuong thuc vat nhap tu ban phim 
         */
    }
}
