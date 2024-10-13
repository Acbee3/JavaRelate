package example;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("[1, 1000]内所有的完数：");
        for (int i = 1; i <= 1000; i++) {
            int iSum = 0;
            for (int j = 1; j < i; j++) {
                // j可以整除i，j就是i的因子
                if (i % j == 0) {
                    iSum += j;
                }
            }
            if(iSum == i) {
                System.out.println(i);
            }
        }
    }
}
