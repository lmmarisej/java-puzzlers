public class Outer {
    public static void main(String[] args) throws Exception {
        new Outer().greetWorld();
    }

    private void greetWorld() throws Exception {
        System.out.println(Inner.class.newInstance());
    }

    public class Inner {                // 优先使用静态成员类；内部类需要外围实例
        public String toString() {
            return "Hello world";
        }
    }
}
