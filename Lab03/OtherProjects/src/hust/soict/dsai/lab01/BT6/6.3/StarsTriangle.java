package hust.soict.dsai.lab01.BT6;

import java.util.Scanner;

public class StarsTriangle {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = keyboard.nextInt();
        int j = 1;
        for (int i = n ; i > 0; i--) {
            for (int u = 1; u < i; u++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            j += 2;
            System.out.println();
        }
    }
}
