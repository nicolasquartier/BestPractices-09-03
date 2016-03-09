package com.realdolmen.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.mockito.verification.VerificationMode;

import javax.ejb.EJB;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
//@RunWith(PowerMockRunner.class)
public class FormulaServiceTest {

    @Mock
    Calculator calculator;

    @InjectMocks
    FormulaService service;

    @Before
    public void init() {}

    @Test
    public void numberOfRunsUsesCalculator() throws Exception {
        when(calculator.add(0,5)).thenReturn(5);
        when(calculator.add(5,5)).thenReturn(10);
        when(calculator.add(10,5)).thenReturn(15);


        when(calculator.divide(15,5)).thenReturn(3);

        service.addTheTimeElapsed();
        service.addTheTimeElapsed();
        service.addTheTimeElapsed();

        int numberOfRuns = service.numberOfRuns();
        verify(calculator).divide(15, 5);

        assertEquals(3, numberOfRuns);
    }

    @Test
    public void addTimeElapsedUsesCalculator() {
        when(calculator.add(0, 5)).thenReturn(5);
        when(calculator.add(5, 5)).thenReturn(10);

        service.addTheTimeElapsed();
        service.addTheTimeElapsed();

        verify(calculator).add(0, 5);
        verify(calculator).add(5, 5);
    }
}