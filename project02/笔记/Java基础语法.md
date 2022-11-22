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

### 6.2.3 常见命名

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

## 8.运算符和表达式

​	运算符是对常量或者变量进行操作的符号

​	比如： +  -  *  / 

​	用运算符把常量或者变量连接起来的，符合Java语法的式子就是表达式

​	a + b 这个整体就是表达式

​	而其中+是算术运算符的一种，所以这个表达式也称之为算术表达式

### 8.1 算术运算符

分类：

```txt
+ - * / %
```

运算特点：

```txt
+ - * :跟数学中一样
```

```txt
1.整数相除结果只能得到整除，如果结果想要是小数，必须要有小数参数
2.小数直接参与运算，得到的结果有可能是不精确的
```

```txt
%：取模、取余。
   他做的也是除法运算，只不过获取的是余数而已
```

### 8.2数据类型转换

#### 8.2.1 自动类型转换

##### 概念：

​	也叫自动类型提升

​	就是把一个取值范围小的数据或者变量，赋值给另一个取值范围大的变量。此时不需要我们额外写代码单独实现，是程序自动帮我们完成的

##### 提升规则：

* 取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算
* byte、short、char三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算

​	byte short int long float double 从小到大排序

#### 8.2.2 强制转换

##### 概念：

​	如果要把一个取值范围大的数据或者变量赋值给另一个取值范围小的变量。是不允许直接操作

​	如果一定要这么干，就需要加入强制转换

##### 书写格式：

​	目标数据类型 变量名 = （目标数据类型）被强转的数据

简单理解：

​	要转成什么类型的，那么就在小括号中写什么类型就可以了

案例：

```java
public class Demo06 {
    public static void main(String[] args) {
        // 自动类型转换
        double a = 10;
        System.out.println(a);
        // 强制类型转换
        int b = (int) a;
        System.out.println(b);
    }
}
```

注意点：

​	强制转换有可能会导致精度丢失

### 8.3字符串的+操作

#### 核心技巧：

* 当+操作中出现字符串时，此时就是字符串的连接符，会将前后的数据进行拼接，并产生一个新的字符串
* 当连续进行+操作时，从左到右逐个执行的

``` java
public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        // 10string
        System.out.println(a+"string");
        int b = 10;
        // 20string 
        System.out.println(a+b+"string");
    }
}
```



### 8.4字符的+操作

#### 规则：

​	当+操作中出现了字符，会拿着字符到计算机内置的ASCII码表中去查对应的数字，然后再进行计算

``` java
public class Demo08 {
    public static void main(String[] args) {
        char a = 97;
        System.out.println(a);
        // int和char的可以互相转换
        System.out.println('a'+10);
        char b = '我';
        char c = '你';
        int d ;
        d = b+c;
        System.out.println(d);
    }
}

```

数字和字符可以相互转换

### 8.5自增自减运算符

#### 分类：

```txt
++  自增运算符
--  自减运算符
```

++：就是把变量里面的值+1

--：就是把变量里面的值-1

#### 使用方式：

* 放在变量的前面，我们叫做先++。 比如：++a
* 放在变量的后面，我们叫做后++。 比如：a++

#### 注意点：

​	不管是先++，还是后++。单独写在一行的时候，运算结果是一模一样的

​	如果和其他一同运算，a++是先使用a的值再运算，++a是先算再用

``` java
public class Dem09 {
    public static void main(String[] args) {
        int a = 10;
        // 10
        System.out.println(a++);
        // 12
        System.out.println(++a);
    }
}
```



### 8.6 赋值运算符

#### 分类：

​	+=、-=、*=、/=、%= 、=

#### 运算规则：

​	就是把左边跟右边进行运算，把最终的结果赋值给左边，对右边没有任何影响

#### 注意点：

​	扩展的赋值运算符中隐层还包含了一个强制转换。

以+=为例。

a += b ;实际上相当于 a = (byte)(a + b);

将注释中的c= c+d取消注释，会发现出错

```java
public class Demo10 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        a += b;
        // 相当于a= a+b;
        System.out.println(a);
        byte c =20;
        byte d = 10;
        // c = c +d;
        System.out.println(c);
        c += d;
        System.out.println(c);

    }
}
```

