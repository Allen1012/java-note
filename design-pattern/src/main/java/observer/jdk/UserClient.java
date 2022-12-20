package observer.jdk;

/**
 * @Created by sunmeng9
 * @Date 2022/12/19 23:32
 * @Description TODO
 */
public class UserClient {

    public static void main(String[] args) {
        UserControllerObservable observable = new UserControllerObservable();

        observable.addObserver(new MailObserver());
        observable.addObserver(new SMSObserver());
        observable.addObserver(new PhoneObserver());

        observable.register("张三","123");
    }

}
