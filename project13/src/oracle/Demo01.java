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
