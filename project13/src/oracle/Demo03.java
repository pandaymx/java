package oracle;

import java.sql.*;

public class Demo03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott";
        String password = "tiger";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "update users set password = 123456 where username = 'admin'";
        String sql2 = "update users set password = 123456789 where username = '123'";
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


        statement.close();
        connection.close();
    }
}
