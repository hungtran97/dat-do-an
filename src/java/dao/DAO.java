
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hungt
 */
public class DAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/dat_do_an?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    public static Connection con;
    
   
    public DAO() {
        if (con == null) {
            String dbClass = "com.mysql.cj.jdbc.Driver";
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (DB_URL, USER_NAME, PASSWORD);
                System.out.println("connect successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}