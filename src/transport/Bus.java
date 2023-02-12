package transport;

public class Bus extends Transport implements Participant {
    public final String transportClass = "Автобус";

    public Bus(String brand, String model, float engineVolume) {
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
        return this.transportClass + " "
                + getBrand() + ' '
                + getModel()
                + ": объём двигателя - " + getEngineVolume()
                + "\n"
                ;
    }

}

