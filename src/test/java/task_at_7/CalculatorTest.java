package task_at_7;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void mathOperationAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.mathOperationAdd(5, 5));

    }

    @Test
    public void mathOperationSubtraction() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.mathOperationSubtraction(20, 10));
    }

    @Test
    public void mathOperationMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.mathOperationMultiply(2, 5));
    }

    @Test
    public void mathOperationDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.mathOperationDivide(100, 10));
    }

    @Test
    public void mathOperationDivideByZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.mathOperationDivide(100, 0));
    }
}
