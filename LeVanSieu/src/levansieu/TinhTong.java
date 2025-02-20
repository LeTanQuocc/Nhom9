
package levansieu;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập vào hai số nguyên
        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();

        // Tính tổng
        int sum = a + b;

        // In ra kết quả
        System.out.println("Tong hai so la: " + sum);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}

