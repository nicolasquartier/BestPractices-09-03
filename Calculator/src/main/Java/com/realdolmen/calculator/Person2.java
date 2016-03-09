package com.realdolmen.calculator;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

public class Person2 {

    private String firstName;
    private String lastName;
    private String callName;

    public Person2(String firstName, String lastName, String callName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.callName = callName;
    }

    public Person2() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }
}
