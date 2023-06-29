package sql;

import code.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gianny
 */
public class C_Cliente {
    public boolean agregarCliente(Cliente cliente){
        Connection c = Conexion.Conectar();
        String query = "insert into TB_Cliente values (?,?,?,?,?,?,?,?)";
        boolean estado = false;
        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, cliente.getCodigo());
            consulta.setString(2, cliente.getNombre());
            consulta.setString(3, cliente.getApellidos());
            consulta.setString(4, cliente.getDni());
            consulta.setString(5, cliente.getTelefono());
            consulta.setString(6, cliente.getDireccion());
            consulta.setString(7, cliente.getSexo());
            consulta.setString(8, cliente.getEdad());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Cliente");
        }
        
        return estado;
    }
    
    // Consulta al SQL para saber si existe una categoria de productos
    public  boolean existeCliente(String codigo){
        boolean estado = false;
        String query = "select codigo from TB_Cliente where codigo = '" + codigo + "';";
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
        } catch (Exception e) {
            System.out.println("Error al consultar cliente.");
        }
        
        return estado;
    }
}
