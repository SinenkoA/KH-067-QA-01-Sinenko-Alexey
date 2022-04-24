import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name?");
        String username = scan.nextLine();
        System.out.print("Where do you live, " + username + "?");
        String addres = scan.nextLine();
        System.out.print(username + " " + addres);

    }

}
