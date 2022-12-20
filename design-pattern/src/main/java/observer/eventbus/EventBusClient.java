package observer.eventbus;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by sunmeng9
 * @Date 2022/12/20 22:41
 * @Description TODO
 */
public class EventBusClient {
    public static void main(String[] args) {
        UserController userController = new UserController();
        List<Object> observerList = new ArrayList<>();
        observerList.add(new MailObserver());
        observerList.add(new SMSObserver());
        userController.setObserverList(observerList);
        userController.register("张三","123");
    }
}
