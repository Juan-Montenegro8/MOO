package Modelado;

import Vista.Conectar;
import Vista.I_prod;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class M_pord {
    
    Conectar conectar = new Conectar();
    Connection conectardb =conectar.conexion();
    
    
    
    public void agregar(String nombre, String cantidad){
        try{
            PreparedStatement query = (PreparedStatement) conectardb.prepareStatement("INSERT INTO productos(nombre, cantidad) VALUES (?, ?)");
            query.setString(1, nombre);
            query.setString(2, cantidad);
            
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "OPERACION REALIZADA EXITOSAMENTE");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERORR VERIFIQUE LOS CAMPOS AGREGADOS");
        }
    }
    
    public void buscar(JTextField txtnommbre){
        I_prod win_p= new I_prod();
        int id ;
        try{
            PreparedStatement query = (PreparedStatement) conectardb.prepareStatement("SELECT * FROM productos WHERE Nombre='"+txtnommbre.getText()+"'");
            ResultSet rs = query.executeQuery();
            
            if (rs.next()) {
                win_p.txtnom.setText(rs.getString(2));
                win_p.txtcan.setText(rs.getString(3));
                id=rs.getInt(1);
                win_p.lblid.setText(""+id);
                win_p.setVisible(true);
            }       
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "LA IDENTIFICACION INGRESADA NO ESTA REGISTRADA EN LA BASE DE DATOS"+e.toString());
        }
        
    }
    
    public void editar(String nom, String can, String lb){
        try{
            PreparedStatement query = (PreparedStatement) conectardb.prepareStatement("UPDATE productos SET Nombre=?, Cantidad=? WHERE id_productos=?");
            query.setString(1, nom);
            query.setString(2, can);
            query.setString(3, lb);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "OPERACION REALIZADA EXITOSAMENTE");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERORR VERIFIQUE LOS CAMPOS AGREGADOS");
        }
    }
    
    public void elminar(String lbl){
        try{
            PreparedStatement query = (PreparedStatement) conectardb.prepareStatement("DELETE FROM productos WHERE id_productos=?");
            query.setString(1, lbl);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "OPERACION REALIZADA EXITOSAMENTE");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERORR VERIFIQUE LOS CAMPOS AGREGADOS");
        }
    }
}
