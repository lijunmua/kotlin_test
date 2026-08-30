public class Main {
    public static void main(String[] args) {
        int i = 0x0fffff10;
        int a = i >> 24;
        int r = i >> 16 & 0xff;
        System.out.println(a);
        System.out.println(r);

        String s = "abc";
        String x = s + 456;
        System.out.println(x);

        int y = 3;
        int z = 4;
        System.out.println(y & z);
    }
}
