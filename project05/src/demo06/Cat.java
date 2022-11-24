package demo06;

public class Cat extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("猫吃鱼");
    }
    // 用多态生成如果父类没有这个方法，那就不能访问这个方法
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
