package strategy.eg;

/**
 * @Created by sunmeng9
 * @Date 2023/6/9 15:54
 * @Description TODO
 */
public class MovieTicket {
 private double price;
 private Discount discount;

 public void setPrice(double price) {
  this.price = price;
 }

 //注入一个折扣类对象
 public void setDiscount(Discount discount) {
  this.discount = discount;
 }

 public double getPrice() {
  //调用折扣类的折扣价计算方法
  return discount.calculate(this.price);
 }
}
