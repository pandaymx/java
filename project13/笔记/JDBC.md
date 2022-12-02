# JDBC

JDBC API是一个Java API，可以访问任何类型表列数据，特别是存储在关系数据库中的数据。JDBC代表Java数据库连接。

JDBC库中所包含的API通常与数据库使用于：

- 连接到数据库
- 创建SQL或MySQL语句
- 在数据库中执行SQL或MySQL查询
- 查看和修改数据库中的数据记录

用mysql和Oracle来进行教程，因为我电脑里面既有Oracle也有MySQL

## 1.开发步骤

1. 注册驱动
2. 获取连接
3. 获得语句执行平台
4. 执行sql语句
5. 处理结果
6. 释放对象



```java
//mysql的
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取链接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        //获取执行者对象
        Statement statement = connection.createStatement();
        //执行sql语句
        String sql = "select username,password from user";
        ResultSet resultSet = statement.executeQuery(sql);
        //处理结果
        while (resultSet.next()){
            String usernameStr=resultSet.getString("username");
            String passwordStr=resultSet.getString("password");
            System.out.println(usernameStr+"--"+passwordStr);
        }
        // 关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
```

```java
package oracle;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott";
        String password = "tiger";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "select username,password from users";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String usernameStr=resultSet.getString("username");
            String passwordStr=resultSet.getString("password");
            System.out.println(usernameStr+"--"+passwordStr);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
```

## 2.工具类

```java
package oracle;

import java.sql.*;

public class DBUtils {
    // 重构：一旦发现代码用起来不是很爽的时候，一直有重复动作，必须想把饭抽取出来一个新的
    public DBUtils() {
    }

    public static Connection conn;

    // 静态块：在类初始化之后，会加载一次
    // 一般情况，我们会将一些常用的数据，放在静态块中进行加载
    // 加载完成之后，后面如果想要用的话，直接就可以用
    // 优点是，只会创建一次，不会重复创建良妃性能
    static {
        try {
            // 1.注册驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 2.获取连接：数据库地址、用户名、密码 Connection
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String user = "scott";
            String password = "tiger";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取 Connection 对象
     */
    public static Connection getConnection() {
        return conn;
    }

    /**
     * 释放资源
     */
    public static void close(Statement stmt, Connection conn) {
        // 思路：在关闭资源之前，先要判断，到底有没有用到这个资源
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
```

```java
package mysql;

import java.sql.*;

public class DBUtils {
    // 重构：一旦发现代码用起来不是很爽的时候，一直有重复动作，必须想把饭抽取出来一个新的
    public DBUtils() {
    }

    public static Connection conn;

    // 静态块：在类初始化之后，会加载一次
    // 一般情况，我们会将一些常用的数据，放在静态块中进行加载
    // 加载完成之后，后面如果想要用的话，直接就可以用
    // 优点是，只会创建一次，不会重复创建良妃性能
    static {
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取连接：数据库地址、用户名、密码 Connection
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取 Connection 对象
     */
    public static Connection getConnection() {
        return conn;
    }

    /**
     * 释放资源
     */
    public static void close(Statement stmt, Connection conn) {
        // 思路：在关闭资源之前，先要判断，到底有没有用到这个资源
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
```

测试

```java
package oracle;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilsTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBUtils.getConnection();
        String sql = "select * from users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String usernameStr=resultSet.getString("username");
            String passwordStr=resultSet.getString("password");
            System.out.println(usernameStr+"--"+passwordStr);
        }
        DBUtils.close(resultSet,statement,connection);
    }
}
```

## 3.DriverManager

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mysql.cj.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver extends NonRegisteringDriver implements java.sql.Driver {
    public Driver() throws SQLException {
    }

    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }
}
```

注册驱动，因为Driver可以直接注册，所以代码会先通过反射来获得驱动

获得数据库的连接getConnection(String url,String user,String password)

url：连接路径

user：用户名

password：密码

## 4.Connection

与特定数据库的连接，获得执行sql的对象

也可以对事务进行管理

```java
try {
    //开启事务
    connection.setAutoCommit(false);
    int count1= statement.executeUpdate(sql);
    int i = 3/0;
    int count2= statement.executeUpdate(sql2);
    //无错误提交事务
    connection.commit();
}catch (Exception e){
    // 回滚事务
    connection.rollback();
    e.printStackTrace();
}
```

setAutoCommit方法来开启事务，参数设置为false

commit提交事务

rollback回滚事务

## 5.Statement

来执行sql语句

executeUpdate执行DML和DDL语句

executeQuery执行查询语句返回值是int确定是影响的行数

```Java
public class Demo04 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "update users set password = 1 where username = 'admin'";
        int i = statement.executeUpdate(sql);
        System.out.println(i);
    }
}
```

也可以执行delete语句

## 6.ResultSet

封装查询结果，next从当前位置向前移动，判断当前行是否为有效行，getXxx获取数据

```java
while (resultSet.next()){
    String usernameStr=resultSet.getString("username");
    String passwordStr=resultSet.getString("password");
    System.out.println(usernameStr+"--"+passwordStr);
}
```

## 7.PreparedStatement

预防SQL注入问题

```java
import java.sql.*;

public class Demo05 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from users where username = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"admin");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String username = resultSet.getString("username");
            String pass = resultSet.getString("password");
            System.out.println(username+"--"+pass);

        }
    }
}
```

和statement相似，后续的使用相同
