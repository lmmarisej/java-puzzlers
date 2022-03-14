public class SelfInterruption {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();

        if (Thread.interrupted()) {         // Interrupted会清除中断状态
            System.out.println("Interrupted: " + Thread.interrupted());
        } else {
            System.out.println("Not interrupted: " + Thread.interrupted());
        }
    }
}
