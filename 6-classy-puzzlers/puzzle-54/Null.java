public class Null {
    public static void greet() {
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        ((Null) null).greet();// 静态方法的调用表达式是可以计算的，但是他的值将被忽略
    }
}
