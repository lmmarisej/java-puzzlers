import java.math.BigDecimal;

public class Change {
    public static void main(String args[]) {
        System.out.println(2.00 - 1.10);        // 0.8999999999999999          ???
        System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));        // 一定要使用String类型构造器
    }
}
