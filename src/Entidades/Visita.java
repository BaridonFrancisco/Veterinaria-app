/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

public class Visita {

    private int idVisita;
    private Mascota mascota;
    private String detalle;
    private double peso;
    private Tratamiento tratamiento;
    private LocalDate visita;
    private boolean finalizado;
    private boolean activo;

    public Visita(int idVisita, Mascota mascota, String detalle, double peso, Tratamiento tratamiento, LocalDate visita, boolean finalizado, boolean activo) {
        this.idVisita = idVisita;
        this.mascota = mascota;
        this.detalle = detalle;
        this.peso = peso;
        this.tratamiento = tratamiento;
        this.visita = visita;
        this.activo = activo;
        this.finalizado = finalizado;
    }

    public Visita(Mascota mascota, String detalle, double peso, Tratamiento tratamiento, LocalDate visita, boolean finalizado, boolean activo) {
        this.mascota = mascota;
        this.detalle = detalle;
        this.peso = peso;
        this.tratamiento = tratamiento;
        this.visita = visita;
        this.activo = activo;
        this.finalizado = finalizado;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Visita() {
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public LocalDate getVisita() {
        return visita;
    }

    public void setVisita(LocalDate visita) {
        this.visita = visita;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", mascota=" + mascota + ", detalle=" + detalle + ", peso=" + peso + ", tratamiento=" + tratamiento + ", visita=" + visita + ", activo=" + activo + '}';
    }

}
