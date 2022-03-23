/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagemnetsystem;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class conn {
    
   
    
    public static Connection getCon(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","root");
            return con;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
     
        
    }
 

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
