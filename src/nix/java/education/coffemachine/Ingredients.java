package nix.java.education.coffemachine;

public enum Ingredients {
    Espresso(250,0,16,1),
    Latte(350,75,20,1),
    Cappuccino(200,100,12,1)
    ;
    private final int water;
    private final int milk;
    private  final int coffeeBeams;
    private final int cup;

    Ingredients(int water, int milk, int coffeeBeams, int cup) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeams = coffeeBeams;
        this.cup = cup;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeams() {
        return coffeeBeams;
    }

    public int getCup() {
        return cup;
    }
}
