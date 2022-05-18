import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Simple calculator version 2.0");
        Scanner scan = new Scanner(System.in);

        //getValue1
        double value1 = getValue();

        //getOperation
        boolean askOperation = true;
        String operation = "";
        while (askOperation) {
            try {
                System.out.print(" input operation +,-,*,/,%. ");
                operation = scan.nextLine();
                getOperation(operation);
                askOperation = false;
            } catch (NotSupportedOperationException e) {
                System.out.println("Invalid operation");
            }
        }
        // getValue2
        double value2 = getValue();

        // Calculation
        double res;
        switch (operation) {
            case "+":
                res = value1 + value2;
                System.out.println("Result: " + res);
                break;
            case "-":
                res = value1 - value2;
                System.out.println("Result: " + res);
                break;
            case "*":
                res = value1 * value2;
                System.out.println("Result: " + res);
                break;
            case "/":
                if (value2 == 0) System.out.println("Error");
                else {
                    res = value1 / value2;
                    System.out.println("Result: " + res);
                }
                break;
            case "%":
                res = value1 % value2;
                System.out.println("Result: " + res);
                break;
            default:
                System.out.println("unsupported operation");
        }
    }

    // exception NotSupportedOperationException
    public static String getOperation(String operation) throws NotSupportedOperationException {
        if ((operation.equals("+")) || (operation.equals("-")) || (operation.equals("*")) || (operation.equals("/")) ||
                (operation.equals("%"))) {
            return operation;
        } else {
            throw new NotSupportedOperationException();
        }
    }

    // Method GetValue
    static double getValue(){
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                double value = 0;
                System.out.println("Input value:");
                value = sc.nextDouble();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value");
            }
        }
    }
}
