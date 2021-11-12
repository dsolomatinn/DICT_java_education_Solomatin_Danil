package nix.java.education.coffemachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Stage 1
        System.out.println("""
                Starting to make coffee
                Grinding coffee beans
                Boiling water
                Mixin boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Ingridients is ready!
                """);


        //Stage2
        System.out.println("Write how many cup of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int cupsOfCoffee = scanner.nextInt();
        final int water = 200;
        final int milk = 50;
        final int coffeeBeams = 15;
        System.out.println("For" + " " + cupsOfCoffee + " " + "coffee you will need:");
        System.out.println(water * cupsOfCoffee + " " + "ml of water");
        System.out.println(milk * cupsOfCoffee + " " + "ml of milk");
        System.out.println(coffeeBeams * cupsOfCoffee + " " + "g of coffeeBeams");

    }
}
