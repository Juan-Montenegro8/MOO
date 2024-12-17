package Vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

public class Conectar {
    
    Connection conexion;
    
public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/metodologia","root","");
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conexion;
        
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
