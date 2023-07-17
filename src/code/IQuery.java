package code;

import java.sql.Connection;
import sql.Conexion;

public interface IQuery {
    
    public Connection c = Conexion.Conectar();
    
    // Permite hacer una consulta a la BBDD
    public String query(String datoBuscado, String codigo);
}
