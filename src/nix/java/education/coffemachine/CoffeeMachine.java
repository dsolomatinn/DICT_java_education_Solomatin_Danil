package nix.java.education.coffemachine;

public class CoffeeMachine {
    private int water;
    private int coffeeBean;
    private int milk;
    private int cup;
    private double money;

    public CoffeeMachine(int water, int coffeeBean, int milk, int cup, double money) {
        this.water = water;
        this.coffeeBean = coffeeBean;
        this.milk = milk;
        this.cup = cup;
        this.money = money;
    }


    protected void choiceEspresso(){
        if (water >= Ingredients.Espresso.getWater() && coffeeBean >= Ingredients.Espresso.getCoffeeBeams()
                && cup >= Ingredients.Espresso.getCup()) {
            System.out.println("I have enough resources, making your coffee!");
            water -= 250;
            coffeeBean -= 16;
            cup--;
            money += 4;
        } else if (water < Ingredients.Espresso.getWater() ) {
            System.out.println("Sorry, not enough water");
        } else if (coffeeBean < Ingredients.Espresso.getCoffeeBeams()) {
            System.out.println("Sorry, not enough CoffeeBean");
        } else if (cup < Ingredients.Espresso.getCup()) {
            System.out.println("Sorry, not enough cup");
        }
    }

    protected void choiceLatte(){
        if (water >= Ingredients.Latte.getWater() && milk >= Ingredients.Latte.getMilk()
                && coffeeBean >= Ingredients.Latte.getCoffeeBeams() && cup >= Ingredients.Latte.getCup()) {
            System.out.println("I have enough resources, making your coffee!");
            water -= 250;
            coffeeBean -= 20;
            milk -= 75;
            cup--;
            money += 7;
        } else if (water < Ingredients.Latte.getWater()) {
            System.out.println("Sorry, not enough water");
        } else if (coffeeBean < Ingredients.Latte.getCoffeeBeams()) {
            System.out.println("Sorry, not enough CoffeeBean");
        } else if (milk < Ingredients.Latte.getMilk()) {
            System.out.println("Sorry, not enough milk");
        } else if (cup < Ingredients.Latte.getCup()) {
            System.out.println("Sorry, not enough cup");

        }
    }


    protected void choiceCappuccino() {
        if (water >= Ingredients.Cappuccino.getWater() && milk >= Ingredients.Cappuccino.getMilk()
                && coffeeBean >= Ingredients.Cappuccino.getCoffeeBeams() && cup >= Ingredients.Cappuccino.getCup() ){
            System.out.println("I have enough resources, making your coffee!");
            water -= 200;
            coffeeBean -= 12;
            milk -= 100;
            cup--;
            money += 6;
        } else if (water < Ingredients.Cappuccino.getWater()) {
            System.out.println("Sorry, not enough water");
        } else if (coffeeBean < Ingredients.Cappuccino.getCoffeeBeams()) {
            System.out.println("Sorry, not enough CoffeeBean");
        } else if (milk < Ingredients.Cappuccino.getMilk()) {
            System.out.println("Sorry, not enough milk");
        } else if (cup < Ingredients.Cappuccino.getCup()) {
            System.out.println("Sorry, not enough cup");
        }
    }

    public boolean buy(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO:
                choiceEspresso();
                return true;
            case LATTE:
                choiceLatte();
                return true;
            case CAPPUCCINO:
                choiceCappuccino();
        }
        return false;
    }
    protected void buyCoffee(){
        System.out.println("What you want to buy: 1.-espresso, 2.- latte. 3.-cappuccino, back - to main menu:");
        String typeOfCoffee = Main.scanner.next();
        while (true) {
            if (typeOfCoffee.equals("1")) {
                Main.employee.buy(CoffeeType.ESPRESSO);
            } else if (typeOfCoffee.equals("2")) {
                Main.employee.buy(CoffeeType.LATTE);
            } else if (typeOfCoffee.equals("3")) {
                Main.employee.buy(CoffeeType.CAPPUCCINO);
            } else if (typeOfCoffee.equals("back")) {
                break;
            }
            break;
        }
    }
    public double takeMoney() {
        double money = this.money;
        this.money = 0;
        return money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getCoffeeBean() {
        return coffeeBean;
    }

    public void setCoffeeBean(int coffeeBean) {
        this.coffeeBean = coffeeBean;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String showIngridients() {
        return "\nThe coffee machine has:" + " " + "\nMl of water:" + water
                + "\nMl of milk: " + milk + "\nGrams of coffee Beams: " + coffeeBean +
                "\nAmount of cups: " + cup + "\nAmount of money:" + money;
    }

    protected void incIngredients( ) {
        System.out.println("Write how many ml of water you want to add: ");
        long valueOfWater = Main.scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        long valueOfMilk = Main.scanner.nextInt();
        System.out.println("Write how many g of Coffee Beams you want to add: ");
        long valueOfCoffeeBeams = Main.scanner.nextInt();
        System.out.println("Write how many cups you want to add: ");
        long valueOfCups = Main.scanner.nextInt();
        water += valueOfWater;
        milk += valueOfMilk;
        coffeeBean += valueOfCoffeeBeams;
        cup += valueOfCups;
    }


}
