class Point {
    protected final int x, y;
    private final String name; // Cached at construction time
    Point(int x, int y) {
        this.x = x;
        this.y = y;
        name = makeName();          // 避免在构造器中访问被重载的方法，也就是非私有方法
    }

    protected String makeName() {
        return "[" + x + "," + y + "]";
    }

    public final String toString() {
        return name;
    }
}

public class ColorPoint extends Point {
    private final String color;
    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    protected String makeName() {
       return super.makeName() + ":" + color;
    }

    public static void main(String[] args) {
        System.out.println(new ColorPoint(4, 2, "purple"));
    }
}
