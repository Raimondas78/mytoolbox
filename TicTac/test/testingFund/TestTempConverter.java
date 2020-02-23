package testingFund;
import org.junit.Test;
import tdd.TemperatureConverter;
import static org.junit.Assert.*;



public class TestTempConverter {

    @Test
    public void testCelsiustoFahrenheitConverter(){
        TemperatureConverter conv = new TemperatureConverter();
        double result = conv.convertToFahrenheit(0);
        assert result == 32;
    }

    @Test
    public void testFahrenheitToCelsiusConverter(){
        TemperatureConverter conv = new TemperatureConverter();
        double result = conv.convertToCelsius(212);
        System.out.println(result);
        assert result == 100; // cia reiketu naudoti
        //assert, kur galima nurodyti paklaida
    }

    @Test
    public void testFahrenheitToCelsiusConv(){
        TemperatureConverter conv = new TemperatureConverter();
        assertEquals(conv.convertToCelsius(0),-17.78, 0.01);
    }

}
