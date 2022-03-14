public class Creator {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Creature creature = new Creature();         // 不加括号不能声明变量，本地变量的声明只能直接出现在一个语句块中
        }
        System.out.println(Creature.numCreated());
    }
}

class Creature {
    private static long numCreated = 0;

    public Creature() {
        numCreated++;
    }

    public static long numCreated() {
        return numCreated;
    }
}
