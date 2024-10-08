package basis;

public class DivideUse {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10.0/3);
        double d = 10/3;
        System.out.println(d);
        System.out.println("----------------------");
        System.out.println(10%3);
        System.out.println(-10%3);
        System.out.println(10%(-3));
        System.out.println(-10%(-3));
        // -10 % -3 = -10 - (-10 / (-3) * (-3)) = -1
    }
}
