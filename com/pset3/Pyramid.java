package com.pset3;

import com.pset3.Printers.Console;
import com.pset3.Printers.Filer;

import java.util.Scanner;

public class Pyramid {
    public int height;
    Scanner scanner = new Scanner(System.in);

    public Pyramid() {
        while (true) {
            try {
                if (height > 0 && height < 24) {
                    break;
                } else if (height < 0 || height > 23) {
                    System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 " +
                            "inclusive.\nTry again.");
                    System.out.print("How high is the pyramid? (between 0 and 23 inclusive): ");
                } else {
                    System.out.print("How high is the pyramid? (between 0 and 23 inclusive): ");
                }
                height = Integer.parseInt(scanner.next());
                if (height == 0) {
                    System.out.println("Thank you! Have a nice day!");
                    return;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid entry. Input must be in the form of numbers between 0 and 23 inclusive" +
                        ".\nTry again.");
                height = 0;
            }
        }
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
        if( height == 0){
            return;
        }
        StringBuilder SB = new StringBuilder();
        String printer;
        System.out.println("Print to console or file? (choose one): ");
        SB.append(scanner.next());
        while (true) {
            if (!SB.substring(0).equals("CONSOLE") && !SB.substring(0).equals("Console") && !SB.substring(0).equals
                    ("console") &&
                    !SB.substring(0).equals("FILE") && !SB.substring(0).equals("File") && !SB.substring(0).equals
                    ("file")) {
                System.out.println("Invalid input. Enter either console or file: ");
                SB.delete(0, SB.length());
                SB.append(scanner.next());
            } else {
                printer = SB.toString();
                break;
            }
        }
        if (printer.equals("CONSOLE") || printer.equals("Console") || printer.equals("console")) {
            new Console().printer(this);
        } else if (printer.equals("FILE") || printer.equals("File") || printer.equals("file")) {
            new Filer().printer(this);
        }
    }
}
