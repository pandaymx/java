package demo06;

public class Dog extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
