package com.realdolmen.calculator;

import javafx.print.Printer;

public class Person implements PrintJob {

    public final String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean print(com.realdolmen.calculator.Printer printer) {
        printer.addToQueue(this);
        return printer.startPrinting();
    }


    public void addToQueue(Person p) {

    }

    public boolean startPrinting() {
        return false;
    }
}
