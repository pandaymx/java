public class Demo12 {
    public static void main(String[] args) {
        // &都为真才为真
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(false&false);
        // |都为假才为假
        System.out.println(true|true);
        System.out.println(true|false);
        System.out.println(false|true);
        System.out.println(false|false);
        // ^不进位加
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);
        // !取反
        System.out.println(!(true));
        System.out.println(!(false));
    }
}
