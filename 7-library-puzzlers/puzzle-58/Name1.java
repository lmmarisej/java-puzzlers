import java.util.*;

public class Name1 {
    public String first, last;

    public Name1(String first, String last) {
        this.first = first; this.last = last;
    }

//    @Override     // 避免无意识的重载
    public boolean equals(Name1 n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode(); 
    }

    public static void main(String[] args) {
        Set<Name1> s = new HashSet<>();
        s.add(new Name1("Donald", "Duck"));
        System.out.println(s.contains(new Name1("Donald", "Duck")));
    }
}
