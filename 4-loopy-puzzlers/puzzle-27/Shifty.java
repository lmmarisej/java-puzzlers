public class Shifty {
    public static void main(String[] args) {
        int i = 0;
        while (-1 << i != 0) {       // 位移长度应该使用常量
            System.out.println(Integer.toBinaryString(i));
            i++;
        }
        System.out.println(i);
    }
}
