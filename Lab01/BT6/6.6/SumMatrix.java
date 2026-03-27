package BT6;
import java.util.*;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập kích thước
        System.out.print("Nhap so dong m: ");
        int m = sc.nextInt();

        System.out.print("Nhap so cot n: ");
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] s = new int[m][n];

        // Nhập ma trận a
        System.out.println("Nhap ma tran A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Nhập ma trận b
        System.out.println("Nhap ma tran B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Cộng ma trận
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = a[i][j] + b[i][j];
            }
        }

        // In kết quả
        System.out.println("Ma tran tong:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}
