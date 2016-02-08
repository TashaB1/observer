/**
 * Created by USER on 08.02.2016.
 */
public class LineCount implements Observer<String> {

    private long count = 0;
    @Override
    public void onEvent(String message) {
        count++;
        System.out.println(count);
    }
}
