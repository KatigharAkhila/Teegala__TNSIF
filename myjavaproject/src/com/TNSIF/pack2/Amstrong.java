package com.TNSIF.pack2;
import java.util.Scanner;
public class Amstrong {
        // to check whether a number is amstrong or not
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = s.nextInt();
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (num != 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == originalNum) {
                System.out.println(originalNum + " is an Armstrong number");
            } else {
                System.out.println(originalNum + " is not an Armstrong number");
            }
            s.close();
        }
    }