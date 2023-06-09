package strategy.eg;

/**
 * @Created by sunmeng9
 * @Date 2023/6/9 15:56
 * @Description TODO
 */
public class VIPDiscount implements Discount{
 @Override
 public double calculate(double price) {
  System.out.println("VIP票：");
  System.out.println("增加积分！");
  return price * 0.5;
 }

}
