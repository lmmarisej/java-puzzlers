class BigDelight {
    public static void main(String[] args) {
        System.out.println("0x90：" + 0x90);
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)      // 避免不同类型的比较
                System.out.print("Joy!");
        }
    }
}
