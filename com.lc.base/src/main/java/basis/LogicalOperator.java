package basis;

public class LogicalOperator {
    public static void main(String[] args) {
        // & | ^ && || !
        boolean a = true;
        boolean b = false;
//        int a = 3;
//        int b = 2;
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b); // 异或
        System.out.println(a&&b);
        System.out.println(a||b);
    }
}
