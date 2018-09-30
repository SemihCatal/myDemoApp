package com.mycompany.app;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5));
      ArrayList<Integer> array2=new ArrayList<>(Arrays.asList(1,5,6,7,8));
      assertTrue(new App().searchSumAndDiff(array, array2,3,2));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2=new ArrayList<>(Arrays.asList(1,5,6,7,8));
      assertFalse(new App().searchSumAndDiff(array,array2, 5,4));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array2=new ArrayList<>(Arrays.asList(1,5,6,7,8));
      assertFalse(new App().searchSumAndDiff(array, array2,1,2));
    }

    public void testNull() {
      assertFalse(new App().searchSumAndDiff(null,null,2, 1));
    }

}
