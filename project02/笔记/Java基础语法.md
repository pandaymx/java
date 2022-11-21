#  Java基础语法

## 1. 注释

​	注释是对代码的解释和说明文字。

Java中的注释分为三种：

* 单行注释：

~~~java
// 这是单行注释文字
~~~

* 多行注释：

~~~java
/*
这是多行注释文字
这是多行注释文字
这是多行注释文字
*/
注意：多行注释不能嵌套使用。
~~~

* 文档注释：

```java
/**
这是多行注释文字
这是多行注释文字
这是多行注释文字
*/
```

### 使用的技巧

​	如果我们要对代码进行解释，那么就可以使用注释

​	当注释的内容比较少，一行就写完了，可以用单行注释

​	如果注释的内容比较多，需要写在多行，那么可以使用多行注释

### 注意点

​	注释的内容不会参与编译和运行的，仅仅是对代码的解释说明而已

​	所以，不管在注释当中写什么内容，都不会影响代码运行的结果

## 2. 关键字

### 2.1 概念

​	被Java赋予了特定含义的英文单词

| **abstract**   | **assert**       | **boolean**   | **break**      | **byte**   |
| -------------- | ---------------- | ------------- | -------------- | ---------- |
| **case**       | **catch**        | **char**      | **class**      | **const**  |
| **continue**   | **default**      | **do**        | **double**     | **else**   |
| **enum**       | **extends**      | **final**     | **finally**    | **float**  |
| **for**        | **goto**         | **if**        | **implements** | **import** |
| **instanceof** | **int**          | **interface** | **long**       | **native** |
| **new**        | **package**      | **private**   | **protected**  | **public** |
| **return**     | **strictfp**     | **short**     | **static**     | **super**  |
| **switch**     | **synchronized** | **this**      | **throw**      | **throws** |
| **transient**  | **try**          | **void**      | **volatile**   | **while**  |

### 2.2 第一个关键字class

​	表示定义一个类。创建一个类

类：Java项目最基本的组成单元，一个完整的Java项目有可能会有成千上万个类来组成的

class后面跟随的就是这个类的名字，简称：类名

在类名后面会有一对大括号，表示这个类的内容



```java
public class HelloWorld{
    
}
```

解释：class表示定义类

​	类名：HelloWorld

​	HelloWorld后面的大括号表示这个类的范围

## 3. 字面量

作用：告诉程序员，数据在程序中的书写格式

| **字面量类型** | **说明**                                  | **程序中的写法**  |
| -------------- | ----------------------------------------- | ----------------- |
| 整数           | 不带小数的数字                            | 666，-88          |
| 小数           | 带小数的数字                              | 13.14，-5.21      |
| 字符           | 必须使用单引号，有且仅能一个字符          | ‘A’，‘0’，   ‘我’ |
| 字符串         | 必须使用双引号，内容可有可无              | “HelloWorld”      |
| 布尔值         | 布尔值，表示真假，只有两个值：true，false | true 、false      |
| 空值           | 一个特殊的值，空值                        | 值是：null        |

~~~java
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(10); // 输出一个整数
        System.out.println(5.5); // 输出一个小数
        System.out.println('a'); // 输出一个字符
        System.out.println(true); // 输出boolean值true
        System.out.println("hello world"); // 输出字符串
    }
}
~~~



## 4. 变量

### 4.1 什么是变量？

​	变量就在程序中临时存储数据的容器

### 4.2 变量的定义格式

​	数据类型 变量名 = 数据值；

#### 4.2.1 格式详解

​	数据类型：限定了变量当中能存储什么类型的数据

​	变量名：其实就是这个容器的名字

​			当以后想要使用变量里面的数据时，直接使用变量名就可以了

​	数据值：真正存储在容器中的数据

​	分号：表示语句的结束

#### 4.2.2 常用的数据类型

​	整数：int

​	小数：（浮点数）double

## 5. 数据类型

### 5.1 Java语言数据类型的分类

