public class Lazy {
    private static  boolean initialized = false;

    static {
        Thread t = new Thread(new Runnable() {
            public void run() {
                initialized = true;
            }
        });
        t.start();
        try {
            t.join();           // 初始化期间等待后台线程，容易死锁
        } catch(InterruptedException e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(initialized);
    }
}
