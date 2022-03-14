public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++)
            // j++虽然导致j自增了，但是j在++之前会保存，最后将j覆盖自增后的j
            j = j++;            // 不要在单个表达式中对变量多次赋值
        System.out.println(j);
    }
}
