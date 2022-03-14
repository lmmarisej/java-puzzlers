import java.util.*;

public class Name {
    private String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

//    public boolean equals(Object o) {
//        if (!(o instanceof Name))
//            return false;
//        Name n = (Name)o;
//        return n.first.equals(first) && n.last.equals(last);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(first, name.first) && Objects.equals(last, name.last);
    }

    @Override
    public int hashCode() {     // 无论何时应该重新hashcode+equals
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Name> s = new HashSet<>();
        s.add(new Name("Mickey", "Mouse"));
        System.out.println(s.contains(new Name("Mickey", "Mouse")));        // contains先用hashCode比较，一样再用equals比较
    } 
}
