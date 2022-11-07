package human;

public class Mechanic {
    private final String name;
    private final String company;
    private final Qualification qualification;
    public enum Qualification {CAR, BUS, TRUCK, ALL}

    public Mechanic(String name, String company, Qualification qualification) {
        this.name = name;
        this.company = company;
        this.qualification = qualification;
    }

    public String service() {
        return name + " Servicing...";
    }

    public String fix() {
        return name + " Fixing...";
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", qualification=" + qualification +
                '}';
    }
}
