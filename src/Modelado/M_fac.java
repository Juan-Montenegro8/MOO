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
    
    Conectar conectardb = new Conectar();
    Connection Conexiondb =conectardb.conexion();
    
    public void imprimir(JTextArea Area,String nombre, String fecha, String valor){
        Area.setText("\n"+nombre+"\n "+fecha+"\n "+valor);
        JFileChooser filleChooser = new JFileChooser();
        filleChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if(JFileChooser.APPROVE_OPTION==filleChooser.showSaveDialog(Area)){
            File archivo = filleChooser.getSelectedFile();
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
            PreparedStatement query = (PreparedStatement) Conexiondb
            .prepareStatement("INSERT INTO ventas(nombre, fecha, valor) VALUES (?, ?, ?)");
            query.setString(1, nombre);
            query.setString(2, fecha);
            query.setString(3, valor);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "OPERACION REALIZADA EXITOSAMENTE");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERORR VERIFIQUE LOS CAMPOS AGREGADOS");
        }
    }
    
}
