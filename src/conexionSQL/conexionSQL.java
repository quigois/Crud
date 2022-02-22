/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ISMAEL
 */
public class conexionSQL {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela","root","root");
            JOptionPane.showMessageDialog(null,"Conexion exitosa perfecto.");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error de conexion."+ e.getMessage());
        }
        return conectar;
    }
    
    
    
}
