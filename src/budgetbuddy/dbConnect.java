/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budgetbuddy;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author being
 */
public class dbConnect {
    public static Connection c;
    public static Statement state;
    
    static{
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BudgetBuddydb?useSSL=false", "root", "");
            state = c.createStatement();
        }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
