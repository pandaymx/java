#  Java基础语法



## 1. 人机交互



### 1.1 什么是cmd？



就是在windows操作系统中，利用命令行的方式去操作计算机

利用cmd命令去操作计算机，比如：打开文件，打开文件夹，创建文件夹等



### 1.2 如何打开CMD窗口？



1. win + R

		此时会出现运行窗口。

2. 在运行窗口中输出cmd
3. 输出回车



 ![image-20210923091350952](assets\cmd.png)



### 1.3 常用CMD命令



常见的CMD命令如下：

| 操作               | 说明                 |
| ------------------ | -------------------- |
| 盘符名称:          | 盘符切换             |
| dir                | 查看当前路径下的内容 |
| cd 目录            | 进入单级目录         |
| cd ..              | 回退到上一级目录     |
| cd 目录1\目录2\... | 进入多级目录         |
| cd \               | 回退到盘符目录       |
| cls                | 清屏                 |
| exit               | 退出命令提示符窗口   |





### 1.4 环境变量



​	在启动软件的时候，操作系统会先在当前路径下找，如果在当前录课没有再到环境变量的路径中去找。如果都找不到就提示无法启动。

步骤：

- 右键我的电脑，选择属性。
- 点击左侧的高级系统设置
- 选择高级，再点击下面的环境变量。
- 找系统变量里面的PATH
- 把软件的完整路径，配置到PATH当中就可以了。



图解示例如下：

第一步：右键点击我的电脑并选择属性，或者使用alt＋enter组合键

![image-20221119011214617](assets\1.png)

第二步：点击高级系统设置

​	 ![image-20221119011325239](assets\2.png)

第三步：选择高级，再点击下面的环境变量

 ![image-20210923091350952](assets\3.png)



第四步：找系统变量里面的PATH

 ![image-20210923091350952](assets\4.png)



第五步：点击新建，把软件的完整路径，配置到PATH当中，再点击确定即可



 ![image-20210923091350952](assets\5.png)



## 2. Java概述



### 2.1 Java是什么？

语言：人与人交流沟通的表达方式

计算机语言：人与计算机之间进行信息交流沟通的一种特殊语言

Java是一门非常火的计算机语言（也叫做编程语言）

我们想要让计算机做一些事情，那么就可以通过Java语言告诉计算机就可以了

### 2.2下载和安装



#### 2.2.1 下载



通过官方网站获取JDK

[http://www.oracle.com](http://www.oracle.com/)





#### 2.2.2 安装

​	傻瓜式安装，下一步即可。默认的安装路径是在C:\Program Files下。

建议：

- 安装路径不要有中文，不要有空格等一些特殊的符号。
- 以后跟开发相关的所有软件建议都安装在同一个文件夹中，方便管理。



#### 2.2.3 JDK的安装目录介绍

| 目录名称 | 说明                                                         |
| -------- | ------------------------------------------------------------ |
| bin      | 该路径下存放了JDK的各种工具命令     javac和java就放在这个目录 |
| conf     | 该路径下存放了JDK的相关配置文件                              |
| include  | 该路径下存放了一些平台特定的头文件                           |
| jmods    | 该路径下存放了JDK的各种模块                                  |
| legal    | 该路径下存放了JDK各模块的授权文档                            |
| lib      | 该路径下存放了JDK工具的一些补充JAR包                         |



### 2.3 HelloWorld





#### 2.3.1 Java程序开发运行流程



开发Java程序，需要三个步骤：编写程序，编译程序，运行程序。



#### 2.3.2 HelloWorld案例的编写



1. 新建文本文档文件，修改名称为HelloWorld.java。不能修改后缀名百度如何显示后缀名



2. 用记事本打开HelloWorld.java文件，输写程序内容。





```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
	}
}
```

3. 保存

4. 编译文件。编译后会产生一个class文件。

   java文件：程序员自己编写的代码。

   class文件：交给计算机执行的文件。

5. e运行代码

   **注意**：运行的是编译之后的class文件。

> 用到两个命令：
>
> ​	javac + 文件名 + 后缀名 （就是编译java文件）
>
> ​	java + 文件名（运行编译之后的class文件）



### 2.4 环境变量

#### 2.4.1 为什么配置环境变量

开发Java程序，需要使用JDK提供的开发工具（比如javac.exe、java.exe等命令），而这些工具在JDK的安装目录的bin目录下，如果不配置环境变量，那么这些命令只可以在bin目录下使用，而我们想要在任意目录下都能使用，所以就要配置环境变量。

现在最新从官网上下载的JDK安装时会自动配置javac、java命令的路径到Path环境变量中去 ，所以javac、java可以直接使用。

#### 2.4.2配置方式

![image-20210923091654365](assets/image-20210923091654365.png)



以前下载的老版本的JDK是没有自动配置的，而且自动配置的也只包含了4个工具而已，所以我们需要删掉已经配置完毕的，再次重新配置Path环境变量。

①**JAVA_HOME**：告诉操作系统JDK安装在了哪个位置（未来其他技术要通过这个找JDK）



②**Path**：告诉操作系统JDK提供的javac(编译)、java(执行)命令安装到了哪个位置



### 2.5 Java语言的发展

三个版本：



* Java8：这个是目前绝大数公司正在使用的版本
* Java11：另一个长期支持版本
* Java17：未来的主流



### 2.6 Java的平台



​	JavaSE、JavaEE



#### 2.6.1 JavaSE



​	是其他两个版本的基础。

#### 2.6.2 JavaEE



​	用于Web方向的网站开发。（主要从事后台服务器的开发）

​	在服务器领域，Java是当之无愧的龙头老大



### 2.7 Java的主要特性



- 面向对象
- 安全性
- 多线程
- 简单易用
- 开源
- 跨平台

#### Java语言跨平台的原理



- 操作系统本身其实是不认识Java语言的。
- 但是针对于不同的操作系统，Java提供了不同的虚拟机。

虚拟机会把Java语言翻译成操作系统能看得懂的语言。

![image-20210923091350952](assets\image-20210923091350952.png)

### 2.8 JRE和JDK



![image-20210923091544110](assets\image-20210923091544110.png)

JVM（Java Virtual Machine），Java虚拟机

JRE（Java Runtime Environment），Java运行环境，包含了JVM和Java的核心类库（Java API）

JDK（Java Development Kit）称为Java开发工具，包含了JRE和开发工具

总结：我们只需安装JDK即可，它包含了java的运行环境和虚拟机
