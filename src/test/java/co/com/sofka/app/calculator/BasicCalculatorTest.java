package co.com.sofka.app.calculator;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        // Act
        basicCalculator.sum(number1, number2);
    }
}
