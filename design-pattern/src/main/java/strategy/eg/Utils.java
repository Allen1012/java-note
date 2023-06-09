package strategy.eg;

import java.util.Properties;

/**
 * @Created by sunmeng9
 * @Date 2023/6/9 15:57
 * @Description TODO
 */
public class Utils {
 public static Discount getDiscount() {
  try {
   Properties prop = new Properties();
   prop.load(Utils.class.getClassLoader().getResourceAsStream("discount.properties"));
   String className = prop.getProperty("discount");
   return (Discount) (Class.forName(className).newInstance());
  }catch (Exception e) {
   e.printStackTrace();
   return null;
  }
 }
}