### 8.7关系运算符

又叫比较运算符，其实就是拿着左边跟右边进行了判断而已。

#### 分类：

| 符号 | 解释                                                         |
| ---- | ------------------------------------------------------------ |
| ==   | 就是判断左边跟右边是否相等，如果成立就是true，如果不成立就是false |
| !=   | 就是判断左边跟右边是否不相等，如果成立就是true，如果不成立就是false |
| >    | 就是判断左边是否大于右边，如果成立就是true，如果不成立就是false |
| >=   | 就是判断左边是否大于等于右边，如果成立就是true，如果不成立就是false |
| <    | 就是判断左边是否小于右边，如果成立就是true，如果不成立就是false |
| <=   | 就是判断左边是否小于等于右边，如果成立就是true，如果不成立就是false |

#### 注意点：

* 关系运算符最终的结果一定是布尔类型的。要么是true，要么是false
* 在写==的时候，千万不要写成=

```java
public class Demo11 {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
```



### 8.8逻辑运算符

#### & 和 | 的使用：

&：逻辑与（而且）

​	两边都为真，结果才是真，只要有一个为假，那么结果就是假。

|：逻辑或（或者）

​	两边都为假，结果才是假，只要有一个为真，那么结果就是真。

#### ^（异或）的使用：

计算规则：如果两边相同，结果为false，如果两边不同，结果为true

#### !（取反）的使用：

​	是取反，也叫做非。

计算规则：false取反就是true，true取反就是false

```java
public class Demo12 {
    public static void main(String[] args) {
        // &都为真才为真
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(false&false);
        // |都为假才为假
        System.out.println(true|true);
        System.out.println(true|false);
        System.out.println(false|true);
        System.out.println(false|false);
        // ^不进位加
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);
        // !取反
        System.out.println(!(true));
        System.out.println(!(false));
    }
}

```



### 8.9短路逻辑运算符

分类：  &&   ||

#### &&：

​	运算结果跟&是一模一样的，只不过具有短路效果

#### ||：

​	运算结果跟|是一模一样的。只不过具有短路效果

#### 逻辑核心：

​	当左边不能确定整个表达式的结果，右边才会执行

​	当左边能确定个表达式的结果，那么右边就不会执行了。从而提高了代码的运行效率。



### 8.10 三元运算符



#### 格式：

​	关系表达式 ？ 表达式1 ：表达式2 ；

#### 计算规则：

* 计算关系表达式的值
* 如果关系表达式的值为真，那么执行表达式1
* 如果关系表达式的值为假，那么执行表达式2

```java
public class Demo13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
```



## 9. 流程控制

在一个程序执行的过程中，各条语句的执行顺序对程序的结果是有直接影响的。所以，我们必须清楚每条语句的执行程。而且，很多时候要通过控制语句的执行顺序来实现我们想要的功能

### 9.1 流程控制语句分类

​	顺序结构

​	判断和选择结构(if, switch)

​	循环结构(for, while, do…while)



### 9.2 if语句

#### 9.2.1 if语句格式1

```java
格式：
if (关系表达式) {
    语句体;	
}
```

执行流程：

①首先计算关系表达式的值

②如果关系表达式的值为true就执行语句体

③如果关系表达式的值为false就不执行语句体

④继续执行后面的语句内容

![1545616039363](E:/BaiduNetdiskDownload/入门到起飞（上）/Java基础-资料/day04-判断和循环/笔记/img/1545616039363.png)



1. 如果我们要对一个布尔类型的变量进行判断，不要写==，直接把变量写在小括号中即可

2. 如果大括号中的语句体只有一条，那么大括号可以省略不写

   如果大括号省略了，那么if只能控制距离他最近的那一条语句

   

#### 9.2.2 if语句格式2

```java
格式：
if (关系表达式) {
    语句体1;	
} else {
    语句体2;	
}
```

执行流程：

①首先计算关系表达式的值

②如果关系表达式的值为true就执行语句体1

③如果关系表达式的值为false就执行语句体2

④继续执行后面的语句内容

![1545616221283](E:/BaiduNetdiskDownload/入门到起飞（上）/Java基础-资料/day04-判断和循环/笔记/img/1545616221283.png)



