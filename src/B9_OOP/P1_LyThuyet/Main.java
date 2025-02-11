/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP.P1_LyThuyet;

/**
 *
 * @author hangnt
 */
public class Main {
    
    public static void main(String[] args) {
        // Khoi tao 1 doi tuong SV 
//        sinhvien sv = new sinhvien();
//        Main main = new Main();
//        SinhVien sv = new SinhVien();
        // C1: set lan luot cac thuoc tinh
//        sv.setMssv("HE130461");
//        sv.setTen("ky");
//        sv.setTuoi(18);
//        sv.setNganhHoc("CNTT");
//        sv.setMkFacebook("IDK");
//        sv.setSoDu(180000);
//        sv.inThongTin();
          // C2: Su dung contructor full tham so
          SinhVien sv1 = new SinhVien("HE130461", "Nguyen Van A", 
                  10, 7, "KTPM", "123", 10);
          sv1.inThongTin();
        // Tao class DongVat gom cac thuoc tinh: ma - String, ten - String, 
        // loai - String va cac contructor, getter, setter va ham inThongTin(): void
        // Tao class Main:
        // Nhap tt cua 1 doi tuong DongVat va in ra man hinh tt DongVat
    }
}
