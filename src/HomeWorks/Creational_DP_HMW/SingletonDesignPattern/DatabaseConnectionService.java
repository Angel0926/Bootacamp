package HomeWorks.Creational_DP_HMW.SingletonDesignPattern;
import java.sql.*;
/**
 *Factory  Design Pattern
 */
public class DatabaseConnectionService {


    public Connection createConnection() {
        final String DRIVER_URL = "com.mysql.cj.jdbc.Driver";
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/employee";
        final String USERNAME = "root";
        final String PASSWORD = "root";

        Connection con = null;
        try {
            return con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

        private static DatabaseConnectionService db;
        private DatabaseConnectionService() { }

        public static DatabaseConnectionService getInstance() {
            if (db == null) {
                db = new DatabaseConnectionService();
            }
            return db;
        }
    }

