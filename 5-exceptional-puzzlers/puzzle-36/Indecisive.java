public class Indecisive { 
    public static void main(String[] args) {
        System.out.println(decision());
    }

    static boolean decision() {
        try {
            return true;
        } finally {
            return false;       // 禁止使用return、throw、break、continue来退出finally语句块
        }
    } 
}
