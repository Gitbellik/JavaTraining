package com.gubarevich.fundamentals.task4;

import java.util.Scanner;

public class CalculateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1) summ 2) multiply");
        int option = scanner.nextInt();
        if (option != 1 && option != 2) {
            System.out.println("Your option is invalid. Default option is 2 ");
        }
        int sum = 0;
        if (option != 1){
            sum = 1;
        }
        for (int i = 0; i < args.length; i++) {

            if (option == 1) {
                sum = sum + Integer.parseInt(args[i]);
            } else {
                sum = sum * Integer.parseInt(args[i]);
            }
        }
        System.out.println("Result = " + sum);
    }

}
