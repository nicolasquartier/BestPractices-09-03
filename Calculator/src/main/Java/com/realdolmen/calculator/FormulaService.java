package com.realdolmen.calculator;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateful;

@Stateful
public class FormulaService {

    private int secondsElapsed = 0;

    @EJB
    Calculator c;


    public FormulaService() {
    }

    public int getSecondsElapsed() {
        return secondsElapsed;
    }

    public void setSecondsElapsed(int secondsElapsed) {
        this.secondsElapsed = secondsElapsed;
    }

    public void addTheTimeElapsed() {
        secondsElapsed = c.add(secondsElapsed,5);
    }

    public int secondsPassed() {
        return secondsElapsed;
    }

    public void skipAhead(int skipCount) {
        for (int i = 0; i < skipCount; i++) {
            addTheTimeElapsed();
        }
    }

    public int numberOfRuns() {
        return c.divide(secondsElapsed, 5);
    }
}
