import java.util.*; import java.lang.reflect.*;

public class Reflector {
    public static void main(String[] args) throws Exception {
        Set<String> s = new HashSet<String>();
        s.add("foo");
        Iterator it = s.iterator();
        Method m = it.getClass().getMethod("hasNext");      // 不行        HashMap$HashIterator.hasNext()
        // 反射获取时，应该使用某种可访问的class
        Method m1 = Iterator.class.getMethod("hasNext");           // 行   Iterator.hasNext()
        System.out.println(m.invoke(it));
    }
}
