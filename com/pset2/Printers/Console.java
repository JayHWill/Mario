package com.pset2.Printers;

import com.pset2.Printer;
import com.pset2.Pyramid;

public class Console implements Printer {
    public void Printer(Pyramid obj) {
        System.out.print(obj.toString());
    }
}