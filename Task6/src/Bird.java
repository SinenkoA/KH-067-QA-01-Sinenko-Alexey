public abstract class Bird extends Animals {

    public String flyaltitude;
    public String type;

    //method move
    public abstract void move();

    // constructor
    public Bird(String name, int age, int weigh, String flyaltitude, String type) {
        super(name, age, weigh);
        this.flyaltitude = flyaltitude;
        this.type = type;
    }
}
