
package com.TNSIF.pack2;

public class Primenumbers {
        // printing prime numbers from 1 to 100
        public static void main(String[] args){
            System.out.println("Prime numbers between 1 and 100 are:");
            for(int num = 2; num <= 100; num++) {
                int count = 0;

                for (int i = 0; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(num + " ");
                }
            }
        }
    }
