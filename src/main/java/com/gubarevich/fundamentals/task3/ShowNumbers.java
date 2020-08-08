package com.gubarevich.fundamentals.task3;

import java.util.Random;
import java.util.Scanner;

public class ShowNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter numbers count: ");
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();

        System.out.println(" 1) With new line 2) Without new line Please choose your option");
        int option = scanner.nextInt();
        if (option != 1 && option != 2) {
            System.out.println("Your option is invalid. Default option is 2 ");
        }
        Random random = new Random();
        for (int i = 0; i < numbersCount; i++) {
            if (option == 1) {
                System.out.println(random.nextInt());
            } else {
                System.out.print(random.nextInt() + " ");
            }
        }

    }
}
