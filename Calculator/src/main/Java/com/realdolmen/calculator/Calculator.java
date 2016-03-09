package com.realdolmen.calculator;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Calculator {

    private FormulaService formulaService;

    public Calculator() {
        formulaService = new FormulaService();
    }

    public int add(int getal1, int getal2) {
        return getal1 + getal2;
    }

    public int multiply(int getal1, int getal2) {
        return getal1 * getal2;
    }

    public int divide(int getal1, int getal2) throws ArithmeticException {
        if(getal2 == 0) {
            throw new ArithmeticException();
        }
        return getal1 / getal2;
    }


    public double calculateSquareRoot(PosDouble d) throws ArithmeticException{
        if(d.getD() < 0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(d.getD());
    }



}
