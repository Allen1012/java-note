package strategy.eg;

/**
 * @Created by sunmeng9
 * @Date 2023/6/9 15:58
 * @Description TODO
 */
public class Client {
 public static void main(String args[]) {
  MovieTicket mt = new MovieTicket();
  double originalPrice = 60.0;
  double currentPrice;
  mt.setPrice(originalPrice);
  System.out.println("原始价为：" + originalPrice);
  System.out.println("---------------------------------");
  Discount discount;
  discount = Utils.getDiscount(); //读取配置文件并反射生成具体折扣对象
  mt.setDiscount(discount); //注入折扣对象
  currentPrice = mt.getPrice();
  System.out.println("折后价为：" + currentPrice);
 }
}
