package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Created by sunmeng9
 * @Date 2022/12/20 10:49
 * @Description TODO
 */
public class SMSObserver implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(observable.hasChanged());
        System.out.println("发送短信:" + o + " 欢迎你");
    }
}
