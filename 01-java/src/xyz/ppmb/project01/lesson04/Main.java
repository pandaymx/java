package xyz.ppmb.project01.lesson04;

/**
 * @projectName: java
 * @package: xyz.ppmb.project01.lesson04
 * @className: Main
 * @author: 皮皮萌宝
 * @description: 算数运算符
 * @date: 2023/11/17 21:52
 * @version: 1.0
 */
public class Main {
        public static void main(String[] args) {
        int a = 10; // 定义整型变量a并赋值为10
        int b = 20; // 定义整型变量b并赋值为20
        System.out.println("a + b = " + (a + b)); // 打印输出a与b的和
        System.out.println("a - b = " + (a - b)); // 打印输出a与b的差
        System.out.println("a * b = " + (a * b)); // 打印输出a与b的积
        System.out.println("a / b = " + (a / b)); // 打印输出a除以b的商（整除）
        System.out.println("a / b = " + (a / 20.0)); // 打印输出a除以20的商（浮点除）
        System.out.println("a % b = " + (a % b)); // 打印输出a除以b的余数
    }

}
