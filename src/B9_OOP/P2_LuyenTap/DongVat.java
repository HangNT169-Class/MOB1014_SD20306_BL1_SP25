/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP.P2_LuyenTap;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String ma;
    private String ten;
    private String loai;

    public DongVat() {
    }

    public DongVat(String ma, String ten, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void inThongTin() {
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Loai: " + loai);
    }
}
