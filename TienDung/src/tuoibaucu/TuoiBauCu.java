/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuoibaucu;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class TuoiBauCu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Yêu cầu người dùng nhập tuổi
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            // Yêu cầu người dùng nhập tuổi
            System.out.print("Vui lòng nhập tuổi của bạn: ");
            int age = scanner.nextInt();
            
            // Kiểm tra xem tuổi có đủ để đi bầu cử không
            if (age >= 18) {
                System.out.println("Bạn đủ tuổi để tham gia bầu cử.");
            } else {
                System.out.println("Bạn chưa đủ tuổi để tham gia bầu cử.");
            }
        }
    }
    
}
