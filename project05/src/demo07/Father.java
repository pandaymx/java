package demo07;

public class Father {
    final int NUM = 10;
    // 被final修饰不能重写
    final public void show1(){
        System.out.println("Father show1");
    }
    public void show2(){
        System.out.println("Father show2");
    }
}
