package transport;

import human.Driver;
import human.Mechanic;
import human.Sponsor;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Transport{
    private Driver driver;
    private List<Sponsor> sponsors;
    private List<Mechanic> mechanics;

    public Bus(String brand,
               String model,
               double speed,
               Driver driver) {
        super(brand, model, speed);
        this.driver = driver;
        this.sponsors = new ArrayList<>();
        this.mechanics = new ArrayList<>();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driver=" + driver +
                ", sponsors=" + sponsors +
                ", mechanics=" + mechanics +
                "} " + super.toString();
    }
}
