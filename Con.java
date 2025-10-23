package bank.management.system;
import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;

    public Con(){
        try{
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem?useSSL=false",
                    "root",
                    "Shr1yans@mysql"
            );
            statement = connection.createStatement();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
