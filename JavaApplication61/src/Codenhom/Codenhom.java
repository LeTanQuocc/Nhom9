
package Codenhom;

import java.util.Scanner;

public class Codenhom {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap hai so tu ban phim
        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();

        // Tinh phep nhan
        int result = a * b;

        // Hien thi ket qua
        System.out.println("Ket qua phep nhan: " + a + " x " + b + " = " + result);

        scanner.close();
    }
}
