import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter at least three words ");
        String a = scan.nextLine();
        String[] arr = a.split(", ");

        for (int i = 0; i < arr.length; i++) {

            int e = 1;

            while (e == 1) {
                System.out.println(arr[i]);
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

                        System.out.println("1");
                        break;
                    case 2:

                        System.out.println("2");
                        break;
                    case 3:

                        System.out.println("3");
                        break;
                    case 4:

                        System.out.println("4");
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