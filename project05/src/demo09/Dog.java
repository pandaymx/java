package demo09;

// 可以同时实现两个接口的能力
public class Dog implements EatRun,Ctrl{
    @Override
    public void eat() {
        System.out.println("狗喜欢吃屎");
    }

    @Override
    public void run() {
        System.out.println("我能跑很久");
    }

    @Override
    public void show() {
        System.out.println("我喜欢唱跳rap和篮球");
    }
}
