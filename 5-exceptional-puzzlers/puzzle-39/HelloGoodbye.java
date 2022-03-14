public class HelloGoodbye {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
            System.exit(0);             // 立即停止
        } finally {
            System.out.println("Goodbye world");        // 想要安全地停止需要改为停止hook
        }
    } 
}
