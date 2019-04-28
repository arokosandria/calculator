package pl.edu.agh.mwo.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

@Before


    

    @Test
    public void sumTest(){
        App app =new App();

        assertEquals(5,app.sum(2,3));

    }

    @Test
    public void substractTest(){

        App app =new App();

        assertEquals(5,app.substract(15,10));

    }
    @Test
    public void multiplyTest(){
        App app =new App();

        assertEquals(6,app.multiply(3,3));

    }
    @Test
    public void divideTest(){
        App app =new App();

        assertEquals(15,app.divide(45,3));

    }
    @Test
    public void averageTest(){
        App app =new App();

        assertEquals(3,app.average(3,3));

    }
}
