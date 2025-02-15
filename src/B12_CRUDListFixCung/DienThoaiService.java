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
public class DienThoaiService {
    // service => chua cac chuc nang => la tang xu ly logic cua toan bo du an 

    // 8 ham 
    public void themDienThoai(ArrayList<DienThoai> lists) {
        // B1: Nhap tt dien thoai tu ban phim 
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap ma");
        int ma = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap ten");
        String ten = sc.nextLine();
        System.out.println("moi nhap dong may");
        String dongMay = sc.nextLine();
        System.out.println("moi nhap gia");
        int gia = Integer.valueOf(sc.nextLine());
        System.out.println("moi nhap bo nho ");
        int boNho = Integer.valueOf(sc.nextLine());
        // B2: Khoi tao 1 doi tuong dien thoai
        DienThoai dt = new DienThoai(ma, ten, dongMay, boNho, gia);
        // B3: Them doi tuong vao list 
        lists.add(dt);
    }

    public void inThongTinDienThoai(ArrayList<DienThoai> listDienThoai) {
        // for i  => 
//        vi tri i => listDienThoai.get(vi tri)
        // for each (:)
//        for(Doi tuong : ten mang){
//        
//        }
//        for (DienThoai dt : listDienThoai) {
////            System.out.println(dt.test());
//            dt.inThongTin();
////            System.out.println(dt.inThongTin());
//        }
        // foreach + lamda expersion (->)
        listDienThoai.forEach(s -> s.inThongTin());
        // foreach + method references(::)

    }

    public void timDienThoaiCoGiaTriNhapTuBanPhim(ArrayList<DienThoai> lists,
            int gia) {
        for (DienThoai dt : lists) {
            if (dt.getGia() == gia) {
                dt.inThongTin();
            }
        }
        // filter, stream 
    }

    public void lietKeDienThoaiCoBoNhoBangBoNhoVuaNhap(ArrayList<DienThoai> lists) {

    }

    // sap xep voi kieu du lieu la so => dau -
    public void sapXepDienThoaiTheoGiaTangDan(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> o1.getGia() - o2.getGia());
    }

    // sap xep voi kieu du lieu la chu => compareTo()
    public void sapXepDienThoaiTheoTenGiamDan(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
    }

    public void xoaDienThoaiTheoViTri(ArrayList<DienThoai> lists, int viTri) {
        lists.remove(viTri);
    }

    public void xoaDienThoaiTheoMaNhap(ArrayList<DienThoai> lists, int ma) {
        // removeIf
        // DT1: ma = 3 
        // Dt2: ma = 4
        // DT3: ma = 5
        // ma muon xoa: 7 
        lists.removeIf(s -> s.getMa() == ma);
    }

}
