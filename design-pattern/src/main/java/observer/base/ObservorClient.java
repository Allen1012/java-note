package observer.base;

/**
 * @Created by sunmeng9
 * @Date 2022/12/19 23:05
 * @Description
 */
public class ObservorClient {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject concreteSubject = new ConcreteSubject();
        // 定义一个观察者
        Observor observor = new ConcreteObserver();
        concreteSubject.addObservor(observor);

        Observor observor1 = new CatObserver();
        concreteSubject.addObservor(observor1);

        concreteSubject.doSomething();
    }
}