- 基本数据类型
- 引用数据类型

### 5.2 基本数据类型的四类八种

| 数据类型 | 关键字  | 内存占用 |                取值范围                |
| :------: | :-----: | :------: | :------------------------------------: |
|   整数   |  byte   |    1     |    -2的7次方 ~ 2的7次方-1(-128~127)    |
|          |  short  |    2     | -2的15次方 ~ 2的15次方-1(-32768~32767) |
|          |   int   |    4     |        -2的31次方 ~ 2的31次方-1        |
|          |  long   |    8     |        -2的63次方 ~ 2的63次方-1        |
|  浮点数  |  float  |    4     |      1.401298e-45 ~ 3.402823e+38       |
|          | double  |    8     |     4.9000000e-324 ~ 1.797693e+308     |
|   字符   |  char   |    2     |                0-65535                 |
|   布尔   | boolean |    1     |              true，false               |

#### 说明

​	e+38表示是乘以10的38次方，同样，e-45表示乘以10的负45次方

​	在java中整数默认是int类型，浮点数默认是double类型

#### 需要记忆以下几点

byte类型的取值范围：

​	-128 ~ 127

int类型的大概取值范围：

​	-21亿多  ~ 21亿多

整数类型和小数类型的取值范围大小关系：

​	double > float > long > int > short > byte



### 5.3 定义8种基本数据类型变量

```java
public class Demo3{
    public static void main(String[] args){
        //1.定义byte类型的变量
        //数据类型 变量名 = 数据值;
        byte a = 10;
        System.out.println(a);

        //2.定义short类型的变量
        short b = 20;
        System.out.println(b);

        //3.定义int类型的变量
        int c = 30;
        System.out.println(c);

        //4.定义long类型的变量
        long d = 123456789123456789L;
        System.out.println(d);

        //5.定义float类型的变量
        float e = 10.1F;
        System.out.println(e);

        //6.定义double类型的变量
        double f = 20.3;
        System.out.println(f);

        //7.定义char类型的变量
        char g = 'a';
        System.out.println(g);

        //8.定义boolean类型的变量
        boolean h = true;
        System.out.println(h);

    }
}
```

#### **注意点**

- 如果要定义 一个整数类型的变量，不知道选择哪种数据类型了，默认使用int
- 如果要定义 一个小数类型的变量，不知道选择哪种数据类型了，默认使用double
- 如果要定义一个long类型的变量，那么在数据值的后面需要加上L后缀。（大小写都可以，建议大写。）
- 如果要定义一个float类型的变量，那么在数据值的后面需要加上F后缀。（大小写都可以）



## 6. 标识符

### 6.1 硬性要求：

​	必须要这么做，否则代码会报错

- 必须由数字、字母、下划线_、美元符号$组成
- 数字不能开头
- 不能是关键字
- 区分大小写的

### 6.2 软件建议：

​	如果不这么做，代码不会报错，但是会让代码显得比较low。

### 6.2.1 小驼峰命名法

适用于变量名和方法名

* 如果是一个单词，那么全部小写，比如：name

* 如果是多个单词，那么从第二个单词开始，首字母大写，比如：firstName、maxAge

### 6.2.2 大驼峰命名法

适用于类名

* 如果是一个单词，那么首字母大写。比如：Demo、Test。

* 如果是多个单词，那么每一个单词首字母都需要大写。比如：HelloWorld

不管起什么名字，都要做到见名知意。

## 6.2.3 常见命名

类名：大驼峰

变量名和方法名：小驼峰

常量名：全大写

包名：全小写

## 7. 键盘录入

Java写好的功能都放在了Scanner这个类中，所以，我们只要直接使用Scanner这个类就可以了。

使用步骤：

第一步：

​	导包

第二步：

​	创建对象

第三步：

​	接收数据

代码示例：

```java
// 导包
import java.util.Scanner;

public class Demo04 {

    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int i = sc.nextInt();
        System.out.println(i);
    }
}

```

