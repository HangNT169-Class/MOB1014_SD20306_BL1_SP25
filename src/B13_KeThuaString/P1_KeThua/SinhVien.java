/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThuaString.P1_KeThua;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    /**
     * Tinh ke thua: Class con se ke thua tat cac thuoc tinh, phuong thuc class
     * Cha extends Class con khong the lay cac thuoc tinh, phuong thuc o pham vi
     * private cua class Cha Cach lay ra thuoc tinh/phuong thuc cua class cha:
     * super.
     */
//    public void test(){
//        super.getTen();
//        super.ten
//    }
    private double diem;
    private String mssv;
    // SV co bn thuoc tinh: 8 thuoc tinh 

//    public SinhVien() {
//    }
//
//    public SinhVien(double diem, String mssv, String ten, int tuoi, String queQuan, int gioiTinh, String email, String sdt) {
//        super(ten, tuoi, queQuan, gioiTinh, email, sdt);
//        this.diem = diem;
//        this.mssv = mssv;
//    }
    public SinhVien() {
    }

    public SinhVien(double diem, String mssv, String ten, int tuoi, String queQuan, int gioiTinh, String email, String sdt) {
        super(ten, tuoi, queQuan, gioiTinh, email, sdt);
        this.diem = diem;
        this.mssv = mssv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void display() {
        // in 8 thuoc tinh 
//        System.out.println("Ten la: " + super.getTen());
//        System.out.println("Tuoi: " + super.getTuoi());
//        System.out.println("Que quan: " + super.getQueQuan());
//        System.out.println("Gioi tinh: " + super.getGioiTinh());
//        System.out.println("SDT: " + super.getSdt());
//        System.out.println("Email: " + super.getEmail());
        super.display();
        System.out.println("Diem: " + diem);
        System.out.println("MSSV: " + mssv);
    }
}
