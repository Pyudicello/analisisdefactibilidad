
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.coyote.http2.ConnectionException;


public class Conexion {
    
    Connection con;
    
    public static Connection conectar(){
        try{
            
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/catastro", "root", ""); 
            System.out.println("Exito");
           return con;
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return null;
    }
    
    
 public void cerrarConexion() throws ConnectionException {
	  	try {
		   con.close();
		}catch (SQLException  sqle) {
                        sqle.printStackTrace();
		}
	}
    
   
        
}
    

