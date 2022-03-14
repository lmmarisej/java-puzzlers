public class Dog extends Exception {
    public static final Dog INSTANCE = new Dog();
    private Dog() { }

    public String toString() {
        return "Woof";
    }

    // 应该重写readResolve方法，反序列化时返回唯一实例

}
