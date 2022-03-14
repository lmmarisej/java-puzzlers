class Cache {
    static {            // 积极初始化
        initializeIfNecessary();
    }

    private static int sum;
    public static int getSum() {
        initializeIfNecessary();            // 惰性初始化
        return sum;
    }

    private static boolean initialized = false;
    private static synchronized void initializeIfNecessary() {      // 避免同时使用积极初始化和惰性初始化
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
    }
}

public class Client {
    public static void main(String[] args) {
        System.out.println(Cache.getSum()); 
    } 
}
