package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Created by sunmeng9
 * @Date 2022/12/19 23:30
 * @Description 邮件服务
 */
public class MailObserver implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("发送邮件:" + o + " 欢迎你");
    }
}
