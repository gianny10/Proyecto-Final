package sql;

import java.sql.*;
import code.Producto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class C_Producto {

    // Metodo que permite registrar un producto en la base de datos
    public static boolean registrarProducto(Producto producto) {
        Connection c = Conexion.Conectar();
        String query = "insert into Producto values (?,?,?,?,?,?)";
        boolean estado = false;

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, producto.getCodigo());
            consulta.setString(2, producto.getNombre());
            consulta.setString(3, producto.getDescripcion());
            consulta.setInt(4, producto.getStock());
            consulta.setDouble(5, producto.getPrecio());
            consulta.setString(6, producto.getCategoria());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Error al registrar Producto " + producto.getNombre() + ", " + e.getMessage());
        }

        return estado;
    }

    // Consulta al SQL para saber si existe una categoria de productos
    public boolean existeProducto(String codigo) {
        boolean estado = false;
        String query = "select nombre from Producto where codigo = '" + codigo + "';";
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
            System.out.println("Error al consultar categoria.");
        }

        return estado;
    }
}
