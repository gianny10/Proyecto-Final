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

    public boolean agregarCliente(Cliente cliente) {
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
    public boolean existeCliente(String codigo) {
        String cliente = queryCliente("codigo", codigo);
        return cliente.isEmpty() == false;
    }

    public String obtenerNombreCliente(String codigo) {
        String nombre = queryCliente("nombre", codigo);
        String apellido = queryCliente("apellido", codigo);
        return nombre + " " + apellido;
    }
    
    public String obtenerCodigoCliente(String codigo){
        String cod = queryCliente("codigo", codigo);
        return cod;
    }

    // Query que permite buscar un valor de un cliente segun su codigo
    public String queryCliente(String datoBuscado, String codigo) {
        String query = "select " + datoBuscado + " from TB_Cliente where codigo = '" + codigo + "';";
        Statement statement;
        Connection c;
        ResultSet rs;
        String resultado = "";
        try {
            c = Conexion.Conectar();
            statement = c.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                resultado = rs.getString(1);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente.");
        }

        return resultado;
    }
}