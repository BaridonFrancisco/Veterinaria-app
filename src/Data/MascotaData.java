/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Entidades.Cliente;
import Entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MascotaData {

    private Connection con = null;
    ClienteData datacliente = null;

    public MascotaData() {
        datacliente = new ClienteData();
        con = Conexion.getConexion();
    }

    public void setterconexion() {
        con = null;
    }

    public void guardarMascota(Mascota mascota) {
        String sql = " INSERT INTO `mascota`(`alias`, `sexo`, `especie`, `raza`, `colorPelo`, `pesoPromedio`,"
                + " `fechaNac`, `idCliente`, `activo`) VALUES (?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            ps.setDouble(6, mascota.getPesoPromedio());
            ps.setDate(7, Date.valueOf(mascota.getFechaN()));
            ps.setInt(8, mascota.getCliente().getIdCliente());
            ps.setBoolean(9, mascota.isActivo());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys();) {
                if (rs.next()) {

                    mascota.setIdMascota(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "mascota Guardada :)");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql mascota guardar");
            ex.printStackTrace();
        }

    }
// Quizas lo tenemos que mover

    public ArrayList<Mascota> buscarMascotaPIdCliente(int id) {
        List<Mascota> listaMascota = new ArrayList<>();

        String sql = "SELECT * FROM `mascota` WHERE idCliente = ? AND activo=1";
        Mascota mascota = null;
        Cliente cliente = datacliente.bucarId(id);
        try (PreparedStatement ps = con.prepareStatement(sql);) {
            if (cliente != null) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    mascota = new Mascota();
                    mascota.setCliente(cliente);
                    mascota.setAlias(rs.getString("alias"));
                    mascota.setColorPelo(rs.getString("colorPelo"));
                    mascota.setEspecie(rs.getString("especie"));
                    mascota.setFechaN(rs.getDate("fechaNac").toLocalDate());
                    mascota.setIdMascota(rs.getInt("idMascota"));
                    mascota.setPesoPromedio(rs.getDouble("pesoPromedio"));
                    mascota.setRaza(rs.getString("raza"));
                    mascota.setSexo(rs.getString("sexo"));
                    mascota.setActivo(rs.getBoolean("activo"));
                    listaMascota.add(mascota);

                }
            } else {
                JOptionPane.showMessageDialog(null, "cliente nulo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql buscarIdCliente mascota");
            ex.printStackTrace();
        }
        return (ArrayList<Mascota>) listaMascota;

    }

    public Mascota buscarMascotaid(int id) {

        String sql = "SELECT * FROM `mascota` WHERE idMascota = ?";
        Mascota mascota = null;
        Cliente cliente = null;

        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                mascota = new Mascota();
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                mascota.setCliente(cliente);
                mascota.setAlias(rs.getString("alias"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setFechaN(rs.getDate("fechaNac").toLocalDate());
                mascota.setIdMascota(id);
                mascota.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setActivo(rs.getBoolean("activo"));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql mascotaid ");
            ex.printStackTrace();
        }
        return mascota;

    }

    public void modificar(Mascota mascota) {

        String sql = "UPDATE `mascota` SET `alias`=?,`sexo`=?,`especie`=?,`raza`=?,`colorPelo`=?,"
                + "`pesoPromedio`=?,`fechaNac`=?,`idCliente`=?,`activo`=? WHERE idMascota = ?;";

        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            ps.setDouble(6, mascota.getPesoPromedio());
            ps.setDate(7, Date.valueOf(mascota.getFechaN()));
            ps.setInt(8, mascota.getCliente().getIdCliente());
            ps.setBoolean(9, mascota.isActivo());
            ps.setInt(10, mascota.getIdMascota());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "mascota modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql modificar mascota");
            ex.printStackTrace();
        }

    }

    public void eliminar(int id) {

        String sql = " UPDATE `mascota` SET `activo`= 0 WHERE idMascota = ?;";
        try (PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "mascota eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql eliminar mascota");
            ex.printStackTrace();
        }

    }

}
