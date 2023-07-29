package Task5;

public class ConvertKelvin implements ConverterTemperature {
    private static final double kelvin = 273.15;

    @Override
    public double convert(double value) {
        return value + kelvin;
    }
}
