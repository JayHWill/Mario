package com.pset2.Printers;

import com.pset2.Printer;

public class Console implements Printer {
    private int height;
    public Console( int height){
        this.height = height;
    }
    public void Print() {
        int counter = 1;
        for (int i = 1; i <= height; i++) {
            for (int k = 0; k < height - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            if (counter < height) {
                System.out.println();
                counter++;
            }
        }
    }
}