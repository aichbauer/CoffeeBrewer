package coffeemachine;

public class Moka extends CoffeeMachine implements CoffeePot {
    public Moka(Water water, CoffeeBean coffeeBean) {
        super(water, coffeeBean);
    }

    private void putCoffeeInSieve() {
        try {
            Thread.sleep(1000);
            System.out.println("Put grinded coffee in the sieve");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void putWaterInDevice() {
        try {
            Thread.sleep(1000);
            System.out.println("Put water in device");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeCoffee() {
        grindCoffee();
        if (getCoffeeBean().isGrinded()) {
            putCoffeeInSieve();
            putWaterInDevice();
            boilWater();
        }
        if (getWater().getWaterTemperature() == 100) {
            setReady(true);
        }
    }

    @Override
    public void clean() {}
}
