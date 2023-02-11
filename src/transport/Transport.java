package transport;

public class Transport {
    private final String brand;
    private final String model;
    private float engineVolume; // объем двигателя


    public Transport(String brand, String model, String color, String country, int maxSpeed

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
        return "Транспортное средство " +
                getBrand() + ' '
                + getModel()
                + ": объём двигателя - " + getEngineVolume() + "\n"
        ;
    }
}

