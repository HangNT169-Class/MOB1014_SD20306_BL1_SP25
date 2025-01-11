/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P2_ReNhanh;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class LyThuyet {

    /**
     * Re nhanh: if..., if...else, switch...case Cu phap: if(dieu kien){ code
     * }else if(dieu kien){ code } ... else{ code } CHI CO DUY NHAT 1 IF... 1
     * ELSE ... CON LAI ELSE IF
     */
    public static void main(String[] args) {
        // Nhap vao 1 so. Kiem tra so nay la so nguyen duong hay nguyen am
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap so nguyen:");
        int number = Integer.valueOf(sc.nextLine());
        if (number < 0) {
            System.out.println("Day la so nguyen am");
        } else if (number == 0) {
            System.out.println("Day khong phai la nguyen duong hoac nguyen am");
        } else {
            System.out.println("Day la so nguyen duong");
        }
    }
    /**
     * 1. Nhap vao chieu dai, chieu rong cua hcn. Tinh P cua hcn va kiem tra 
     * P cua hcn co chia het cho 2 hay khong
     * 2. Nhap vao nam sinh. Tinh tuoi cua ban . Kiem tra tuoi la so chan hay le
     * 3. Nhap diem toan, ly, hoa. 
     * Tinh diem trung binh va kiem tra sv thuoc hoc luoc nao sau day
     *     + diem tb >=9 & <=10: SV xx
     *     + diem tb >=8 & <9: SV gioi
     *     + diem tb >=7 & <8: SV kha 
     *     + diem tb >=6 & <7: SV tb kha
     *     + diem tb >=5 & <6: SV tb
     *     + diem tb < 5: SV yeu
     */
}
