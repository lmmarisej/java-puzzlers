import java.util.Random;

public class CoinSide {
    private static Random rnd = new Random();

    public static CoinSide flip() {
        return rnd.nextBoolean() ? 
            Heads.INSTANCE : Tails.INSTANCE;
    }

    public static void main(java.lang.String[] args) {
        System.out.println(flip());
    }
}

class Heads extends CoinSide {
    private Heads() { }
    public static final Heads INSTANCE = new Heads();

    public java.lang.String toString() {
        return "heads";
    }
}

class Tails extends CoinSide {
    private Tails() { }
    public static final Tails INSTANCE = new Tails();

    public java.lang.String toString() {
        return "tails";
    }
}
