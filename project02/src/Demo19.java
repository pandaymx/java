public class Demo19 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i%2 ==0 ) {
                continue;
            }
            if (i==9){
                break;
            }
            System.out.println(i);
        }
    }
}
