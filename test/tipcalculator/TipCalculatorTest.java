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
public class TipCalculatorTest {
    
    @Parameterized.Parameter(0)
    public double cost;
    @Parameterized.Parameter(1)
    public double tipPct;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            { 30.00, 15 },
            { 30.00, 18 },
            { 30.00, 20 },
            { 30.00, 22 },
            { 30.00, 25 }
                
        };
        return Arrays.asList(data);
    } //end Collection...data
    
    @Test
    public void calcTipTest() {
        //arrange
        //double tipPct = 15;
        //double cost = 30.0;
        double result = cost * (tipPct / 100);
        //act
        double actual = tipcalculator.TipCalculator.calcTip(cost, tipPct);
        //assert
        assertEquals(result, actual, 0.000);
    } //end calcTipTest
    
    @Test
    public void calcTotalTest() {
        //arrange
        double tip = 4.5;
        double cost = 30.0;
        double result = cost + tip;
        //act
        double actual = tipcalculator.TipCalculator.calcTotal(cost, tip);
        //assert
        assertEquals(result, actual, 0.00);
    } //end calcTotalTest
    
    
} //end class TipCalculatorTest
