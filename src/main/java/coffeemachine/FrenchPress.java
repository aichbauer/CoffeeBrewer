package coffeemachine;

public class FrenchPress extends CoffeeMachine implements CoffeePot {
    public FrenchPress(Water water, CoffeeBean coffeeBean) {
        super(water, coffeeBean);
    }

    private void mixIngredients() {
        try {
            Thread.sleep(1000);
            System.out.println("Mix hot water with grind coffee beans");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void press() {
        try {
            Thread.sleep(1000);
            System.out.println("Press coffee to bottom of device");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void makeCoffee() {
        boilWater();
        grindCoffee();
        if (getCoffeeBean().isGrinded() && getWater().getWaterTemperature() == 100) {
            mixIngredients();
            press();
            setReady(true);
        }
    }

    @Override
    public void clean() {}
}
