package basis;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100);
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("输入吧");
            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("猜对了");
                break;
            } else if (guess > num) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
            count++;
        } while (count != num);
        System.out.println("总共猜了" + count + "次");
    }
}