#### 9.2.3 if语句格式3

```java
格式：
if (关系表达式1) {
    语句体1;	
} else if (关系表达式2) {
    语句体2;	
} 
…
else {
    语句体n+1;
}
```

执行流程：

①首先计算关系表达式1的值

②如果值为true就执行语句体1；如果值为false就计算关系表达式2的值

③如果值为true就执行语句体2；如果值为false就计算关系表达式3的值

④…

⑤如果没有任何关系表达式为true，就执行语句体n+1。

![1545616667104](E:/BaiduNetdiskDownload/入门到起飞（上）/Java基础-资料/day04-判断和循环/笔记/img/1545616667104.png)



``` java
public class Demo14 {
    public static void main(String[] args) {
        // if语句格式1
        int a = 10;
        int b = 10;
        if (a>b){
            System.out.println(a);
        }
        // if语句格式2
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        // if语句格式.
        if (a>b){
            System.out.println(a);
        } else if (a==b) {
            System.out.println("两个数是相等的");
        }else {
            System.out.println(b);
        }
    }
}

```



### 9.3 switch语句

#### 9.3.1 格式

```java
switch (表达式) {
	case 1:
		语句体1;
		break;
	case 2:
		语句体2;
		break;
	...
	default:
		语句体n+1;
		break;
}
```

#### 9.3.2 执行流程：

- 首先计算出表达式的值 
- 其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结 束
- 最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉



#### 9.3.3 switch的扩展知识：

- default的位置和省略情况

  default可以放在任意位置，也可以省略

- case穿透

  不写break会引发case穿透现象

- switch在JDK12的新特性switch和if第三种格式各自的使用场景

当我们需要对一个范围进行判断的时候，用if的第三种格式

当我们把有限个数据列举出来，选择其中一个执行的时候，用switch语句

```java
import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            case 6:
                System.out.println("今天星期六");
                break;
            case 7:
                System.out.println("今天星期日");
                break;
            default:
                System.out.println("你输错了");
        }
    }
}

```





### 9.4 for循环结构

​	循环语句可以在满足循环条件的情况下，反复执行某一段代码，这段被重复执行的代码被称为循环体语句，当反复 执行这个循环体时，需要在合适的时候把循环判断条件修改为false，从而结束循环，否则循环将一直执行下去，形成死循环。

#### 9.4.1 for循环格式：

```java
for (初始化语句;条件判断语句;条件控制语句) {
	循环体语句;
}
```

**格式解释：**

- 初始化语句：  用于表示循环开启时的起始状态，简单说就是循环开始的时候什么样
- 条件判断语句：用于表示循环反复执行的条件，简单说就是判断循环是否能一直执行下去
- 循环体语句：  用于表示循环反复执行的内容，简单说就是循环反复执行的事情
- 条件控制语句：用于表示循环执行中每次变化的内容，简单说就是控制循环是否能执行下去

**执行流程：**

①执行初始化语句

②执行条件判断语句，看其结果是true还是false

​             如果是false，循环结束

​             如果是true，继续执行

③执行循环体语句

④执行条件控制语句

⑤回到②继续

**for循环书写技巧：**

- 确定循环的开始条件
- 确定循环的结束条件
- 确定循环要重复执行的代码



```java
public class Demo16 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
        }
    }
}
```

### 9.5 while循环

#### 9.5.1 格式：

```java
初始化语句;
while(条件判断语句){
	循环体;
	条件控制语句;
}
```



```java
public class Demo17 {
    public static void main(String[] args) {
        int i =0;
        while (i<10){
            System.out.println("hello world");
            i++;
        }
    }
}
```

### 9.6 do...while循环

格式：

```java
初始化语句;
do{
    循环体;
    条件控制语句;
}while(条件判断语句);
```

特点：

​	先执行，再判断

```java
public class Demo18 {
    public static void main(String[] args) {
        int i =0;
        do {
            System.out.println("hello world");
            i++;
        }while (i<10);
    }
}
```



### 9.7 三种格式的区别：

​	for和while循环，是先判断，再执行

​	do...while是先执行，再判断

​	当知道循环次数或者循环范围的时候，用for循环

​	当不知道循环次数，也不知道循环范围，但是知道循环的结束条件时，用while循环



