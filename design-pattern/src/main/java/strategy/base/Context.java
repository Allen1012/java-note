package strategy.base;

/**
 * @Created by sunmeng9
 * @Date 2023/6/9 15:45
 * @Description TODO
 */
public class Context {

 private AbstractStrategy strategy; //维持一个对抽象策略类的引用

 public void setStrategy(AbstractStrategy strategy) {
  this.strategy = strategy;
 }

 //调用策略类中的算法
 public void algorithm() {
  strategy.algorithm();
 }

}
