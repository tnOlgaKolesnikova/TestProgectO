package org.example.lyukutan;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x = in.nextInt();
        System.out.println("Введите второе число:");
        int y = in.nextInt();
        System.out.println("Введите третье число:");
        int z = in.nextInt();
        if (y == z && x == z) {
            System.out.println("Результат: " + x + " " + y + " " + z);
        } else if (x == y) {
            System.out.println("Результат: " + x + " " + y);
        } else if (y == z) {
            System.out.println("Результат: " + y + " " + z);
        } else if (x == z) {
            System.out.println("Результат: " + x + " " + z);
        }
    }
}