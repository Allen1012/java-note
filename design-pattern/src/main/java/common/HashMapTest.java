package common;

import com.google.common.primitives.Bytes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Created by sunmeng9
 * @Date 2022/12/26 11:11
 * @Description
 */
public class HashMapTest {

    private static long getNum(){
        return 124L;
    }

    public static void main(String[] args) {
//        Long l = getNum();
//        Long ll = 124L;
//        if (l.equals(ll)){
//            System.out.println("true");
//        }
//        System.out.println("false");
//        test();

//        String str = "1280";
//        System.out.println(toHexString(str));

        test111();
    }


    public static void test11(){
        LocalDate current = LocalDate.now();

        Map<String, Object> params = new HashMap<>();
        params.put("randToken", "598459011b166d9d4da7f913a4066cca");
        params.put("endDayStr", current.minusDays(1).format(DateTimeFormatter.BASIC_ISO_DATE));

        params.put("endDayStr", current.minusDays(2).format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(params);
    }

    /**
     * @author sunmeng9
     * @date 2022/12/26 11:42
     * 参考文档: https://blog.csdn.net/qq_29051413/article/details/107860264
     */
    public static void test() {
        HashMap<String, String> map = new HashMap();
        map.put("a", "111");
        map.put("b", "222");
        System.out.println(map);
        Set<String> set = map.keySet();
        System.out.println(set);
    }


    public static void test111(){
        Map<Integer, Integer> groupMap = new HashMap<>();
        groupMap.put(2,1);
        int num = groupMap.get(1);
        groupMap.put(1,num + 1);
        System.out.println(groupMap);
    }

//    public static void test2() {
//        int a = 1284;
//        String str = "1284";
//        Bytes.toBytes(str);
//    }

    //转化字符串为十六进制编码
    public static String toHexString(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }
}
