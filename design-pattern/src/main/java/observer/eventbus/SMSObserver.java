package observer.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @Created by sunmeng9
 * @Date 2022/12/20 22:41
 * @Description TODO
 */
public class SMSObserver {
    @Subscribe
    public void sendSMS(String userName) {
        System.out.println("发送短信：" + userName + "欢迎你");
    }
}
