public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Peach", 5, 243, "Afrika", "meat", 4, 2,
                2);
        System.out.println(lion1.getLionDescription());
        lion1.Eating("Peach ");

        Lion lion2 = new Lion("Simba", 2, 114, "Afrika", "Meat");
        System.out.println(lion2.getLionDescription());
        lion2.Move();
        lion2.CatVoice();

        Lion lion3 = new Lion("Alex", 3, 114, "Europe", "Meat");
        System.out.println(lion3.getLionDescription());
        lion3.CatSleeping();

        Eagle eagle1 = new Eagle("Speed", 15, 16, "Up to 8000", "Wild", 2, 2,
                "White head and brown body");
        System.out.println(eagle1.getEagleDescription());
        eagle1.Move();

        Eagle eagle2 = new Eagle("Senu", 5, 10, "Up to 2000", "Wild");
        System.out.println(eagle2.getEagleDescription());
        eagle2.BirdVoice();

        System.out.println(BirdFamily.DEFINISHION_BIRD);
    }
}
