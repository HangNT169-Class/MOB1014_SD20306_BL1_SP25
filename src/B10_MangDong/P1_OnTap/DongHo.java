/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_MangDong.P1_OnTap;

/**
 *
 * @author hangnt
 */
public class DongHo {

    private String ma;
    private String ten;
    private String hang;
    private Float gia;
    private String mauSac;
    private int soNamBaoHanh;

    public DongHo() {
    }

    public DongHo(String ma, String ten, String hang, Float gia, String mauSac, int soNamBaoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.mauSac = mauSac;
        this.soNamBaoHanh = soNamBaoHanh;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoNamBaoHanh() {
        return soNamBaoHanh;
    }

    public void setSoNamBaoHanh(int soNamBaoHanh) {
        this.soNamBaoHanh = soNamBaoHanh;
    }

    public void inThongTin() {
        System.out.println("nhap ma: " + ma);
        System.out.println("nhap ten: " + ten);
        System.out.println("nhap hang: " + hang);
        System.out.println("nhap gia: " + gia);
        System.out.println("nhap mau sac" + mauSac);
        System.out.println("nhap so nam bao hanh" + soNamBaoHanh);
    }

}
