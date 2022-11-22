public class Demo01 {
    public static void main(String[] args) {
        // 第一种方式c++方式
        int a[];
        // 第二种方式Java推荐方式，可以发现生成的main方法String数组就是这样写的
        int[] b;
        // 静态初始化
        a = new int[]{1,2,3,4,5};
        //动态初始化
        b = new int[5];
        // 生成的数组地址值
        System.out.println(a);
        // 数组动态初始化的默认值，并通过索引进行访问
        System.out.println(b[0]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
