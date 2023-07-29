package Task5;

public class ConvertFahrenheit implements ConverterTemperature {
    private static final int fahrenheit = 32;

    @Override
    public double convert(double value) {
        return (value * ((double) 9 / 5)) + fahrenheit;
    }
}
