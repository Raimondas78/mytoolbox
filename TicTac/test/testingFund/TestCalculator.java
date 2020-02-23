package testingFund;

import FundamentalsExersisesAdvanced.Calculator;
import org.junit.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestCalculator {
    static Calculator calculator;

    @Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList( new Integer[][] {
                {1, 1, 2},
                {2, 4, 6},
                {1, 6, 7},
                {4, 1, 5}
        });
    }
    @Parameter(0)
    public int first;
    @Parameter(1)
    public int second;
    @Parameter(2)
    public int result;

    @Test
    public void testAddToDoubles() {
        calculator = new Calculator();
        double res = calculator.getSum(first, second);
        assert res == result;
    }





   /* @Before
    public void before(){
        System.out.println("before method");
    }

    @After
    public void after(){
        System.out.println("after method");
    }
    */
    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass method");
        calculator=new Calculator();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass method");
    }


    @Test
    public void testSum(){
    //Calculator calculator = new Calculator();
    double resultFromCalc = calculator.getSum(-5,5);
    double resultExpected = 0;
    assert resultFromCalc == resultExpected;
    }
    @Test
    public void testSub(){
        //Calculator calculator = new Calculator();
        double result = calculator.getSub(-5,15);
        assert result ==-20;
    }

    @Test
    public void testDiv(){
    //Calculator calculator = new Calculator();
    double result = calculator.getDiv(5,-10);
    assert result == -0.5;
    }



}
