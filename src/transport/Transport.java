package transport;

public abstract class Transport  {
    public final String transportClass = "Транспортное средство";
    private final String brand;
    private final String model;
    private float engineVolume; // объем двигателя


    public Transport(String brand, String model, float engineVolume

    ) {
        this.brand = brand;
        this.model = model;
        this.setEngineVolume(engineVolume);

    }

    private void startMoving() {
        System.out.println(this + ": начали движение...");
    }
    private void stopMoving() {
        System.out.println( this + ": остановились ... ");
    }
    private static String fillString(String checkString, String defaultString) {
        return checkString == null || checkString == "" || checkString.isBlank() ? defaultString : checkString;
    }

    public String getBrand() {
        return fillString (brand,"default");
    }

    public String getModel() {
        return fillString (model,"default");
    }

    public float getEngineVolume() {
        return engineVolume <= 0 ? 1.5F : engineVolume ;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
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

