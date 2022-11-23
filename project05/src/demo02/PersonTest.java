package demo02;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        // person.age不可以直接使用
        person.setAge(18);
        person.setName("蔡徐坤");
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
