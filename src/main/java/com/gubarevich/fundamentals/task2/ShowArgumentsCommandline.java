package com.gubarevich.fundamentals.task2;

public class ShowArgumentsCommandline {
    public static void main(String[] args) {
        int argsLenght = args.length;
        for (int i = argsLenght - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
