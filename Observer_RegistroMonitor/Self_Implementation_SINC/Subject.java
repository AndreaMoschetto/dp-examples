import java.util.List;
import java.util.ArrayList;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void updateObservers(Object obj){
        for (Observer observer : observers) {
            observer.update(obj);
        }
    }
}