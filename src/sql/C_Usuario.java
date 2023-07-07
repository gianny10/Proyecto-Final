package sql;
import code.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
public class C_Usuario {
    /* public boolean loginUser(Usuario user) {
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
    }*/
    
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

    public boolean RegistroUsuario(Usuario usuario) {
        Connection c = Conexion.Conectar();
        String query = "insert into Usuario values (?,?,?,?,?,?,?,?)";
        boolean estado = false;

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, usuario.getCodigo());
            consulta.setString(2, usuario.getNombre());
            consulta.setString(3, usuario.getApellido());
            consulta.setString(4, usuario.getUsuario());
            consulta.setString(5, usuario.getContraseña());
            consulta.setString(6, usuario.getTelefono());
            consulta.setInt(7, Integer.parseInt(usuario.getEdad()));
            consulta.setString(8, usuario.getSexo());

            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Usuario " + usuario.getNombre() + ", " + e.getMessage());
        }

        return estado;

    }

    // Consulta al SQL para saber si existe una categoria de productos
    public boolean existeUsuario(String usuario) {
        boolean estado = false;
        String query = "select codigo from usuario where Usuario = '" + usuario + "';";
        Statement statement;
        Connection c;
        try {
            c = Conexion.Conectar();
            statement = c.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar categoria.");
        }

        return estado;
    }

    // Consulta al SQL para actualizar stock
    public boolean actualizarUsuario(Usuario usuario, String codigo) {
        boolean estado = false;
        System.out.println(codigo);
        String query = "update Usuario set codigo = ?, usuario = ?, contraseña = ?, telefono = ? where codigo = '" + codigo + "'";
        System.out.println(query);
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, usuario.getCodigo());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getContraseña());
            ps.setString(4, usuario.getTelefono());

            if (ps.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario.");
        }

        return estado;
    }
}
