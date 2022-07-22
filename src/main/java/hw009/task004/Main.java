package hw009.task004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задание 4.
Напишите основные арифметические действия калькулятора используя лямбда-выражения
 */
public class Main {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        try {
            int valueOne = getOperand();
            System.out.println("Input math sign:");
            String mathSign = in.readLine();
            int valueTwo = getOperand();
            Calculable action = mathAction(mathSign);
            System.out.printf("%d %s %d = %d", valueOne, mathSign, valueTwo, action.calculate(valueOne, valueTwo));
        } catch (ArithmeticException | NumberFormatException | NullPointerException exception) {
            System.err.println("Error. Program has stopped.");
        }
    }

    public static int getOperand() throws IOException {
        System.out.println("Input digit to calculate:");
        return Integer.parseInt(in.readLine());
    }

    public static Calculable mathAction(String mathSign) {
        return switch (mathSign) {
            case "+" -> Integer::sum;
            case "-" -> (x, y) -> x - y;
            case "*" -> (x, y) -> x * y;
            case "/" -> (x, y) -> x / y;
            default -> null;
        };
    }
}
