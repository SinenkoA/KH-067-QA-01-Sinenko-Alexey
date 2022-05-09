import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("germany");
        countries.add("France");
        countries.add("england");
        countries.add("Poland");
        countries.add("canada");
        countries.add("Spain");
        countries.add("australia");
        System.out.println(countries);
        System.out.println(Method.sortList(countries));
    }
}
