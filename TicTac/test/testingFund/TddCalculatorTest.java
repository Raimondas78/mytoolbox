package testingFund;
import org.junit.Test;
import tdd.Calculator;
import static org.junit.Assert.*;

//Pirma rašome testą, paskui rašome metodus klasėje - tai
//TDD būdas rašyti testą ir tada kodą
public class TddCalculatorTest {

    //static Calculator cal;
    @Test
    public void testAddMethod(){
        Calculator cal = new Calculator();
        int result = cal.add(1,2);
        assert result ==3;
    }

    @Test
    public void testSubMethod(){
        Calculator cal = new Calculator();
        int result =cal.sub(1,1);
        assert result == 0;
    }

    @Test
    public void testDivMethod(){
        Calculator cal = new Calculator();
        int result = cal.div(2,5);
        assert result == 0;
    }

    @Test
    public void testAddmethod(){
        Calculator cal = new Calculator();
        assertEquals(cal.add(-5,-5),-10);
    }



}
