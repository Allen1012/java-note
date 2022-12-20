package observer.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by sunmeng9
 * @Date 2022/12/19 23:00
 * @Description 被观察者
 */
public abstract class Subject {

    private List<Observor> observorList = new ArrayList<>();

    public void addObservor(Observor observor){
        observorList.add(observor);
    }

    // 删除一个观察者
    public void delObserver(Observor observer){
        observorList.remove(observer);
    }

    // 通知所有观察者
    public void notifyObservers(){
        for (Observor observer : observorList){
            observer.update();
        }
    }
}
