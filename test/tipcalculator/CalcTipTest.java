package tipcalculator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class CalcTipTest {
    
    @Parameterized.Parameter(0)
    public double cost;
    @Parameterized.Parameter(1)
    public double tipPct;
    @Parameterized.Parameter(2)
    public double result;
    
    //test data for CalcTipTest
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            //test case 1
            {5.00, 15, 0.75}, {5.00, 18, 0.90}, {5.00, 20, 1.00}, 
            {5.00, 22, 1.10}, {5.00, 25, 1.25},
            //test case 2
            {10.00, 15, 1.50}, {10.00, 18, 1.80}, {10.00, 20, 2.00}, 
            {10.00, 22, 2.20}, {10.00, 25, 2.50}, 
            //test case 3
            {15.00, 15, 2.25}, {15.00, 18, 2.70}, {15.00, 20, 3.00}, 
            {15.00, 22, 3.30}, {15.00, 25, 3.75}, 
            //test case 4
            {20.00, 15, 3.00}, {20.00, 18, 3.60}, {20.00, 20, 4.00}, 
            {20.00, 22, 4.40}, {20.00, 25, 5.00}, 
            //test case 5
            {25.00, 15, 3.75}, {25.00, 18, 4.50}, {25.00, 20, 5.00}, 
            {25.00, 22, 5.50}, {25.00, 25, 6.25}, 
            //test case 6
            {30.00, 15, 4.50}, {30.00, 18, 5.40}, {30.00, 20, 6.00}, 
            {30.00, 22, 6.60}, {30.00, 25, 7.50}, 
            //test case 7
            {8.75, 15, 1.31}, {8.75, 18, 1.58}, {8.75, 20, 1.75}, 
            {8.75, 22, 1.93}, {8.75, 25, 2.19},      
            //test case 8
            {14.80, 15, 2.22}, {14.80, 18, 2.66}, {14.80, 20, 2.96}, 
            {14.80, 22, 3.26}, {14.80, 25, 3.70}, 
            //test case 9
            {18.25, 15, 2.74}, {18.25, 18, 3.29}, {18.25, 20, 3.65}, 
            {18.25, 22, 4.02}, {18.25, 25, 4.56}, 
            //test case 10  
            {21.50, 15, 3.23}, {21.50, 18, 3.87}, {21.50, 20, 4.30}, 
            {21.50, 22, 4.73}, {21.50, 25, 5.38}, 
            //test case 11
            {27.40, 15, 4.11}, {27.40, 18, 4.93}, {27.40, 20, 5.48}, 
            {27.40, 22, 6.03}, {27.40, 25, 6.85}, 
            //test case 12
            {32.20, 15, 4.83}, {32.20, 18, 5.80}, {32.20, 20, 6.44}, 
            {32.20, 22, 7.08}, {32.20, 25, 8.05}
        };
        return Arrays.asList(data);
    } //end Collection--data
    
    @Test
    public void calcTipTest() {
        //act
        double actual = tipcalculator.TipCalculator.calcTip(cost, tipPct);
        //assert
        assertEquals(result, actual, 0.01);
    } //end calcTipTest
    
} //end class CalcTipTest
