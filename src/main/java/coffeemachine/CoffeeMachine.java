package coffeemachine;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

abstract public class CoffeeMachine {
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PROTECTED)
    private CoffeeBean coffeeBean;
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PROTECTED)
    private Water water;
    @Setter(AccessLevel.PROTECTED)
    @Getter
    private boolean ready;


    public CoffeeMachine(Water water, CoffeeBean coffeeBean) {
        setCoffeeBean(coffeeBean);
        setWater(water);
    }

    protected void boilWater() {
        try {
            System.out.println("Boil water");
            Thread.sleep(1000);
            getWater().setWaterTemperature(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void grindCoffee() {
        try {
            Thread.sleep(1000);
            System.out.println("Grind coffee beans");
            getCoffeeBean().setGrinded(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pourCoffee() {
        if (isReady()) {
            try {
                Thread.sleep(1000);
                System.out.println("Pour coffee");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return;
        }

        System.out.println("Coffee is not ready yet");
    }

}
