package basis;

public class ForUse {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i); // 只在循环中访问得到

//        int i = 0;
//        for (;i < 10;) {
//            i++;
//        }
//        System.out.println(i);

        int i = 0;
        for (;;) { // 相当于无限循环
            i++;
            System.out.println(i);
        }
    }
}
