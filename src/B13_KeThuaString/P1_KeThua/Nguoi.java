/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThuaString.P1_KeThua;

/**
 *
 * @author hangnt
 */
public class Nguoi {

    private String ten;
    private int tuoi;
    private String queQuan;
    private int gioiTinh;
    private String email;
    private String sdt;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String queQuan, int gioiTinh, String email, String sdt) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", tuoi=" + tuoi + ", queQuan=" + 
                queQuan + ", gioiTinh=" + gioiTinh + ", email=" + email + ", sdt=" + sdt + '}';
    }

    public void display() {
//        System.out.println("ten la: " + ten);
//        System.out.println("tuoi la: " + tuoi);
//        System.out.println("que quan la: " + queQuan);
//        System.out.println("gioi tinh la: " + gioiTinh);
//        System.out.println("email la: " + email);
//        System.out.println("sdt" + sdt);
        System.out.println(toString());
    }
}
