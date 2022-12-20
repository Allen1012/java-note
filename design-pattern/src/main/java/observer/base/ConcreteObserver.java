package observer.base;

/**
 * @Created by sunmeng9
 * @Date 2022/12/19 22:58
 * @Description 具体的观察者
 */
public class ConcreteObserver implements Observor {

    @Override
    public void update() {
        System.out.println("具体观察者: 接受到信息，并进行处理");
    }
}
