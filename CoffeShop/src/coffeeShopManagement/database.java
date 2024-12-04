package coffeeShopManagement;

import java.sql.Connection;
import java.sql.DriverManager;


public class database {

    public static Connection connectDB() {

        try {

            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/cafe?useSSL=false&serverTimezone=UTC";


            Connection connect = DriverManager.getConnection(url, "root", "");

            //Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/cafe_management", "root", "");
            return connect;
        } catch (Exception e) {
            System.err.println("Database connection failed: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

}