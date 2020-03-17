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
public class CalcTotalTest {
    
    @Parameterized.Parameter(0)
    public double cost;
    @Parameterized.Parameter(1)
    public double tip;
    @Parameterized.Parameter(2)
    public double result;
    
    //test data for CalcTotalTest
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            //test case 1
            {5.00, 0.75, 5.75}, {5.00, 0.90, 5.90}, {5.00, 1.00, 6.00}, 
            {5.00, 1.10, 6.10}, {5.00, 1.25, 6.25},
            //test case 2
            {10.00, 1.50, 11.50}, {10.00, 1.80, 11.80}, {10.00, 2.00, 12.00}, 
            {10.00, 2.20, 12.20}, {10.00, 2.50, 12.50}, 
            //test case 3
            {15.00, 2.25, 17.25}, {15.00, 2.70, 17.70}, {15.00, 3.00, 18.00}, 
            {15.00, 3.30, 18.30}, {15.00, 3.75, 18.75}, 
            //test case 4
            {20.00, 3.00, 23.00}, {20.00, 3.60, 23.60}, {20.00, 4.00, 24.00}, 
            {20.00, 4.40, 24.40}, {20.00, 5.00, 25.00}, 
            //test case 5
            {25.00, 3.75, 28.75}, {25.00, 4.50, 29.50}, {25.00, 5.00, 30.00}, 
            {25.00, 5.50, 30.50}, {25.00, 6.25, 31.25}, 
            //test case 6
            {30.00, 4.50, 34.50}, {30.00, 5.40, 35.40}, {30.00, 6.00, 36.00}, 
            {30.00, 6.60, 36.60}, {30.00, 7.50, 37.50}, 
            //test case 7
            {8.75, 1.31, 10.06}, {8.75, 1.58, 10.33}, {8.75, 1.75, 10.50}, 
            {8.75, 1.93, 10.68}, {8.75, 2.19, 10.94},      
            //test case 8
            {14.80, 2.22, 17.02}, {14.80, 2.66, 17.46}, {14.80, 2.96, 17.76}, 
            {14.80, 3.26, 18.06}, {14.80, 3.70, 18.50}, 
            //test case 9
            {18.25, 2.74, 20.99}, {18.25, 3.29, 21.54}, {18.25, 3.65, 21.90}, 
            {18.25, 4.02, 22.27}, {18.25, 4.56, 22.81}, 
            //test case 10  
            {21.50, 3.23, 24.73}, {21.50, 3.87, 25.37}, {21.50, 4.30, 25.80}, 
            {21.50, 4.73, 26.23}, {21.50, 5.38, 26.88}, 
            //test case 11
            {27.40, 4.11, 31.51}, {27.40, 4.93, 32.33}, {27.40, 5.48, 32.88}, 
            {27.40, 6.03, 33.43}, {27.40, 6.85, 34.25}, 
            //test case 12
            {32.20, 4.83, 37.03}, {32.20, 5.80, 38.00}, {32.20, 6.44, 38.64}, 
            {32.20, 7.08, 39.28}, {32.20, 8.05, 40.25}
        };
        return Arrays.asList(data);
    } //end Collection--data
    
    @Test
    public void calcTotalTest() {
        //act
        double actual = tipcalculator.TipCalculator.calcTotal(cost, tip);
        //assert
        assertEquals(result, actual, 0.01);
    } //end calcTotalTest
    
} //end class CalcTotalTest
