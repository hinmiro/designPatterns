package observer;

public abstract class Observable {


    public abstract void setObserver(Observer ob);

    public abstract void removeObserver(Observer ob);

    public void notifyObservers() {};
}
