package observer.base;

/**
 * @Created by sunmeng9
 * @Date 2022/12/19 23:19
 * @Description TODO
 */
public class CatObserver implements Observor {
    @Override
    public void update() {
        System.out.println("猫观察者: 接受到信息，并进行处理");
    }
}
