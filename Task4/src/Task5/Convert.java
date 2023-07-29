package Task5;

import java.util.Scanner;

public final class Convert {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Chose type of convert\n" +
                "F  - Fahrenheit \n" +
                "K - Kelvin\n" +
                "Enter letter: ");
        String letter = input.next();
        System.out.print("Enter grad celsius: ");
        choseConvertType(letter);
        input.close();
    }

    private static void choseConvertType(String letter) {
        switch (letter) {
            case "F":
                convertInFahrenheit();
                break;
            case "K":
                convertInKelvin();
                break;
            default:
                System.out.println("Oops, something went wrong");
        }
    }

    private static void convertInKelvin() {
        Scanner input = new Scanner(System.in);
        double grad = input.nextDouble();
        ConvertKelvin convertKelvin = new ConvertKelvin();
        System.out.println(convertKelvin.convert(grad));
        input.close();
    }

    private static void convertInFahrenheit() {
        Scanner input = new Scanner(System.in);
        double grad = input.nextDouble();
        ConvertFahrenheit convertFahrenheit = new ConvertFahrenheit();
        System.out.println(convertFahrenheit.convert(grad));
        input.close();
    }
}
