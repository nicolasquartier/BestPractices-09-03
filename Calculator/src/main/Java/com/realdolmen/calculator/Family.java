package com.realdolmen.calculator;

import java.util.List;


public class Family {

    private Person2 father;
    private Person2 mother;
    private List<Person2> children;

    public Person2 getFather() {
        return father;
    }

    public void setFather(Person2 father) {
        this.father = father;
    }

    public Person2 getMother() {
        return mother;
    }

    public void setMother(Person2 mother) {
        this.mother = mother;
    }

    public List<Person2> getChildren() {
        return children;
    }

    public void setChildren(List<Person2> children) {
        this.children = children;
    }

    public void setFamilyName(String newLastName) {
        this.father.setLastName(newLastName);
        this.mother.setLastName(newLastName);
        for (Person2 child : getChildren()) {
            child.setLastName(newLastName);
        }
    }

    public void setChildrensNames(String... names) {
        int index = 0;
        for (String name : names) {
            children.get(index).setFirstName(name);
            index++;
        }
    }
}
