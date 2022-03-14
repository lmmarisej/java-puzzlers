public class Pet {
    public final String name;
    public final String food;
    public final String sound;

    public Pet(String name, String food, String sound) {
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

    public void eat() {
        System.out.println(name + ": Mmmmm, " + food);
    }
    public void play() {
        System.out.println(name + ": " + sound + " " + sound);
    }
    public void sleep() {
        System.out.println(name + ": Zzzzzzz...");
    }

    public void live() {
        new Thread() {
            public void run() {
                while (true) {
                    eat();
                    play();
//                    sleep();      // 应该使用构造方法传递任务，sleep优先使用Thread中的sleep
                }
            }
        }.start();
    }

    public static void main(String[] args) {
        new Pet("Fido", "beef", "Woof").live();
    }
}
