import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter at least three words ");
        String a = scan.nextLine();
        String[] words = a.split(", ");

        if (words.length >= 3) {

            int userChoise = 1;

            do {
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
                        System.out.println("Enter length of word");
                        int lenght = scan.nextInt();
                        for (String word : words) {
                            if (word.length() <= lenght) {
                                System.out.printf("Word" + ": " + word + "\n");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Enter first letter? ");
                        String first = scan.next();
                        for (String word : words) {
                            if (word.startsWith(first)) {
                                System.out.printf("Word" + ": " + word + "\n");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter last letter? ");
                        String last = scan.next();
                        for (String word : words) {
                            if (word.endsWith(last)) {
                                System.out.printf("Word" + ": " + word + "\n");
                            }
                        }

                        break;
                    case 4:
                        System.out.println("Enter part words? ");
                        String part = scan.next();
                        for (String word : words) {
                            if (word.contains(part)) {
                                System.out.printf("Word" + ": " + word + "\n");
                            }
                        }
                        break;
                    case 0:
                        System.out.println("0");
                        userChoise = 0;
                        break;
                }
            } while (userChoise != 0);
        }
    }
}
