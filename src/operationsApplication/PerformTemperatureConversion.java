package operationsApplication;

import operationsLibrary.TemperatureConverter;
import java.util.Scanner; // Import Scanner to get user input

public class PerformTemperatureConversion {

    // Method to convert the temperature
    public String convertTemperature(int conversionType, double inputTemperature) {
        double result;

        switch (conversionType) {
            case 1:
                result = TemperatureConverter.celsiusToFahrenheit(inputTemperature);
                return inputTemperature + " °C is " + result + " °F";

            case 2:
                result = TemperatureConverter.fahrenheitToCelsius(inputTemperature);
                return inputTemperature + " °F is " + result + " °C";

            default:
                return "Invalid option. Please choose 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius.";
        }
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int conversionType = scanner.nextInt(); // Read user choice

        // Ask user for the temperature they want to convert
        System.out.println("Enter the temperature you want to convert:");
        double inputTemperature = scanner.nextDouble(); // Read the temperature input

        // Perform the conversion
        PerformTemperatureConversion converter = new PerformTemperatureConversion();
        String result = converter.convertTemperature(conversionType, inputTemperature);

        // Display the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
