package basis;

public class BitOperator {
    public static void main(String[] args) {
        System.out.println(~3); // -(x+1)
        // 00000000 00000000 00000000 00000011  3
        // 11111111 11111111 11111111 11111100  3取反，符号位是负，算是原码所以还要用补码表示
        // 10000000 00000000 00000000 00000100  最终要表示的 为-4
    }
}
