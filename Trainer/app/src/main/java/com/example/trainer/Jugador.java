package com.example.trainer;

public class Jugador {
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String posicion;

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    private Estadisticas estadisticas;

    Jugador(String nombre, String apellido, Integer telefono, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.posicion = posicion;
    }

    public Jugador(){}

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
