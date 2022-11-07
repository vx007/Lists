package human;

public class Driver {
    private final String name;
    private final Character license;

    public Driver(String name, Character license) {
        this.name = name;
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license=" + license +
                '}';
    }
}
