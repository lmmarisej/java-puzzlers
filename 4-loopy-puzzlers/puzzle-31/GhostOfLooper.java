public class GhostOfLooper {
    public static void main(String[] args) {
        // Place your declaration for i here
        short i = -1;
        System.out.println(Integer.toBinaryString(i));      // 展示short拓宽int后的二进制值
        while (i != 0) {
            // Java的数值运算低于int的，会先提升到int来计算
            // 先拓宽
            // 1111111111111111      = 》      11111111111111111111111111111111
            // 无符号右移
            // 01111111111111111111111111111111
            // 窄化
            // 01111111111111111111111111111111      = 》      1111111111111111
            // 结论：不会产生任何变化；Java窄化int为short，将直接截掉高16位，又回到起点
            i >>>= 1;           // 不要在short、byte或char类型上使用复合赋值运算符
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
