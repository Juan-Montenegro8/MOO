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
    Conectar con = new Conectar();
    Connection cn =con.conexion();
    I_prin_admin pa= new I_prin_admin(); 
    I_prin_bar pb= new I_prin_bar();
    
    public void Ingresar(String user, String pass){
        
        try {
            PreparedStatement query = (PreparedStatement) cn.prepareStatement("SELECT * FROM usuario WHERE Nombre='"+user+"' AND Contras='"+pass+"'");
            ResultSet rs = query.executeQuery();
            if(rs.next()){
                n=rs.getString(1);
                p=rs.getString(2);
            }
            if((n.equals(user))&&(p.equals(pass))){
                if(user.equals("admin1")){
                    pa.setVisible(true);
                }else{
                    if(user.equals("barbero")){
                        pb.setVisible(true);
                    }
                }
                I_inicio o= new I_inicio();
                o.setVisible(false);
                o.hide();
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA");
        }
        
    }
    
}
