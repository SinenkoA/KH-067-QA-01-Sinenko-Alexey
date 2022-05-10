public class Eagle extends Bird implements BirdFamily {
    public int legs;
    public int wings;
    public String color;

    //constructor
    public Eagle(String name, int age, int weigh, String flyaltitude, String type, int legs, int wings, String color) {
        super(name, age, weigh, flyaltitude, type);
        this.legs = legs;
        this.wings = wings;
        this.color = color;
    }

    public Eagle(String name, int age, int weigh, String flyaltitude, String type) {
        super(name, age, weigh, flyaltitude, type);
    }

    //method move
    @Override
    public void Move() {
        System.out.println(name + " move");
    }

    @Override
    public void BirdVoice() {
        System.out.println(name + " voice");
    }


    // getEagleDescription
    public String getEagleDescription() {
        if (legs == 0 && wings == 0 && color == null) {
            String EagleDescription = String.format("Eagle name:%s age:%d weigh:%d fly altitude:%s type:%s", name, age,
                    weigh, flyaltitude, type);
            return EagleDescription;
        } else {
            String EagleDescription = String.format("Eagle name:%s age:%d weigh:%d fly altitude:%s type:%s have: " +
                    "%d legs %d wings color:%s", name, age, weigh, flyaltitude, type, legs, wings, color);
            return EagleDescription;
        }
    }
}
