/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i_banking;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Qno
 */
public class javaconnect {
public static Connection ConnecrDb()
    {
        Connection con=null;
    try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","12345");
        return con;
        }catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
    return null;
    }
    
}
