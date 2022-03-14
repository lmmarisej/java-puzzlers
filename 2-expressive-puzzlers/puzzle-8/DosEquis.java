public class DosEquis {
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.println(true  ? x : 0);
        System.out.println(false ? i : x);      // 最好在条件表达式中使用相同的类型
    }
}
