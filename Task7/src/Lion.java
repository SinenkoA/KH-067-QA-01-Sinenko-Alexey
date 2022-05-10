public class Lion extends Mammals implements CatFamily {

    public int legs;
    public int ears;
    public int eyes;

    //getter getPaws
    public int getPaws(int paws) {
        return paws;
    }

    //getter getLegs
    public int getLegs(int legs) {
        return legs;
    }

    //getter getEars
    public int getEars(int ears) {
        return ears;
    }

    //getter getEyes
    public int getEyes(int eyes) {
        return eyes;
    }


    //constructor
    public Lion(String name, int age, int weigh, String environment, String eat, int legs, int ears, int eyes) {
        super(name, weigh, age, environment, eat);
        this.legs = legs;
        this.ears = ears;
        this.eyes = eyes;
    }

    public Lion(String name, int age, int weigh, String environment, String eat) {
        super(name, weigh, age, environment, eat);
    }

    // method move
    @Override
    public void move() {
        System.out.println(name + " move");
    }

    // method CatVoice
    public void CatVoice() {
        System.out.println(name + " voice");
    }

    // method CatSleeping
    @Override
    public void CatSleeping() {
        System.out.println(name + " sleeping");
    }

    // getLionDescription1
    public String getLionDescription() {
        if (legs == 0 && ears == 0 && eyes == 0) {
            String LionDescription = String.format("Lion name:%s weigh:%d age:%d live in:%s eating:%s", name, age,
                    weigh, environment, eat);
            return LionDescription;
        } else {
            String LionDescription = String.format("Lion name:%s weigh:%d age:%d live in:%s eating:%s have: %d legs " +
                    "%d ers %d eyes", name, age, weigh, environment, eat, legs, ears, eyes);
            return LionDescription;
        }
    }
}
