import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input first value:");
        double val1 = scan.nextDouble();

        System.out.print(" input operation +,-,*,/,%. ");
        String oper = scan.nextLine();
        oper = scan.nextLine();

        if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/") || oper.equals("%")) {
            System.out.print(" input second value ");
            double val2 = scan.nextDouble();

            double res;

            switch (oper) {
                case "+":
                    res = val1 + val2;
                    System.out.println("Result: " + res);
                    break;
                case "-":
                    res = val1 - val2;
                    System.out.println("Result: " + res);
                    break;
                case "*":
                    res = val1 * val2;
                    System.out.println("Result: " + res);
                    break;
                case "/":
                    if (val2 == 0) System.out.println("Error");
                    else {
                        res = val1 / val2;
                        System.out.println("Result: " + res);
                    }
                    break;
                case "%":
                    res = val1 % val2;
                    System.out.println("Result: " + res);
                    break;
                default:
                    System.out.println("unsupported operation");
            }

        } else {
            System.out.println("unsupported operation");
        }

    }

}
