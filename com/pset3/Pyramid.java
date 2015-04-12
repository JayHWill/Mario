package com.pset3;

import com.pset3.Printers.Console;
import com.pset3.Printers.Filer;

import java.util.Scanner;

public class Pyramid {
    public int height;
    Scanner scanner = new Scanner(System.in);

    public Pyramid() {
        height = input();
    }

    public String toString() {
        String hold;
        StringBuilder SB = new StringBuilder();
        int counter = 1;
        for (int i = 1; i <= height; i++) {
            for (int k = 0; k < height - i; k++) {
                SB.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                SB.append("X");
            }
            if (counter < height) {
                SB.append("\n");
                counter++;
            }
        }
        hold = SB.toString();
        return hold;
    }

    public void printerPick() {
        if (height == 0) {
            return;
        }
        StringBuilder SB = new StringBuilder();
        String printer;
        System.out.println("Print to console or file? (choose one): ");
        SB.append(scanner.next());
        while (true) {
            if (!SB.substring(0).toLowerCase().equals("console") && !SB.substring(0).toLowerCase().equals("file")) {
                System.out.println("Invalid input. Enter either console or file: ");
                SB.delete(0, SB.length());
                SB.append(scanner.next());
            } else {
                printer = SB.toString();
                break;
            }
        }
        if (printer.equals("console")) {
            new Console().printer(this);
        } else if (printer.equals("file")) {
            new Filer().printer(this);
        }
    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        String hold;
        int height;
        while (true) {
            try {
                System.out.print("How high is the pyramid? (between 0 and 23 inclusive): ");
                hold = scanner.next();
                height = Integer.parseInt(hold);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 inclusive" +
                        ".\nTry again.");
                continue;
            }
            if (height < 0 || height > 23) {
                System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 " +
                        "inclusive.\nTry again.");
            } else if (height > 0 || height < 23) {
                return height;
            }
        }
    }
}
