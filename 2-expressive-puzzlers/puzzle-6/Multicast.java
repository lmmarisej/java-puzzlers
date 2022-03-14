public class Multicast {
    public static void main(String[] args) {
        System.out.println(-1);
        System.out.println((byte) -1);                  // byte 有符号  1字节 大小范围是   -128-127
        System.out.println((char) (byte) -1);           // char 无符号  2字节 大小范围为      0-66535 （ 对应的 Unicode 码位置）
        System.out.println((int) (char) (byte) -1);
        byte b = -1;
        char c = (char) (b & 0xff);
        System.out.println(c);
        System.out.println((short) (byte) -1);
    }
}
