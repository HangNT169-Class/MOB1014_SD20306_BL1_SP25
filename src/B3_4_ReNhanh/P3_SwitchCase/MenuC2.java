/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_4_ReNhanh.P3_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author hangnt169
 */
public class MenuC2 {

    // method reference: ::
    // lamda expession : -> 
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("Case 1");
            }
            case 2 -> {
                System.out.println("Case 2");
            }
            default ->
                throw new AssertionError();
        }
    }
}
