public class ShadesOfGray {
    public static void main(java.lang.String[] args){
        System.out.println(X.Y.Z);
    }
}

class X {
    static class Y {
        static java.lang.String Z = "Black";
    } 

    static C Y = new C();           // 变量名和类名冲突，当位于同一个作用域时，变量优先级更大
}

class C {
    java.lang.String Z = "White";
}
