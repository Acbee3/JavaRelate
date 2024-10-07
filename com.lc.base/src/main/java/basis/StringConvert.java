package basis;

public class StringConvert {
    public static void main(String[] args) {
        // int float double
        int i = 10;
        double d = 10.0;
        float f = 10.0f;
        String s1 = i + "";
        String s2 = d + "";
        String s3 = f + "";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String s4 = "123";
        Integer i1 = Integer.parseInt(s4);
        Double d1 = Double.parseDouble(s4);
        Float f1 = Float.parseFloat(s4);
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(f1);
    }
}
