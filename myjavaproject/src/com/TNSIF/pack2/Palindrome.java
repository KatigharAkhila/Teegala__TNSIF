package com.TNSIF.pack2;
import java.util.Scanner;
public class Palindrome {
        // to check whether a number is palindrome or not
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = s.nextInt();
            int originalNum = num;
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a palindrome");
            } else {
                System.out.println(originalNum + " is not a palindrome");
            }
            s.close();
        }
    }


}