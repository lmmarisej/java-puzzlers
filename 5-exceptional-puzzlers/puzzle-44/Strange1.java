public class Strange1 {
    public static void main(String[] args) {
        try {
            Missing m = new Missing();
        } catch (java.lang.NoClassDefFoundError ex) {       // 不要对NoClassDefFoundError形成依赖，应该使用反射来探测
            System.out.println("Got it!");
        }
    }
}
