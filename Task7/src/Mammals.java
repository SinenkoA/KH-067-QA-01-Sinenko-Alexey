public abstract class Mammals extends Animals {

    public String environment;
    public String eat;

    //getter getEnvironment
    public String getEnvironment(String environment) {
        return environment;
    }

    //getter getEat
    public String getEat(String eat) {
        return eat;
    }

    //method eating
    public void eating(String name) {
        System.out.println(name + "eating");
    }

    //method move
    public abstract void move();

    //constructor
    public Mammals(String name, int age, int waigh, String environment, String eat) {
        super(name, age, waigh);
        this.environment = environment;
        this.eat = eat;
    }
}
