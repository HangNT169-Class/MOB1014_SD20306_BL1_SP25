/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThuaString.P2_Chuoi;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        String str = "SD20306";
        // Lay do dai cua chuoi
        System.out.println(str.length());
        // Kiem tra xem 2 chuoi co bang nhau hay khong
        // equals: 2 chuoi bang nhau hay khong: boolean
        System.out.println(str.equals("sd20306"));
        // equalsIgnoreCase: K Phan biet hoa thuong
        System.out.println(str.equalsIgnoreCase("sd20306"));
        // compareTo : int 
        // >0: chuoi 1 > chuoi 2
        // = 0: hai chuoi = 
        // <0: chuoi 1 < chuoi 2
        System.out.println(str.compareTo("sd20306"));
        // khong phan biet hoa thuong
        System.out.println(str.compareToIgnoreCase("sd20306"));
        // contains : kiem tra chua 
        System.out.println(str.contains("S"));
        String str2 =" Java 1";
        // ghep 2 chuoi 
        System.out.println(str + str2);
        System.out.println(str.concat(str2));
        // bat dau bang: startWith
        System.out.println(str.startsWith("A"));
        // ket thuc bang: endWith 
        System.out.println(str.endsWith("6"));
//        https://v1study.com/java-ham-xu-ly-chuoi-string-a577.html
    }
}
