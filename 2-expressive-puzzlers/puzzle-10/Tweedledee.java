public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        Object x = "buy";
        String i = "Java";
        i = (String) x;
        x = x + i;  // Must be LEGAL
        x += i;     // Must be ILLEGAL
    }
}
