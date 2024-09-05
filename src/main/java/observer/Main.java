package observer;

public class Main {

    public static void main(String[] args) {
        System.out.println("**Weather starting**");
        WeatherStation station = new WeatherStation();
        Thread stationThread = new Thread(station);
        stationThread.start();

        Observer num1 = new Sensor("sensor 1");
        Observer num2 = new Sensor("sensor 54");
        Observer num3 = new Sensor("sensor 194");

        station.setObserver(num1);
        station.setObserver(num2);

        try {
            Thread.sleep(3000);
            station.setObserver(num3);
            Thread.sleep(4000);
            station.removeObserver(num2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        station.setObserver(new Sensor("BIG TEMP SENSOR 00"));
    }
}
