package bank.management.system;
import java.sql.*;
public class _on {
    Connection connection;
    Statement statement;
    public _on() {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","B.dhruv@2602");
            statement = connection.createStatement();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new _on();
    }
}
