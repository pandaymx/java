package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
