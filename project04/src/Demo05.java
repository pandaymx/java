public class Demo05 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int a = 1;
        changeValue(arr,a);
        // 值为5
        System.out.println(arr[0]);
        // 值为1
        System.out.println(a);
    }
    public static void changeValue(int[] arr,int a){

        arr[0]=5;
        a = 10;
    }
}
