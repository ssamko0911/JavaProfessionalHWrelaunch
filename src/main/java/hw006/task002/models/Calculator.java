package hw006.task002.models;

import hw006.task002.CustomAnno;

import java.util.Scanner;

/**
 * @author Serhii Samko
 * @version 1.0
 */
public class Calculator {
    /**
     * Using to get math operator.
     */
    String mathSign;

    /**
     * Using to create an object.
     */
    public Calculator() {

    }

    @CustomAnno(parameterOne = 10, parameterTwo = 2)
    /**
     * Main method, return type - void.
     */
    public void calculate(int someValueOne, int someValueTwo) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a sign of math operation:");
        this.mathSign = in.nextLine();
        switch (mathSign) {
            case "+":
                System.out.printf("Result is %d", someValueOne + someValueTwo);
                break;
            case "-":
                System.out.printf("Result is %d", someValueOne - someValueTwo);
                break;
            case "*":
                System.out.printf("Result is %d", someValueOne * someValueTwo);
                break;
            case "/":
                try {
                    System.out.printf("Result is %d", someValueOne / someValueTwo);
                } catch (ArithmeticException exception) {
                    System.err.println("/ by zero prohibited.");
                }
                break;
            default:
                System.err.println("No such math sign");
        }
    }
}
