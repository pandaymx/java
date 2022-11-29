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

## 2.
