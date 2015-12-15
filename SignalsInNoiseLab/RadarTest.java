

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
   
    @Test
    public void isMonsterDetected()
    {
        Radar radar = new Radar(500, 500);
        radar.setMonsterLocation(100, 100);
        for (;radar.getNumScans() <= 50;)
        {
            radar.scan();
        }
       
        int largest = 0;
        int largestRow = 0;
        int largestCol = 0;
        for (int row = 0; row < radar.getNumRows(); row++)
        {
            for (int col = 0; col < radar.getNumCols(); col++)
            {
                if (radar.getAccumulatedDetection(row, col) > largest)
                {
                    largest = radar.getAccumulatedDetection(row, col); 
                    largestRow = row;
                    largestCol = col;
                }
            }
        }
        
        assertEquals(100, largestRow);
        assertEquals(100, largestCol);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

}
