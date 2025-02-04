package com.javaeasy.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    
    @Test
    public void addTest(){
        // Arrange
        int a, b,c,d,e,f;
      

        // Act
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = -1;
        int onePlusTwo = Calculator.add(a, b);
        int minusOne = Calculator.add(f, f);
        int oneToFive = Calculator.add(a,b,c,d,e);

        // Assert
        assertEquals(3,onePlusTwo);
        assertEquals(-2, minusOne);
        assertEquals(15,oneToFive);

    }


    @Test
    public void multTest(){
        // Arrange
        int a, b,c,d,e,f;
      

        // Act
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = -1;
        int onePlusTwo = Calculator.mult(a, c);
        int minusOne = Calculator.mult(f, c);
        int oneToFive = Calculator.mult(a,b,c,d,e);

        // Assert
        assertEquals(3,onePlusTwo);
        assertEquals(-3, minusOne);
        assertEquals(120,oneToFive);

    }
}


