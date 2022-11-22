public class Demo14 {
    public static void main(String[] args) {
        // if语句格式1
        int a = 10;
        int b = 10;
        if (a>b){
            System.out.println(a);
        }
        // if语句格式2
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        // if语句格式.
        if (a>b){
            System.out.println(a);
        } else if (a==b) {
            System.out.println("两个数是相等的");
        }else {
            System.out.println(b);
        }
    }
}
