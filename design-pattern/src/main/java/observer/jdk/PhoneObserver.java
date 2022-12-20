package observer.jdk;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Created by sunmeng9
 * @Date 2022/12/20 22:17
 * @Description TODO
 */
public class PhoneObserver implements Observer {

    private Executor executor = Executors.newFixedThreadPool(2);

    @Override
    public void update(Observable observable, Object o) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("打打打电话:" + o + " 哒!哒!哒!");
            }
        });
    }
}
