/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P2_MangDong;

/**
 *
 * @author hangnt
 */
public class ThucVat {
    private String ma;
    private String ten;
    private String gioiTinh;
    private int tuoi;

    public ThucVat(String ma, String ten, String gioiTinh, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public ThucVat() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void inThongTin(){
        System.out.println("ten la: "+ten);
        System.out.println("tuoi la:"+tuoi);
        System.out.println("gioi tinh la: " +gioiTinh);
        System.out.println("ma la: " +ma);
    }
}
