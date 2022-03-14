class Jeopardy {
    public static final java.lang.String PRIZE = "$64,000";
}

public class DoubleJeopardy extends Jeopardy {
    public static final java.lang.String PRIZE = "2 cents";

    public static void main(java.lang.String[] args) {
        System.out.println(DoubleJeopardy.PRIZE);
    }
}
