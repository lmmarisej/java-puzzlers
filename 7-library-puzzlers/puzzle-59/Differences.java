import java.util.*;

public class Differences {
    public static void main(String[] args) {
        int vals[] = { 789, 678, 567, 456, 345, 234, 123, 012 };        // 整形签名加个0，012将被解释成8进制
        Set<Integer> diffs = new HashSet<>();

        for (int i = 0; i < vals.length; i++)
            for (int j = i; j < vals.length; j++)
                diffs.add(vals[i] - vals[j]);
        System.out.println(diffs.size());
    }
}
