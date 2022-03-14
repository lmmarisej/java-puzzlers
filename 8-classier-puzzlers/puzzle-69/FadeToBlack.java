public class FadeToBlack {
    static class Xy extends X1.Y {      // 引用一个被遮掩的类名
    }
    // This method should read and print the value of the field Z in class X.Y
    public static void main(java.lang.String[] args){
        System.out.println(Xy.Z);
    }
}

class X1 {
    static class Y {
        static java.lang.String Z = "Black";
    } 

    static C1 Y = new C1();
}

class C1 {
    java.lang.String Z = "White";
}
