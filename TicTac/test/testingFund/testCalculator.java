package testingFund;

import FundamentalsExersisesAdvanced.Calculator;
import org.junit.Test;

public class testCalculator {

@Test
    public void testSum(){
    Calculator calculator = new Calculator();
    double result = calculator.getSum(-5,-15);
    assert result ==-20;
}
@Test
    public void testSub(){
        Calculator calculator = new Calculator();
        double result = calculator.getSub(-5,15);
        assert result ==-20;
    }


}
