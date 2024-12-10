package Modelado;

import Vista.Conectar;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileWriter;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class M_fac {
    
    Conectar con = new Conectar();
    Connection cn =con.conexion();
    
    public void imprimir(JTextArea Area,String nom, String fecha, String va){
        Area.setText("\n"+nom+"\n "+fecha+"\n "+va);
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if(JFileChooser.APPROVE_OPTION==fc.showSaveDialog(Area)){
            File archivo = fc.getSelectedFile();
            FileWriter fichero ;
            try {
                fichero = new FileWriter(archivo, true) ;
                fichero.write(Area.getText());
                fichero.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No");
            }
        }
        try{
            PreparedStatement query = (PreparedStatement) cn.prepareStatement("INSERT INTO ventas(nombre, fecha, valor) VALUES (?, ?, ?)");
            query.setString(1, nom);
            query.setString(2, fecha);
            query.setString(3, va);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "OPERACION REALIZADA EXITOSAMENTE");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERORR VERIFIQUE LOS CAMPOS AGREGADOS");
        }
    }
    
}
