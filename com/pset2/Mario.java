package com.pset2;

import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {
        int height = input();
        Picks picker = new Picks(height);
        picker.pick();
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        String size;
        int height;
        while (true) {
            try {
                System.out.print("How high is the pyramid? (between 0 and 23 inclusive): ");
                size = scanner.next();
                height = Integer.parseInt(size);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 inclusive" +
                        ".\nTry again.");
                continue;
            }
            if (height < 0 || height > 23) {
                System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 " +
                        "inclusive.\nTry again.");
            } else if (height >= 0 || height < 23) {
                return height;
            }
        }
    }
}
