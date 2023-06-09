package strategy.eg;

/**
 * @Created by sunmeng9
 * @Date 2023/6/9 15:56
 * @Description TODO
 */
public class ChildrenDiscount implements Discount{
 @Override
 public double calculate(double price) {
  System.out.println("儿童票");
  return price - 10;
 }
}
