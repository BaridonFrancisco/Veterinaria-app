/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Cliente {

    private int idCliente;
    private String Nombre;
    private int dni;
    private String apellido;
    private String direccion;
    private int telefono;
    private String nombreAl;
    private int telefonoAl;
    private boolean activo;

    public Cliente(int idCliente, String Nombre, int dni, String apellido, String direccion, int telefono, String nombreAl, int telefonoAl, boolean activo) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreAl = nombreAl;
        this.telefonoAl = telefonoAl;
        this.activo = activo;
    }

    public Cliente() {
    }

    public Cliente(String Nombre, int dni, String apellido, String direccion, int telefono, String nombreAl, int telefonoAl, boolean activo) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreAl = nombreAl;
        this.telefonoAl = telefonoAl;
        this.activo = activo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreAl() {
        return nombreAl;
    }

    public void setNombreAl(String nombreAl) {
        this.nombreAl = nombreAl;
    }

    public int getTelefonoAl() {
        return telefonoAl;
    }

    public void setTelefonoAl(int telefonoAl) {
        this.telefonoAl = telefonoAl;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }

}
