package com.pset2;

import com.pset2.Printers.Console;
import com.pset2.Printers.Filer;

import java.util.Scanner;

public class Picks {
    private int height;

    public Picks(int height) {
        this.height = height;
    }

    public void pick() {
        Scanner scanner = new Scanner(System.in);
        String printer;
        System.out.println("Print to console or file? (choose one): ");
        printer = scanner.next();
        while (true) {
            if (!printer.equals("CONSOLE") && !printer.equals("Console") && !printer.equals("console") &&
                    !printer.equals("FILE") && !printer.equals("File") && !printer.equals("file")) {
                System.out.println("Invalid input. Enter either console or file: ");
                printer = scanner.next();
            } else {
                break;
            }
        }
        if (printer.equals("CONSOLE") || printer.equals("Console") || printer.equals("console")) {
            new Console(height).Print();
        } else if (printer.equals("FILE") || printer.equals("File") || printer.equals("file")) {
            new Filer(height).Print();
        }
    }
}
