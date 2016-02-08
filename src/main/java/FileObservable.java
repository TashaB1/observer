import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by USER on 08.02.2016.
 */
public class FileObservable implements Observable<String> {

    private Set<Observer<String>> observers = new HashSet<>();

    public void addObserver(Observer observer) {
       this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver(String message) {
        for(Observer<String> observer: observers){
           observer.onEvent(message);
        }
    }

    public void read() throws FileNotFoundException {
        File file = new File("C:\\Users\\USER\\Desktop\\filee.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {
            notifyObserver(scan.nextLine());
        }
    }
}
