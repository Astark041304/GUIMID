import Config.dbConnector;
import java.sql.*;

public class OrderDeletionApp {

    private dbConnector dbc;
    private String adminPIN = "1234"; // Admin PIN for deletion

    public OrderDeletionApp() {
        dbc = new dbConnector(); // Initialize your database connector
    }

    public boolean validateAdminPIN(String enteredPIN) {
        return enteredPIN.equals(adminPIN);
    }
}