public class LooperMeetsWolfman {
    public static void main(String[] args) {
        // Place your declaration for i here
        int i = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(-i));
        while (i != 0 && i == -i) {
        }
    }
}
