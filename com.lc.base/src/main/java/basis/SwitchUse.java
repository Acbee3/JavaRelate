package basis;

import java.util.Scanner;

public class SwitchUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("base");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
