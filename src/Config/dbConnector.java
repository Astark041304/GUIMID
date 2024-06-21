/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class dbConnector {
    
    private static final String URL = "jdbc:mysql://localhost:3306/restaurant_menu";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Connection connect;

    public dbConnector() {
        try {
            connect = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
        }
    }

    public Connection getConnection() throws SQLException {
        if (connect == null || connect.isClosed()) {
            connect = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connect;
    }

    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }

    public ResultSet OrderData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }

    public boolean insertData(String sql) {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
            return false;
        }
    }

    public void updateData(String sql) {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Updated Successfully!");
            } else {
                System.out.println("Data Update Failed!");
            }
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
        }
    }

    public void deleteData(String sql) {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully!");
            } else {
                System.out.println("Data Deletion Failed!");
            }
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
        }
    }

    public int executeUpdate(String query) {
        try (Statement statement = connect.createStatement()) {
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    
  public ResultSet executeQuery(String query) {
        try {
            Statement statement = connect.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public int setProductInfo(String query) {
        try (Statement statement = connect.createStatement()) {
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    
}



