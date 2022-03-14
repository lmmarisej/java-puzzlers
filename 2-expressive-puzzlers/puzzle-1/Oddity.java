public class Oddity {
    /**
     * 判断奇偶性
     */
    public static boolean isOdd(int i) {
        return i % 2 == 1;                  // 无法处理负数       解决方法 =》 i % 2 != 0  或  (i & 1) ！= 0
    }

    public static void main(String[] args) {
        System.out.println(isOdd(10));
        System.out.println(isOdd(-10));
        System.out.println(isOdd(11));
        System.out.println(isOdd(-11));
        System.out.println(11 % 2);
        System.out.println(-11 % 2);        // -1       ???
    }
}
