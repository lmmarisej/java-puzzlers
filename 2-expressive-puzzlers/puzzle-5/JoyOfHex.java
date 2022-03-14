public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println(Long.toHexString(0xcafebabe));       // 需要注意16进制8进制无需减号就能表示负数
        // 0xcafebabe 为int类型，拓宽为long：0xffffffffcafebabe
        // 0xffffffffcafebabe + 0x100000000L
        // = 0x00000000cafebabe
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
    }
}
