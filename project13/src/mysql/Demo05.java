package mysql;

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
