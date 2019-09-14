import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciPrinter {

    public static void main(String[] args) {
        //Implementing scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter desired length of Fibonacci sequence: ");
        fibonacciSequence(scanner.nextInt());
    }

    /**
     * Function will if additional logic is needed or
     * @param n Requested size of sequence
     */
    protected static void fibonacciSequence(int n) {
        //using big int as must account for large inputs
        BigInteger fib1 = BigInteger.valueOf(0);
        BigInteger fib2 = BigInteger.valueOf(1);

        if(n == 1) {
            //Prints out first and only value
            System.out.print(fib1);
        } else if(n > 1) {
            System.out.print(fib1 + ", " + fib2);
            //If n is not greater than two, then the first initial numbers printed will suffice
            if(n > 2) {
                printFibonacciSequence(n, fib1, fib2, 2);
            }
        }
    }

    /**
     *
     * Recursive function to calculate next Fibonacci number
     *
     * @param n Requested size of sequence
     * @param fib1 Will increase each iteration to the value of fib2
     * @param fib2 Will increase each iteration to the value of fib1 + fib2
     * @param count Tracking amount of numbers printed
     */
    private static void printFibonacciSequence(int n, BigInteger fib1, BigInteger fib2, int count) {
        //Ensures we don't go over length of user desired sequence length
        if(count < n) {
            System.out.print(", " + fib1.add(fib2));
            printFibonacciSequence(n, fib2, fib1.add(fib2), ++count);
        }
    }

}
