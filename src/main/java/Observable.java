/**
 * Created by USER on 08.02.2016.
 */
public interface Observable<T> {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(T t);
}
