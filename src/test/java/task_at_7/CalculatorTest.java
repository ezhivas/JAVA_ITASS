package task_at_7;

import org.junit.*;

public class CalculatorTest {
        Calculator calculator = new Calculator();

    @Test
    public void mathOperationAdd() {
        Assert.assertEquals(10, calculator.mathOperationAdd(5, 5));
    }
    @Test
    public void mathOperationSubtraction() {
        Assert.assertEquals(10, calculator.mathOperationSubtraction(20, 10));
    }
    @Test
    public void mathOperationMultiply() {
                Assert.assertEquals(10, calculator.mathOperationMultiply(2, 5));
    }
    @Test
    public void mathOperationDivide() {
        Assert.assertEquals(10, calculator.mathOperationDivide(100, 10));
    }
    @Test
    public void mathOperationDivideByZero() {
        Assert.assertEquals(0, calculator.mathOperationDivide(100, 0));
    }
}
