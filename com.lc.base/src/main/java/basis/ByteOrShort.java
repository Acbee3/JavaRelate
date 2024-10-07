package basis;

public class ByteOrShort {
    public static void main(String[] args) {
        double a1 = 2.7;
        double a2 = 8.1/3; // 8.1000011
        System.out.println(a1 == a2);
        if (Math.abs(a1-a2) < 0.00001) {
            System.out.println("相等");
        } else {
            System.out.println("不等");
        }
    }
}
