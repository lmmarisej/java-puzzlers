import java.util.*;

public class SuspiciousSort {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer[] arr = new Integer[100];

        for (int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt();

        Arrays.sort(arr, (i1, i2) -> i2 - i1);      // 不要使用减法比较器，除非你能保证数值之间的差值永远不会大于int.Max
        System.out.println(order(arr));
    }

    enum Order { ASCENDING, DESCENDING, CONSTANT, UNORDERED };

    static Order order(Integer[] a) {
        boolean ascending  = false;
        boolean descending = false;

        for (int i = 1; i < a.length; i++) {
            ascending  |= a[i] > a[i-1];
            descending |= a[i] < a[i-1];
        }

        if (ascending  && !descending)
            return Order.ASCENDING;
        if (descending && !ascending)
            return Order.DESCENDING;
        if (!ascending)
            return Order.CONSTANT;   // All elements equal 
        return Order.UNORDERED;      // Array is not sorted 
    } 
}
