package demo02;

public class Person {


    // 封装
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    // 因为局部变量和成员变量同名
    // 所以需要this来进行设置 
    public void setName(String name) {
        // this.name表示成员变量
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("大家好，我是练习两年半的个人练习生蔡徐坤");
    }

}
