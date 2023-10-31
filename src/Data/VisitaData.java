/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VisitaData {

    private Connection con = null;

    MascotaData datamascota = new MascotaData();
    TratamientoData datatrata = new TratamientoData();

    public VisitaData() {
        //datacliente = new ClienteData();
        //datamascota = new MascotaData();
        //datatrata = new TratamientoData();
        // datv=new VisitaData();
        con = Conexion.getConexion();
    }

    public void guardar(Visita visita) {
        String sql = "INSERT INTO `visita`(`idMascota`, `detalle`, `peso`, `idTratamiento`, `fechaVisita`, `activo`,finalizado) VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setString(2, visita.getDetalle());
            ps.setDouble(3, visita.getPeso());
            ps.setInt(4, visita.getTratamiento().getIdTratamiento());
            ps.setDate(5, Date.valueOf(visita.getVisita()));
            ps.setBoolean(6, visita.isActivo());
            ps.setBoolean(7, visita.isFinalizado());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys();) {
                if (rs.next()) {

                    visita.setIdVisita(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "visita Guardada :)");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql guardar visita");
            ex.printStackTrace();
        }

    }

    public void modificar(Visita visita) {

        String sql = "UPDATE `visita` SET `idMascota`=?,`detalle`=?,`peso`=?,`idTratamiento`=?,`fechaVisita`=?,`activo`=?,finalizado=? WHERE idVisita = ?";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setString(2, visita.getDetalle());
            ps.setDouble(3, visita.getPeso());
            ps.setInt(4, visita.getTratamiento().getIdTratamiento());
            ps.setDate(5, Date.valueOf(visita.getVisita()));
            ps.setBoolean(6, visita.isActivo());
            ps.setBoolean(8, visita.isFinalizado());
            ps.setInt(7, visita.getIdVisita());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "visita modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql modificar visita");
            ex.printStackTrace();
        }

    }

    public void eliminar(int id) {
        String sql = "UPDATE `visita` SET `activo`=0 WHERE idVisita =?";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "visita eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql eliminar visita");
            ex.printStackTrace();
        }

    }

    public ArrayList<Visita> buscarVIDMa(int id) {
        ArrayList<Visita> listavisita = new ArrayList<>();
        String sql = "SELECT * FROM `visita` WHERE idMascota=? AND activo=1  ORDER BY fechaVisita DESC;";
        Visita visita = null;
        Tratamiento tra = null;

        Mascota mas = datamascota.buscarMascotaid(id);
        if (mas == null) {
            System.out.println("nulo :x" + mas);
        }
        try (PreparedStatement ps = con.prepareStatement(sql);) {
            if (mas != null) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    visita = new Visita();

                    int ip = rs.getInt("idTratamiento");
                    tra = datatrata.buscar(ip);
                    visita.setActivo(rs.getBoolean("activo"));
                    visita.setDetalle(rs.getString("detalle"));
                    visita.setIdVisita(rs.getInt("idVisita"));
                    visita.setMascota(mas);
                    visita.setPeso(rs.getDouble("peso"));
                    visita.setTratamiento(tra);
                    visita.setVisita(rs.getDate("fechaVisita").toLocalDate());
                    visita.setFinalizado(rs.getBoolean("finalizado"));
                    listavisita.add(visita);

                }

            } else {
                JOptionPane.showMessageDialog(null, "visita nulo");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql buscar visita por id mascota");
            ex.printStackTrace();
        }

        return listavisita;
    }
////////////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<Visita> buscarT(int id, int idtratamiento) {
        ArrayList<Visita> listavisita = new ArrayList<>();
        String sql = "SELECT * FROM `visita` WHERE idTratamiento = ? AND idMascota = ? ORDER BY fechaVisita DESC;";
        Visita visita = null;
        Tratamiento tra = null;
        Mascota mas = datamascota.buscarMascotaid(id);
        if (mas == null) {
            System.out.println("nulo :x" + mas);
        }

        try (PreparedStatement ps = con.prepareStatement(sql);) {
            if (mas != null) {
                ps.setInt(1, id);
                ps.setInt(2, idtratamiento);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    visita = new Visita();
                    tra = datatrata.buscar(idtratamiento);
                    visita.setActivo(rs.getBoolean("activo"));
                    visita.setDetalle(rs.getString("detalle"));
                    visita.setIdVisita(rs.getInt("idVisita"));
                    visita.setMascota(mas);
                    visita.setPeso(rs.getDouble("peso"));
                    visita.setTratamiento(tra);
                    visita.setVisita(rs.getDate("fechaVisita").toLocalDate());
                    visita.setFinalizado(rs.getBoolean("finalizado"));
                    listavisita.add(visita);

                }

            } else {
                JOptionPane.showMessageDialog(null, "visita nulo");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql buscar visita por id mascota");
            ex.printStackTrace();
        }

        return listavisita;
    }

    //// peso promedio ultimas 10 visitas
    ///SELECT *, AVG (peso) FROM (SELECT * FROM visita WHERE idMascota=1 ORDER BY fechaVisita DESC LIMIT 10 ) AS promedio;
    public Double promedioVisitas(int id) {
        double pesoPromedio = 0.0;
        Mascota mascota = datamascota.buscarMascotaid(id);
        String sql = "SELECT AVG (peso) FROM (SELECT peso FROM visita WHERE idMascota=? AND activo=1 ORDER BY fechaVisita DESC LIMIT 10 ) AS promedio;";
        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pesoPromedio = rs.getDouble(1);
                System.out.println(pesoPromedio);

            }
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pesoPromedio;
    }

    public Visita buscarVisitaID(int id) {

        Visita visita = null;
        Mascota mascota = null;
        Tratamiento tratamiento = null;

        String sql = "SELECT * FROM `visita` WHERE idVisita=?;";
        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                visita = new Visita();
                mascota = new Mascota();
                tratamiento = new Tratamiento();
                mascota.setIdMascota(rs.getInt("idMascota"));
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));

                visita.setActivo(rs.getBoolean("activo"));
                visita.setDetalle(rs.getString("detalle"));
                visita.setFinalizado(rs.getBoolean("finalizado"));
                visita.setIdVisita(id);
                visita.setMascota(mascota);
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(tratamiento);
                visita.setVisita(rs.getDate("fechaVisita").toLocalDate());

            }

        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return visita;
    }

}
