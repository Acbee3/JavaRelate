package basis;

import java.util.Scanner;

public class ScnnerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数：");
        if (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println("输入一句话：");
            String s = sc.next();
            System.out.println(s);
        }
    sc.close();
    }
}
