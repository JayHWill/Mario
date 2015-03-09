package com.pset3.Printers;

import com.pset3.Printer;
import com.pset3.Pyramid;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filer implements Printer {

    Scanner scanner = new Scanner(System.in);
    StringBuilder SB = new StringBuilder();

    public void Printer(Pyramid obj) {
        PrintWriter writer;
        while (true) {
            try {
                System.out.println("What would you like the file to be called?:");
                SB.append(scanner.next());
                if (!SB.substring(SB.length() - 4).equals(".txt")) {
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
        writer.print(obj.toString());
        writer.close();
    }
}