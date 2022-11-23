package demo01;

public class Demo02 {
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        String s1 = new String(chars);
        String s2 = new String(chars);
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
