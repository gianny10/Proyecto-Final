package sql;
import code.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
public class C_Usuario {
    public boolean loginUser(Usuario user) {
        boolean estado = false;
        Connection c = Conexion.Conectar();
        String sqlQuery = "select CONCAT(nombre, apellido) as Nombres, usuario, contraseña from Usuario where usuario = '" + user.getUsuario() + "' and contraseña = '" + user.getContraseña() + "'";
        
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sqlQuery);
            while (rs.next()) {
               estado = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        return estado;
    }
}
