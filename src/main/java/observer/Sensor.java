package observer;

public class Sensor implements Observer{
    String name;
    double temp;

    public Sensor(String name) {
        this.name = name;
    }

    @Override
    public void update(double temp) {
        this.temp = temp;

    }

    @Override
    public void display() {
        System.out.printf("Sensor %s, temperature is %.2f\n", name, temp);
    }

    @Override
    public String getName() {
        return name;
    }

}
