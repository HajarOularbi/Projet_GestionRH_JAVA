import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection{
    private static Connection connection;
    private DBConnection(){}
    public static Connection getInstance() throws Exception{
        if (connection==null) {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gestion",
                    "root",
                    ""
            );
        }
        return connection;
    }
}