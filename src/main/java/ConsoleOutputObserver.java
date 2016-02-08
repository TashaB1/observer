/**
 * Created by USER on 08.02.2016.
 */
public class ConsoleOutputObserver implements Observer<String> {

    @Override
    public void onEvent(String message) {
        System.out.println(message);
    }


}
