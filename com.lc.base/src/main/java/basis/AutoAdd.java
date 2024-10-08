package basis;

public class AutoAdd {
    public static void main(String[] args) {
        int i = 1;
        int j;
//        j = i++;
        j = ++i;
        System.out.println(j + ", " + i);
    }
}
