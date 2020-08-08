package com.gubarevich.fundamentals.task5;

import java.util.Scanner;

public class GetMonthByNumber {
    public static void main(String[] args) {
        System.out.println("Please enter month number (1-12): ");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Wrong month number ");
        } else {
            System.out.println(Month.get(monthNumber).getName());
        }

    }
}
