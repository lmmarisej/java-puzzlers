import java.util.*;

public class NameGame {
    public static void main(String args[]) {
        // 允许key和value都为null
        // 当且仅当k1== k2的时候，IdentityHashMap才会相等，而不是比较hashCode
        Map<String, String> m = new IdentityHashMap<String, String>();
//        Map<String, String> m = new HashMap<String, String>();
        m.put(new String("Mickey"), "Mouse");
        m.put(new String("Mickey"), "Mantle");
        System.out.println(m.size());
    } 
}
