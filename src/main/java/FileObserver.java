import java.util.HashSet;
import java.util.Set;

/**
 * Created by USER on 08.02.2016.
 */
public class FileObserver implements Observable<String> {

    private Set<Observer> observers = new HashSet<Observer>();

    public void addObserver(Observer observer) {
       this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public String notifyObserver() {
        return null;
    }
}
