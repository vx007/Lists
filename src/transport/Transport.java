package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final double speed;

    public Transport(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
