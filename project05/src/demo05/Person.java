package demo05;

public class Person {
    int age;
    String  name;
    String add = "father";

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.println("我会很多技能");
    }
    private void show2(){
        System.out.println("我是私有的" );
    }
}
