package example;

public class NarcisssiticNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int hundreds = i / 100;
            int tens = i / 10 / 10;
            int ones = i / 10 / 10 % 10;
            if (hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones == i) {
                System.out.println("num: " + i);
            }
        }
    }
}
