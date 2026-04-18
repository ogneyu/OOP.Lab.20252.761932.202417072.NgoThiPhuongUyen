package hust.soict.dsai.lab01.BT2;

import javax.swing.*;

public class CalculateTwoNumbers {
    static void main() {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ","Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1=  Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ","Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2= Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double different = num1 - num2;
        double product = num1 * num2;
        if(num2==0){
            System.out.println("Cannot divide by zero.");
            return;
        }
        double quotient = num1 / num2;

        System.out.println("Sum= "+sum);
        System.out.println("Different= "+different);
        System.out.println("Product= "+product);
        System.out.println("Quotient= "+quotient);

        System.exit(0);
    }
}

