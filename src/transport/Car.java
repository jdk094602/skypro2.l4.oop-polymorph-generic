package transport;

public class Car extends Transport implements Participant {
    public final String transportClass = "Автомобиль";
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    public void pitStop() {
        System.out.println(this + "заехал на пит-стоп");
    }
    public void bestTimeLap() {
        System.out.println(this + " лучшее время круга ");
    }
    public void maxSpeedLap() {
        System.out.println(this + " максимальная скорость");
    }

    @Override
    public String toString() {
        return transportClass + " "
                + getBrand() + ' '
                + getModel()
                + ": объём двигателя - " + getEngineVolume()
                + "\n"
        ;
    }
}

