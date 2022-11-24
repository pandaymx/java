package demo05;

public class Trainee extends Person{
    String add = "son";

    // 方法重写override重写注解
    @Override
    public void show() {
        // 父类的show方法
        super.show();
        System.out.println("我会唱跳rap");
        // 访问父类的成员方法
        System.out.println(super.add);
    }
}
