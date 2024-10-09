package operationsUnitTesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import operationsLibrary.TemperatureConverter;

public class TemperatureUnitTesting {

    @Test
    public void testCelsiusToFahrenheit() {
        // Arrange
        double input = 0;
        double expected = 32;

        // Act
        double result = TemperatureConverter.celsiusToFahrenheit(input);

        // Assert
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Arrange
        double input = 32;
        double expected = 0;

        // Act
        double result = TemperatureConverter.fahrenheitToCelsius(input);

        // Assert
        assertEquals(expected, result, 0.001);
    }
}
