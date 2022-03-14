public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;         // 右边进行int类型计算，会溢出
//        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;          // 解决方法
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
