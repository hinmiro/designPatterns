package observer;

import java.util.ArrayList;
import java.util.Random;

public class WeatherStation extends Observable implements Runnable {

    ArrayList<Observer> list = new ArrayList<>();
    public static double temp;
    static Random rand = new Random();

    public WeatherStation() {

        temp = rand.nextDouble() * 100 - 50;
    }

    @Override
    public void setObserver(Observer ob) {
        System.out.printf("%s added to observers\n", ob.getName());
        list.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        System.out.printf("%s removed\n", ob.getName());
        list.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : list) {
            o.update(temp);
            o.display();
        }
    }

    @Override
    public void run() throws RuntimeException {
        try {
            while (true) {
                temp += rand.nextInt(-1, 1);
                System.out.printf("Temperature is %.2f\n", temp);
                notifyObservers();
                Thread.sleep(rand.nextInt(1000, 5000));
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
