// to check number is even or odd
package com.TNSIF.pack2;
import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is even number");
        }
        else
        {
            System.out.println(num+" is odd number");
        }
        s.close();
    }

    


   