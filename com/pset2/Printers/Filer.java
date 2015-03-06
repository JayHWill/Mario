package com.pset2.Printers;

import com.pset2.Printer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Filer implements Printer {
    private int height;

    public Filer(int height) {
        this.height = height;
    }

    Scanner scanner = new Scanner(System.in);
    String fileName;

    public void Print() {
        PrintWriter writer;
        while (true) {
            try {
                System.out.println("What would you like the file to be called?:");
                fileName = scanner.next();
                StringBuilder SB = new StringBuilder();
                SB.append(fileName);
                if (!fileName.endsWith(".txt")) {
                    SB.append(".txt");
                }
                writer = new PrintWriter(SB.toString(), "UTF-8");
                break;
            } catch (FileNotFoundException ex) {
                System.out.println("File not found.");
            } catch (UnsupportedEncodingException ex) {
                System.out.println("Unsupported encoding type.");
            }
        }
        int counter = 1;
        for (int i = 1; i <= height; i++) {
            for (int k = 0; k < height - i; k++) {
                writer.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                writer.print("X");
            }
            if (counter < height) {
                writer.println();
                counter++;
            }
        }
        writer.close();
    }
}
