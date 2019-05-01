/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_managment_system;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MAYANK
 */
public class DB {
    
     static Connection con=null;

     public static Connection java_db(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
           /* Statement state=con.createStatement();
            ResultSet rs=state.executeQuery("select * from student123");
            while(rs.next()){
                System.out.println(rs.getString("roll")+" , "+rs.getString("name"));
            }
            */
           
           return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }

    
    
}
