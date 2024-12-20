package Modelado;

import Vista.Conectar;
import Vista.I_inicio;
import Vista.I_prin_admin;
import Vista.I_prin_bar;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class M_usu {
    
    String p="",n="";
    Conectar conectar = new Conectar();
    Connection conectardb =conectar.conexion();
    I_prin_admin Iadministrador= new I_prin_admin(); 
    I_prin_bar Ibarbero= new I_prin_bar();
    
    public void Ingresar(String usuario, String password){
        
        try {
            PreparedStatement query = (PreparedStatement) conectardb.prepareStatement("SELECT * FROM usuario WHERE Nombre='"+usuario+"' AND Contras='"+password+"'");
            ResultSet result = query.executeQuery();
            if(result.next()){
                n=result.getString(1);
                p=result.getString(2);
            }
            if((n.equals(usuario))&&(p.equals(password))){
                if(usuario.equals("admin1")){
                    Iadministrador.setVisible(true);
                }else{
                    if(usuario.equals("barbero")){
                        Ibarbero.setVisible(true);
                    }
                }
                I_inicio Iinicio= new I_inicio();
                Iinicio.setVisible(false);
                Iinicio.hide();
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA");
        }
        
    }
    
}
