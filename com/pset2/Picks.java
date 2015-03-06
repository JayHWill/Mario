package com.pset2;

import com.pset2.Printers.Console;
import com.pset2.Printers.Filer;

import java.util.Scanner;

public class Picks {
    private int height;

    public Picks(int height) {
        this.height = height;
    }

    public void Pick() {
        Scanner scanner = new Scanner(System.in);
        String printer = "null";
        while (true) {
            if (printer.equals("null")) {
                System.out.println("Print to console or file? (choose one): ");
                printer = scanner.next();
            } else if (!printer.equals("CONSOLE") && !printer.equals("Console") && !printer.equals("console") &&
                    !printer.equals("FILE") && !printer.equals("File") && !printer.equals("file")) {
                System.out.println("Invalid input. Enter either console or file: ");
                printer = scanner.next();
            }
            if (printer.equals("CONSOLE") || printer.equals("Console") || printer.equals("console") || printer.equals
                    ("FILE") || printer.equals("File") || printer.equals("file")) {
                break;
            }
        }
        if (printer.equals("CONSOLE") || printer.equals("Console") || printer.equals("console")) {
            Console one = new Console(height);
            one.Print();
        } else if (printer.equals("FILE") || printer.equals("File") || printer.equals("file")) {
            Filer one = new Filer(height);
            one.Print();
        }
    }
}
