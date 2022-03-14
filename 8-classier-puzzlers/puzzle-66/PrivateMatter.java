class Base {
    public java.lang.String className = "Base";
}

class Derived extends Base {
//    private java.lang.String className = "Derived";       // 不能隐藏父类属性
}

public class PrivateMatter {
    public static void main(java.lang.String[] args) {
        System.out.println(new Derived().className);
    }
}
