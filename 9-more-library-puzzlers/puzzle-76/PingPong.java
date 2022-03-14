public class PingPong {
    public static synchronized void main(String[] a) {
        Thread t = new Thread(PingPong::pong);
        t.run();
        System.out.print("Ping");
    }

    static synchronized void pong() {
        System.out.print("Pong");
    }
}
