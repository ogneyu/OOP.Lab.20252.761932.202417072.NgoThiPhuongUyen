package hust.soict.dsai.lab01.BT2;

import javax.swing.*;

public class Giai_PT_HPT {
    static void main() {
        String yeucau;
        yeucau = JOptionPane.showInputDialog(null,
                "1: PT bac 1 1 an\n2: HPT bac 1 2 an\n3: PT bac 2","Nhap yeu cau:",
                JOptionPane.INFORMATION_MESSAGE);
        double yc=Double.parseDouble(yeucau);
        if (yc == 1){
            String strNum1, strNum2,strNum3;
            strNum1 = JOptionPane.showInputDialog(null,
                    "a: ","Input",
                    JOptionPane.INFORMATION_MESSAGE);
            strNum2 = JOptionPane.showInputDialog(null,
                    "b: ","Input",
                    JOptionPane.INFORMATION_MESSAGE);
            strNum3= JOptionPane.showInputDialog(null,
                    "c: ","Input",
                    JOptionPane.INFORMATION_MESSAGE);
            double a=Double.parseDouble(strNum1);
            double b=Double.parseDouble(strNum2);
            double c=Double.parseDouble(strNum3);
            if (a == 0) {
                // nếu a = 0 thì không còn là phương trình bậc 1 nữa
                if (b == 0) {
                    System.out.println("Vo so nghiem"); // vô số nghiệm
                } else {
                    System.out.println("Vo nghiem"); // vô nghiệm
                }
            } else {
                double x = -b / a; // công thức nghiệm
                System.out.println("x = " + x);
            }
        }
        else if (yc == 2){
            String stra11 = JOptionPane.showInputDialog(null,
                    "a11: ", "Input",
                    JOptionPane.INFORMATION_MESSAGE);

            String stra12 = JOptionPane.showInputDialog(null,
                    "a12: ", "Input",
                    JOptionPane.INFORMATION_MESSAGE);

            String strb1 = JOptionPane.showInputDialog(null,
                    "b1: ", "Input",
                    JOptionPane.INFORMATION_MESSAGE);

            String stra21 = JOptionPane.showInputDialog(null,
                    "a21: ", "Input",
                    JOptionPane.INFORMATION_MESSAGE);

            String stra22 = JOptionPane.showInputDialog(null,
                    "a22: ", "Input",
                    JOptionPane.INFORMATION_MESSAGE);

            String strb2 = JOptionPane.showInputDialog(null,
                    "b2: ", "Input",
                    JOptionPane.INFORMATION_MESSAGE);

            Double a11= Double.parseDouble(stra11);
            Double a21= Double.parseDouble(stra21);
            Double a12= Double.parseDouble(stra12);
            Double a22= Double.parseDouble(stra22);
            Double b1= Double.parseDouble(strb1);
            Double b2= Double.parseDouble(strb2);

            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D != 0) {
                double x1 = D1 / D;
                double x2 = D2 / D;
                System.out.println("Nghiem duy nhat:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                if (D1 == 0 && D2 == 0) {
                    System.out.println("Vo so nghiem"); // vô số nghiệm
                } else {
                    System.out.println("Vo nghiem"); // vô nghiệm
                }
            }
        }
        else if (yc == 3){
            String strNum1, strNum2,strNum3;
            strNum1 = JOptionPane.showInputDialog(null,
                    "a: ","Input",
                    JOptionPane.INFORMATION_MESSAGE);
            strNum2 = JOptionPane.showInputDialog(null,
                    "b: ","Input",
                    JOptionPane.INFORMATION_MESSAGE);
            strNum3= JOptionPane.showInputDialog(null,
                    "c: ","Input",
                    JOptionPane.INFORMATION_MESSAGE);
            double a=Double.parseDouble(strNum1);
            double b=Double.parseDouble(strNum2);
            double c=Double.parseDouble(strNum3);
            double D=b*b-4*a*c;
            if(a==0){
                System.out.println("PT bac nhat:");
                {
                    if (a == 0) {
                        // nếu a = 0 thì không còn là phương trình bậc 1 nữa
                        if (b == 0) {
                            System.out.println("Vo so nghiem"); // vô số nghiệm
                        } else {
                            System.out.println("Vo nghiem"); // vô nghiệm
                        }
                    } else {
                        double x = -b / a; // công thức nghiệm
                        System.out.println("x = " + x);
                    }
                }
            }
            else{
                if(D<0) {
                    System.out.println("Khong co nghiem thuc");
                }
                else if(D==0){
                    System.out.println("Nghiem kep");
                    double x= -b/(2*a);
                    System.out.println("x= "+x);
                }
                else{
                    System.out.println("PT co 2 nghiem phan biet:");
                    double x1= (-b + Math.sqrt(D)) / (2*a);
                    double x2= (-b - Math.sqrt(D)) / (2*a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }
            }

        System.exit(0);
    }
}

