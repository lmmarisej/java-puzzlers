import java.util.Calendar;

public class Elvis {
    private final int beltSize;
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);      // 0，解决方法：CURRENT_YEAR放到上面去
    public static final Elvis INSTANCE = new Elvis();

    // 不要在构造器中读取final静态变量
    private Elvis() {
        beltSize = CURRENT_YEAR - 1930;     // static final 类型静态域被初始化之前可能被读取，读到的结果是0，本应该是当前年份
    }

    public int beltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        System.out.println("Elvis wears a size " + INSTANCE.beltSize() + " belt.");
    } 
}
