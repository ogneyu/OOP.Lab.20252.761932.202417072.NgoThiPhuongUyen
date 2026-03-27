package BT6;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // In mảng ban đầu
        System.out.println("Mang ban dau: " + Arrays.toString(arr));

        // Sắp xếp
        Arrays.sort(arr);

        // In mảng sau khi sắp xếp
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));

        // Tính tổng
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Tính trung bình
        double avg = (double) sum / n;

        // In kết quả
        System.out.println("Tong = " + sum);
        System.out.println("Trung binh = " + avg);
    }
}
