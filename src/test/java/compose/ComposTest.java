package compose;

import org.compose.DBConnection;
import org.compose.MySQLConnection;
import org.compose.OracleConnection;

public class ComposTest {

    public static void main(String[] args) {
        DBConnection mysql = new MySQLConnection();
        String connection = mysql.getConnection();
        System.out.println(connection);

        DBConnection oracle = new OracleConnection();
        String connection1 = oracle.getConnection();
        System.out.println(connection1);
    }

}
