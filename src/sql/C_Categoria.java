/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import code.CategoriaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gianny
 */
public class C_Categoria {
    
    // Permite registrar una nueva categoria
    public boolean guardar(CategoriaProducto c){
        boolean respuesta = false;
        Connection cn = Conexion.Conectar();
        try
        {
            PreparedStatement consulta = cn.prepareStatement("insert into TB_CategoriaProducto values (?, ?, ?)");
            consulta.setString(1, c.getCodigo());
            consulta.setString(2, c.getNombre());
            consulta.setString(3, c.getDescripcion());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();
        }
        catch(SQLException e){
            System.out.println("Error al guardar categoria");
        }
        
        return respuesta;
    }
    
    // Consulta al SQL para saber si existe una categoria de productos
    public  boolean existeCategoria(String nombre){
        boolean estado = false;
        String query = "select nombre from TB_CategoriaProducto where nombre = '" + nombre + "';";
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
    
    public  boolean eliminarCategoria(String codigo){
        boolean estado = false;
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement consulta = c.prepareStatement("delete from TB_CategoriaProducto where codigo = '" + codigo + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
            
        } catch (Exception e) {
            System.out.println("Error al eliminar categoria, conexion.");
        }
        
        return estado;
    }
}
