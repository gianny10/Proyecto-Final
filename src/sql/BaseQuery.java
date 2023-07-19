package sql;
import code.*;
import java.sql.*;

/**
 *
 * @author Gianny
 */
public class BaseQuery  implements IQueryDatos{

    @Override
    public String queryDatos(String datoBuscado, String tabla, String codigo) {
        String query = "select " + datoBuscado + " from " + tabla + " where codigo = " + codigo;
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
            System.out.println("Error al consultar tabla " + tabla);
        }

        return resultado.trim();
    }
}
