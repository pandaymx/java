package demo06;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        // 向下转型
        Cat c = (Cat) a;
        c.catchMouse();
    }
}
