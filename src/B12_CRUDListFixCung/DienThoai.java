/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_CRUDListFixCung;

/**
 *
 * @author hangnt
 */
public class DienThoai {

    private int ma;
    private String ten;
    private String dongMay;
    private int boNho;
    private int gia;

    public DienThoai() {
    }

    public DienThoai(int ma, String ten, String dongMay, int boNho, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.dongMay = dongMay;
        this.boNho = boNho;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDongMay() {
        return dongMay;
    }

    public void setDongMay(String dongMay) {
        this.dongMay = dongMay;
    }

    public int getBoNho() {
        return boNho;
    }

    public void setBoNho(int boNho) {
        this.boNho = boNho;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void inThongTin() {
        System.out.println("ma la: " + ma);
        System.out.println("ten la: " + ten);
        System.out.println("dong may: " + dongMay);
        System.out.println("bo nho: " + boNho);
        System.out.println("gia: " + gia);
    }

    public String test() {
        return "a";
    }

}
