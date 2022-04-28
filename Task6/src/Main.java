public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Peach", 5, 243, "Afrika", "meat", 4, 2,
                2);
        System.out.println(lion1.getLionDescription1());
        lion1.eating("Peach ");

        Lion lion2 = new Lion("Simba", 2, 114, "Afrika", "Meat");
        System.out.println(lion2.getLionDescription2());
        lion2.move();

        Eagle eagle1 = new Eagle("Speed", 15, 16, "Up to 8000", "Wild", 2, 2,
                "White head and brown body");
        System.out.println(eagle1.getEagleDescription());
        eagle1.move();
    }
}
