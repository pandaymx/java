public class Demo04 {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2.1, 3));
        System.out.println(add(3,2.1));
        System.out.println(add(1,2,3));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,int b){
        return a+b;
    }
    public static double add(int a,double b){
        return a+b;
    }
    public static float add(int a,int b,int c){
        return a+b+c;
    }
}
