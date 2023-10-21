
package BaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;
public class ConexionPostgresSQL {
    
String driver = "org.postgresql.Driver"; // el nombre de nuestro driver Postgres.
String user = "postgres"; // usuario postgres
String password = "andr"; // no tiene password nuestra bd.
String bd="recordatorio";

    
   
    public Connection Conectar()
    {
        String connectString = "jdbc:postgresql://localhost:5432/"+bd; // llamamos nuestra bd
        Connection link = null;
        try
        {           
            //Cargamos el Driver postgres
            Class.forName(driver);
            //Creamos un enlace hacia la base de datos
           link = DriverManager.getConnection(connectString, user, password);
         //  JOptionPane.showMessageDialog(null, "Conectado a Postgres");
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(null, "No se ha podido conectar a la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);  
        }
        return link;  
    } 
        
    
    
    
    
   


}
 
    

    
    





