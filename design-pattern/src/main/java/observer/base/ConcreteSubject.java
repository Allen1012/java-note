package observer.base;

/**
 * @Created by sunmeng9
 * @Date 2022/12/19 23:02
 * @Description 具体的观察者
 */
public class ConcreteSubject extends Subject {
    public void doSomething(){
        super.notifyObservers();
    }
}
