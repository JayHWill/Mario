package com.pset3.Printers;

import com.pset3.Printer;
import com.pset3.Pyramid;

public class Console implements Printer {
    public void printer(Pyramid obj) {
        System.out.println(obj.toString());
    }
}