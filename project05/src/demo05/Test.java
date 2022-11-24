    package demo05;

    public class Test {
        public static void main(String[] args) {
            Trainee trainee = new Trainee();

            trainee.age=18;
            trainee.name="蔡徐坤";
            trainee.show();
            System.out.println(trainee.age);
            System.out.println(trainee.name);
            System.out.println(trainee.add);
            // trainee.show2(); 无法访问私有的方法
        }
    }
