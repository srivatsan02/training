package com.ey;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

 

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

 
public class TestMaths {
    private static Maths mat;
    
  
    @Test
    public void testSum() {
        assertEquals(20, mat.sum(10, 10));
    }
    @Test
    public void testDiv() {
        assertEquals(5, mat.div(10, 2));

    }

//    @Test

//    public void testValidDiv() {

//        assertEquals(true, mat.div(10, 0));

//    }

    @Test
    public void testValidDivision() {
    	assertThrows(ArithmeticException.class, () -> {
            int x = 10 / 0;
        });

    }

}