package demo01;

public class Demo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        // 添加
        sb.append("de");
        System.out.println(sb);
        // 反转
        sb.reverse();
        System.out.println(sb);
        // 转换成字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
