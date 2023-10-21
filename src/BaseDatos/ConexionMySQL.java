
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class ConexionMySQL {

    
private static Connection conn;   
 String driver = "com.mysql.jdbc.Driver"; // el nombre de nuestro driver Postgres.
 String user = "root"; // usuario postgres
 String password = ""; // no tiene password nuestra bd.
 String url ="jdbc:mysql://localhost:3306/recordatorio";
    
 //jdbc:mysql://localhost:3306/?user=root

 //root@localhost:3306
   
    public ConexionMySQL()
    {
      conn = null;
      
      try  {
      
      Class.forName(driver);
      conn = DriverManager.getConnection(url,user,password);
      
      if(conn !=null)
              System.out.println("Conexion establecida..");
      
      }catch(ClassNotFoundException | SQLException e){
      
          System.out.println("no se ha podido conectar " + e);
      
      } 
      
      
      
        
        
        
    } 
        
    
    public Connection getConnection(){
    
    return conn;
    
    }
    
    
public static void main(String args[]){
    ConexionMySQL a = new ConexionMySQL();
    a.getConnection();
    
      }
   


}
 
    

    
    





