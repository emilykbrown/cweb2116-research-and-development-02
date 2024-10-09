package operationsApplication;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        PerformTemperatureConversion converter = new PerformTemperatureConversion();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion App");
        System.out.println("Choose the type of conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        String choice = scanner.nextLine();
        int conversionType = Integer.parseInt(choice);

        System.out.println("Enter temperature:");
        double inputTemperature = scanner.nextDouble();

        String result = converter.convertTemperature(conversionType, inputTemperature);
        System.out.println(result);

        scanner.close();
    }
}
