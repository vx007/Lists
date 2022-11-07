package human;

public class Sponsor {
    private final String name;
    private double support;

    public Sponsor(String name, double support) {
        this.name = name;
        this.support = support;
    }

    public double getSupport() {  //Используется также как спонсирование заезда
        return support;
    }

    public void setSupport(double support) {
        this.support = support;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", support=" + support +
                '}';
    }
}
