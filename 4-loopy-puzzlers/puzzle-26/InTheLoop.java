public class InTheLoop {
    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for (int i = START; i <= END; i++)          // 整数不能表示到2147483648
            count++;
        System.out.println(count);
    }
}
