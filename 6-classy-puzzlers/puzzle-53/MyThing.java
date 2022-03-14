public class MyThing extends Thing {
//    private final int arg;

    /*
     * This constructor is illegal. Rewrite it so that it has the same
     * effect but is legal.
     */
    public MyThing() {
        super(1);
//        super(arg = (int) System.currentTimeMillis());        // 父类需要先被初始化
    }
}
