package basis;

public class ForceConvertType {
    public static void main(String[] args) {
        int i = (int)1.9; // 高精度转向低精度
        byte b = (byte)2000;
        System.out.println(i); // 1 精度丢失
        System.out.println(b); // -48 越界溢出
    }
}
