import human.Driver;
import human.Mechanic;
import human.Sponsor;

import transport.Car;
import transport.Transport;
import transport.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "Mk.1", 320, new Driver("Masha", 'B'));
        Car bmw = new Car("BMW", "Z8", 300, new Driver("Sasha", 'B'));

        List<Sponsor> sponsors = new ArrayList<>();
        sponsors.add(new Sponsor("Donald Trump", 1_000_000));
        sponsors.add(new Sponsor("KIA Company", 20_000_000));

        Mechanic vova = new Mechanic("Vova", null, Mechanic.Qualification.ALL);
        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic("John", "BMW", Mechanic.Qualification.CAR));
        mechanics.add(vova);
        mechanics.remove(1);
        mechanics.add(0, new Mechanic("Jason Statham", "Hollywood", Mechanic.Qualification.ALL));

        ferrari.getSponsors().addAll(sponsors);
        ferrari.getMechanics().add(vova);

        bmw.getSponsors().add(new Sponsor("PepsiCo.", 100_000_000));
        bmw.getMechanics().addAll(mechanics);

        System.out.println(ferrari.getMechanics().get(0).service());
        System.out.println(bmw.getMechanics().get(1).fix());

        System.out.println(ferrari);
        System.out.println(bmw);

        ServiceStation<Car, Truck> station = new ServiceStation<>();
        station.add(ferrari);
        station.add(bmw);

        while (station.service() != null) {
            System.out.println("Servicing transport in queue...");
        }

    }

}
