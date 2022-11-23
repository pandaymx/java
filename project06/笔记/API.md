## 1.API

### 1.1API概述

- 什么是API

  ​	API (Application Programming Interface) ：应用程序编程接口

- java中的API

  ​	指的就是 JDK 中提供的各种功能的 Java类，这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，只需要学习这些类如何使用即可，我们可以通过帮助文档来学习这些API如何使用。

## 2.String类

### 2.1String类概述

​	String 类代表字符串，Java 程序中的所有字符串文字（例如“abc”）都被实现为此类的实例。ava 程序中所有的双引号字符串，都是 String 类的对象。String 类在 java.lang 包下，所以使用时不需要导包

### 2.2String类的特点

- 字符串不可变
- 可以被共享
- 字符串效果上相当于字符数组( char[] )，但是底层原理是字节数组( byte[] )

### 2.3String类的构造方法

- 常用的构造方法

  | 方法名                      | 说明                                      |
  | --------------------------- | ----------------------------------------- |
  | public   String()           | 创建一个空白字符串对象，不含有任何内容    |
  | public   String(char[] chs) | 根据字符数组的内容，来创建字符串对象      |
  | public   String(byte[] bys) | 根据字节数组的内容，来创建字符串对象      |
  | String s =   “abc”;         | 直接赋值的方式创建字符串对象，内容就是abc |

```java
package demo01;

public class Demo01 {
    public static void main(String[] args) {
        // 生成空的字符串
        String s = new String();
        System.out.println(s);
        // 通过new
        char[] chars = {'a','b','c'};
        String s1 = new String(chars);
        System.out.println(chars);
        byte[] bytes = {91,98,46};
        String s2 = new String(bytes);
        System.out.println(s2);
        String s3 = "abc";
        System.out.println(s3);
    }
}
```



### 2.4 创建字符串对象两种方式的区别

- 通过构造方法创建

  ​	通过 new 创建的字符串对象，每一次 new 都会申请一个内存空间，虽然内容相同，但是地址值不同

- 直接赋值方式创建

  ​	以“”方式给出的字符串，只要字符序列相同(顺序和大小写)，无论在程序代码中出现几次，JVM 都只会建立一个 String 对象，并在字符串池中维护

### 2.5 字符串的比较

#### 2.5.1 ==号的作用

- 比较基本数据类型：比较的是具体的值
- 比较引用数据类型：比较的是对象地址值

#### 2.5.2 equals方法的作用

- 方法介绍

  ```java
  public boolean equals(String s)     比较两个字符串内容是否相同、区分大小写
  ```

  ```java
  package demo01;
  
  public class Demo02 {
      public static void main(String[] args) {
          char[] chars = {'a','b','c'};
          String s1 = new String(chars);
          String s2 = new String(chars);
          String s3 = "abc";
          String s4 = "abc";
          System.out.println(s1==s2);
          System.out.println(s1==s3);
          System.out.println(s3==s4);
          System.out.println(s1.equals(s2));
          System.out.println(s1.equals(s3));
          System.out.println(s3.equals(s4));
      }
  }
  
  ```

### 2.6 StringBuilder

StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的。

当我们在拼接字符串和反转字符串的时候会使用到

```java
package demo01;

public class Demo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        // 添加
        sb.append("de");
        System.out.println(sb);
        // 反转
        sb.reverse();
        System.out.println(sb);
        // 转换成字符串
        String str = sb.toString();
        System.out.println(str);
    }
}

```

### 2.7 StringBuffer

和StrinBuilder的创建方式差不多只需要把new StringBuilder改成StringBuffer就可以了

StringBuffer是线程安全的，效率稍低



