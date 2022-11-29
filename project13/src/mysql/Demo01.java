package mysql;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "select username,password from user";
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
