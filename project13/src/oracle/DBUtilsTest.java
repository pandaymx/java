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
