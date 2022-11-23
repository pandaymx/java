package demo01;

public class Demo01 {
    public static void main(String[] args) {
        // 生成空的字符串
        String s = new String();
        System.out.println(s);
        // 通过new
        char[] chars = {'a','b','c'};
        String s1 = new String(chars);
        System.out.println(chars);
        byte[] bytes = {91,98,46};
        String s2 = new String(bytes);
        System.out.println(s2);
        String s3 = "abc";
        System.out.println(s3);
    }
}
