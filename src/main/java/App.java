import java.io.FileNotFoundException;

/**
 * Created by USER on 08.02.2016.
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Observer observer = new ConsoleOutputObserver();
        Observer observer1 = new LineCount();
        FileObservable observable = new FileObservable();

        observable.addObserver(observer);
        observable.addObserver(observer1);
        observable.read();


    }
}
