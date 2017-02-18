package com.example.trainer;

/**
 * Created by Javierito on 18/02/2017.
 */

public class Usuario {
    private String nombre;
    private String apellidos;
    private Character rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Character getRol() {
        return rol;
    }

    public void setRol(Character rol) {
        this.rol = rol;
    }
}
