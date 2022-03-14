public class Workout {
    public static void main(String[] args) {
        workHard();
        System.out.println("It's nap time.");
    }

    private static void workHard() {
        try {
            workHard();
        } finally {
            workHard();         // 导致不会出现调用栈最大深度异常
        }
    }
}
