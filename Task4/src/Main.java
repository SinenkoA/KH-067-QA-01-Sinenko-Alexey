import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter at least three words ");
        String a = scan.nextLine();
        String[] array = a.split(", ");

        for (int i = 0; i < array.length; i++) {

            int e = 1;

            while (e == 1) {
                System.out.println(array[i]);
                System.out.println("select a filter:");
                System.out.println("1-maximum lenght");
                System.out.println("2-start with");
                System.out.println("3-end with");
                System.out.println("4-contains");
                System.out.println("0-exit");
                System.out.print("Enter value: ");
                int val = scan.nextInt();

                switch (val) {
                    case 1:
                        System.out.println("Enter maximum length? ");
                        int lenght = scan.nextInt();

                        for (; i < array.length; i++) {

                        }
                        System.out.println(array[lenght]);
                        break;
                    case 2:

                        System.out.println("Enter first letter? ");
                        String first = scan.nextLine();
                        System.out.println(first);

                        break;
                    case 3:

                        System.out.println("Enter last letter? ");
                        String last = scan.nextLine();
                        System.out.println(last);

                        break;
                    case 4:

                        System.out.println("Enter part words? ");
                        String part = scan.nextLine();
                        System.out.println(part);

                        break;
                    case 0:

                        System.out.println("0");
                        e = 0;
                        break;
                }

            }

        }

    }

}