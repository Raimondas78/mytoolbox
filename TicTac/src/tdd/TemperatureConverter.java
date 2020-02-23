package tdd;

public class TemperatureConverter {

    public double convertToFahrenheit(double tempC){
        return ((1.8*tempC) +32);
    }

    public double convertToCelsius(double tempF){
        return ((tempF - 32)/1.8);
    }
}
