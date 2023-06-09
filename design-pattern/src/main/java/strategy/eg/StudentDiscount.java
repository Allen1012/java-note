package strategy.eg;

/**
 * @Created by sunmeng9
 * @Date 2023/6/9 15:55
 * @Description TODO
 */
public class StudentDiscount implements Discount {
 @Override
 public double calculate(double price) {
  System.out.println("学生票：");
  return price * 0.8;
 }
}
