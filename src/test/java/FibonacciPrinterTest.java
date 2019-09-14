import org.junit.jupiter.api.Test;

/**
 *
 *  Test class used for TDD. There are no asserts as the program is simply printing the values to the terminal.
 *
 */
public class FibonacciPrinterTest {

    FibonacciPrinter fibonacciPrinter = new FibonacciPrinter();

    @Test
    public void testZeroInput() {
        fibonacciPrinter.fibonacciSequence(0);
    }

    @Test
    public void testLargeInput() {
        fibonacciPrinter.fibonacciSequence(100);
    }

    @Test
    public void testMediumInput() {
        fibonacciPrinter.fibonacciSequence(10);
    }

    @Test
    public void testOneInput() {
        fibonacciPrinter.fibonacciSequence(1);
    }

    @Test
    public void testTwoInput() {
        fibonacciPrinter.fibonacciSequence(2);
    }

    @Test
    public void testThreeInput() {
        fibonacciPrinter.fibonacciSequence(3);
    }

}
