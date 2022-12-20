package observer.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @Created by sunmeng9
 * @Date 2022/12/20 22:40
 * @Description TODO
 */
public class MailObserver {
    @Subscribe
    public void sendMail(String userName) {
        System.out.println("发送邮件:" + userName + "欢迎你");
    }
}
