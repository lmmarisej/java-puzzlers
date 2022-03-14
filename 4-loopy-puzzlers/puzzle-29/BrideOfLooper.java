public class BrideOfLooper {
    public static void main(String[] args) {
        // Place your declaration for i here
        double i = 0.0 / 0.0;
        System.out.println(i);      // NaN
        // NaN不等于任何浮点数，包括自身
        while (i != i) {            // 任何浮点操作，只要一个数为NaN，那么结果也是NaN
        }
    }
}
