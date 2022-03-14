public class UnwelcomeGuest {
    public static final long GUEST_USER_ID = -1;

    private static  long USER_ID;
//    private static final long USER_ID;
    static {
        try {
            USER_ID = getUserIdFromEnvironment();
        } catch (IdUnavailableException e) {
             USER_ID = GUEST_USER_ID;                                // 编译器可以拒绝某些证明是安全的程序
            System.out.println("Logging in as guest");
        }
    }

    private static long getUserIdFromEnvironment() throws IdUnavailableException {
        throw new IdUnavailableException(); // Simulate an error
    }

    public static void main(String[] args) {
        System.out.println("User ID: " + USER_ID);
    }
}

class IdUnavailableException extends Exception {
}
