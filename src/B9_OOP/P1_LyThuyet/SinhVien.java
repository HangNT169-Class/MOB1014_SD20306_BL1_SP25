/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_OOP.P1_LyThuyet;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    /**
     * Tao class SinhVien gom cac thuoc tinh mssv - String, ten - String, tuoi -
     * int kyHoc- int, nganhHoc - String matKhauFB - String, soDuTrongTaiKhoan -
     * int va cac contructor, getter, setter va ham inThongTin(): void
     */
    private String mssv; // gia tri default cua kieu du lieu
    private String ten;
    private int tuoi;
    private int kyHoc;
    private String nganhHoc;
    private String mkFacebook;
    private int soDu;

    // Khai bao bien => private 
    // contructor: Dung de khoi tao 1 doi tuong.
    // Khoi tao bang tu khoa new
    /**
     * Co 2 loai contructor 
     *  1. Contructor khong tham so 
     *  2. Contructor co tham so 
     * Default cua 1 class la loai contructor khong tham so 
     */
    // C1: Chuot phai => insert code => contructor
    // Tao 2 contructor 
    // Dau hieu nhan biet contructor:
    // 1. Ten cua contructor phai trung voi ten class
    // 2. Contructor khong co kieu du lieu tra ve
    public SinhVien() {
    }

    public SinhVien(String mssv, String ten, int tuoi,
            int kyHoc, String nganhHoc,
            String mkFacebook, int soDu) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.kyHoc = kyHoc;
        this.nganhHoc = nganhHoc;
        this.mkFacebook = mkFacebook;
        this.soDu = soDu;
    }
    // C2: An ctrl space (2 lan)
//    public SinhVien() {
//    }

//    public SinhVien(String mssv, String nganhHoc, String mkFacebook, int soDu) {
//        this.mssv = mssv;
//        this.nganhHoc = nganhHoc;
//        this.mkFacebook = mkFacebook;
//        this.soDu = soDu;
//    }

//    public SinhVien(String mssv, String ten,
//            int tuoi, int kyHoc, String nganhHoc,
//            String mkFacebook, int soDu) {
//        this.mssv = mssv;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.kyHoc = kyHoc;
//        this.nganhHoc = nganhHoc;
//        this.mkFacebook = mkFacebook;
//        this.soDu = soDu;
//    }

    // getter & setter: chuoi phai => insert code => getter & setter
    // getter: Lay ra thong tin thuoc tinh cua 1 doi tuong
    // Lay ra thong tin mssv cua doi tuong SV 
    public String getMssv() {
        return mssv;
    }

    // Thay doi thong tin cua thuoc tinh 
    // Thay doi thong tin mssv cua doi tuong sv
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

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

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getMkFacebook() {
        return mkFacebook;
    }

    public void setMkFacebook(String mkFacebook) {
        this.mkFacebook = mkFacebook;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    // main -> goi de hien thi thong tin => public 
    public void inThongTin() {
        // in toan bo thong tin cua doi tuong SV 
        System.out.println("Ma sv la " + mssv);
        System.out.println("ten " + ten);
        System.out.println("so du" + soDu);
        System.out.println("mat khau" + mkFacebook);
        System.out.println("nganh hoc" + nganhHoc);
        System.out.println("tuoi" + tuoi);
    }
}
