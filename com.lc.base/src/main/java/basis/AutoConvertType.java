package basis;

public class AutoConvertType {
    public static void main(String[] args) {
        // char short int long float double 从低精度向高精度转，不能反过来
        double d = 1000;
        int i = 'a'; // char => int
        int i1 = 1000;
        float f = 100.1F; // 不加f会认为是double
        System.out.println(d);
        System.out.println(i);
        System.out.println(i1 + f); // 都转为float
        System.out.println(i1 + f + d); // 都转为double

    }
}
