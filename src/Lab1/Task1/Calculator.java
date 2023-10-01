package Lab1.Task1;

import Lab1.Task1.Calculate;

public class Calculator {
    public static void main(String[] args) {
        double a = 7;
        double b = 10;

        char operator = '+';

        switch (operator) {
            case '+': {
                System.out.println(Calculate.Add(a, b));
                break;
            }
            case '-':
            {
                System.out.println(Calculate.Subtract(a, b));
                break;
            }
            case '*':
            {
                System.out.println( Calculate.Multiply(a, b));
                break;
            }
            case  '/':
            {
                System.out.println(Calculate.Divide(a, b));
                break;
            }
            default:
                throw new IllegalArgumentException("Error: unknown operator.");
        }
    }
}