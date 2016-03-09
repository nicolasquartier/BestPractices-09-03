package com.realdolmen.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FamilyTest {

    @Mock
    Person2 father, mother, child1, child2, child3;

    Family family;

    @Before
    public void init() {
        family = new Family();
        family.setFather(father);
        family.setMother(mother);
        family.setChildren(Arrays.asList(child1, child2, child3));
    }

    @Test
    public void setFamilyNameTest() {
        String newLastName = "newLastName";
        family.setFamilyName(newLastName);

        verify(father).setLastName(newLastName);
        verify(mother).setLastName(newLastName);
        verify(child1).setLastName(newLastName);
        verify(child2).setLastName(newLastName);
        verify(child3).setLastName(newLastName);
    }

    @Test
    public void setChildrensNameTest() {
        family.setChildrensNames("nr1","nr2","nr3");

        verify(child1).setFirstName("nr1");
        verify(child2).setFirstName("nr2");
        verify(child3).setFirstName("nr3");
    }
}
