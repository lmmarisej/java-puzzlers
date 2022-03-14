public class Looper {
    public static void main(String[] args) {
        // Place your declaration for i here
        double i = Double.POSITIVE_INFINITY;
        System.out.println(Double.POSITIVE_INFINITY == Double.MAX_VALUE);
        // 原因：用double或float表示无穷大是可以的
        while (i == i + 1) {        // 将一个很小的浮点数加到一个很大的浮点数上时，将不会改变大浮点数的值
        }
    }
}
