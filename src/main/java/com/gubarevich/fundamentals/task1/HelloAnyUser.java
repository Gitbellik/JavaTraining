package com.gubarevich.fundamentals.task1;

import java.util.Scanner;

public class HelloAnyUser {
    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        if (!userName.equals("")) {
            System.out.println("Hello, " + userName);
        } else {
            System.out.println("No name found");
        }
    }
}
