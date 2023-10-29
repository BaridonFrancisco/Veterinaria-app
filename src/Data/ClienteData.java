/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection con = null;

    public ClienteData() {

        con = Conexion.getConexion();
    }

    public void setterconexion() {
        con = null;
    }

    
    //Guarda un cliente a la base de datos
    public void guardarCliente(Cliente cliente) {

        String sql = "INSERT INTO `cliente`(`dni`, `nombre`, `apellido`, `telefono`, `direccion`, `nombreAlternativo`, `contactoAlternativo`, `activo`)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getNombreAl());
            ps.setInt(7, cliente.getTelefonoAl());
            ps.setBoolean(8, cliente.isActivo());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys();) {
                if (rs.next()) {

                    cliente.setIdCliente(rs.getInt(1));

                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql guardar");
            ex.printStackTrace();
        }

    }
// retorna un cliente segun el Dni 
    public Cliente buscarDni(int dni) {

        Cliente cliente = null;

        String sql = "SELECT * FROM `cliente` WHERE dni=? and activo=1";

        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(dni);
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setNombreAl(rs.getString("nombreAlternativo"));
                cliente.setTelefonoAl(rs.getInt("contactoAlternativo"));
                cliente.setActivo(rs.getBoolean("activo"));
                //JOptionPane.showMessageDialog(null, "cliente Guardado :V");

            }
//            else{
//            JOptionPane.showMessageDialog(null, "no se encontro cliente :V", "Error", JOptionPane.ERROR_MESSAGE);
//            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql acceder :,( " + ex.getMessage());
            ex.printStackTrace();
        }

        return cliente;
    }

    //buscar un cliente por id
    public Cliente bucarId(int id) {

        Cliente cliente = null;

        String sql = "SELECT `dni`, `nombre`, `apellido`, `telefono`, `direccion`, `nombreAlternativo`,"
                + " `contactoAlternativo`, `activo` FROM `cliente` WHERE idCliente = ? ";

        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(id);
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setNombreAl(rs.getString("nombreAlternativo"));
                cliente.setTelefonoAl(rs.getInt("contactoAlternativo"));
                cliente.setActivo(rs.getBoolean("activo"));
                //JOptionPane.showMessageDialog(null, "cliente encontrado :V");

            } else {
                JOptionPane.showMessageDialog(null, "no se encontro cliente :V", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql acceder :,( " + ex.getMessage());
            ex.printStackTrace();
        }

        return cliente;
    }

    public void modificar(Cliente cliente) {
        String sql = "UPDATE `cliente` SET `dni`=?,`nombre`=?,`apellido`=?,`telefono`=?,`direccion`=?,"
                + "`nombreAlternativo`=?,`contactoAlternativo`=?,`activo`=? WHERE idCliente = ?;";

        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getNombreAl());
            ps.setInt(7, cliente.getTelefonoAl());
            ps.setBoolean(8, cliente.isActivo());
            ps.setInt(9, cliente.getIdCliente());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "cliente modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql modificar :,(" + ex.getMessage());
            ex.printStackTrace();
        }
    }
    // establece el estado en 0 de un cliente borrado logico
    public void eliminarCliente(int id) {

        String sql = "UPDATE `cliente` SET `activo`= 0 WHERE idCliente = ?;";

        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "cliente eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al sql eliminar :,(" + ex.getMessage());
            ex.printStackTrace();
        }

    }
    // obtiene una lista de clientes totales
    public List<Cliente> listar() {
        List<Cliente> listacliente = new ArrayList<>();
        String sql = "SELECT * FROM `cliente` WHERE activo=1;";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setIdCliente(rs.getInt("idCliente"));
                client.setDni(rs.getInt("dni"));
                client.setNombre(rs.getString("nombre"));
                client.setApellido(rs.getString("apellido"));
                client.setTelefono(rs.getInt("telefono"));
                client.setDireccion(rs.getString("direccion"));
                client.setNombreAl(rs.getString("nombreAlternativo"));
                client.setTelefonoAl(rs.getInt("contactoAlternativo"));
                client.setActivo(rs.getBoolean("activo"));
                listacliente.add(client);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al sql listar :,(" + ex.getMessage());
            ex.printStackTrace();
        }
        return listacliente;
    }

}
