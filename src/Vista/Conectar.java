package Vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

public class Conectar {
    
    Connection cn;
    
public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/metodologia","root","");
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cn;
        
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
