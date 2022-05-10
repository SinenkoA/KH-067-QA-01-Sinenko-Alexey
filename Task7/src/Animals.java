public abstract class Animals {
    public int age;
    public int weigh;
    public String name;

    //getter getAge
    public int getAge(int age) {
        return age;
    }

    //setter getAge
    public void setAge(int age) {
        this.age = age;
    }

    //getter getWeigh
    public int getWeigh(int weigh) {
        return weigh;
    }

    //getter getName
    public String getName(String name) {
        return name;
    }

    // constructor
    public Animals(String name, int age, int weigh) {
        this.name = name;
        if (age <= 0) {
            throw new RuntimeException("Age must be more than 0, actual value: " + age);
        }
        this.age = age;
        if (weigh <= 0) {
            throw new RuntimeException("Weigh must be more than 0, actual value: " + weigh);
        }
        this.weigh = weigh;
    }

    //method Move
    public abstract void Move();
}
