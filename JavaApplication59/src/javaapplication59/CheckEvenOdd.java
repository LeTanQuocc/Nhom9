/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication59;


import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        // Nhập số từ người dùng
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập số từ người dùng
            System.out.print("Nhập một số: ");
            int number = scanner.nextInt();
            
            // Kiểm tra số chẵn hay lẻ
            if (number % 2 == 0) {
                System.out.println(number + " là số chẵn.");
            } else {
                System.out.println(number + " là số lẻ.");
            }
        }
    }
}


