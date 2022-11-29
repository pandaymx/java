package mysql;

import java.sql.*;

public class Demo03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "update users set password = 1 where username = 'admin'";
        String sql2 = "update users set password = 1 where username ='123'";
        try {
            //开启事务
            connection.setAutoCommit(false);
            int count1= statement.executeUpdate(sql);
            int i = 3/0;
            int count2= statement.executeUpdate(sql2);
            connection.commit();
        }catch (Exception e){
            connection.rollback();
            e.printStackTrace();
        }
        statement.close();
        connection.close();
    }
}
