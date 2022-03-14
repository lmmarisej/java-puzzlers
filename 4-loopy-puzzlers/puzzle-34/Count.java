public class Count {
    public static void main(String[] args) {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++)      // 转换时精度丢失
            count++;
        System.out.println(count);
    }
}
