public class CurseOfLooper {
    public static void main(String[] args) {
        // Place your declarations for i and j here
        Integer i = new Integer(0);
        Integer j = new Integer(0);
        while (i <= j && j <= i && i != j) {        // 执行的是引用比较
        }
    }
}
