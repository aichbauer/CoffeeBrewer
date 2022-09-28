import coffeemachine.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        System.out.println(water.getWaterTemperature());
        CoffeeBean coffeeBean = new CoffeeBean();


        System.out.println("--- FRENCH PRESS ---");
        FrenchPress frenchPress =  new FrenchPress(water, coffeeBean);
        System.out.println("Is french press coffee ready: " +frenchPress.isReady());
        System.out.print("Pour coffee: ");
        frenchPress.pourCoffee();
        System.out.println("Make coffee: ");
        frenchPress.makeCoffee();
        System.out.println(water.getWaterTemperature());
        System.out.println("Is french press coffee ready: " +frenchPress.isReady());
        System.out.print("Pour coffee: ");
        frenchPress.pourCoffee();

        System.out.println("\n--- MOKA ---");
        Moka moka =  new Moka(water, coffeeBean);
        System.out.println("Is moka coffee ready: " + moka.isReady());
        System.out.print("Pour coffee: ");
        moka.pourCoffee();
        System.out.println("Make coffee: ");
        moka.makeCoffee();
        System.out.println("Is moka coffee ready: " + moka.isReady());
        System.out.print("Pour coffee: ");
        moka.pourCoffee();
    }
}
