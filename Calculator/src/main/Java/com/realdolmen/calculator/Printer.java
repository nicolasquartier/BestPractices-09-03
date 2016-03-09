package com.realdolmen.calculator;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by NQRAZ66 on 9/03/2016.
 */
public class Printer {
    private Queue<PrintJob> jobs = new LinkedList<PrintJob>();

    public void addToQueue(PrintJob job) {
        jobs.add(job);
    }

    public boolean startPrinting() {
        //Complicated method
        return true;
    }
}
