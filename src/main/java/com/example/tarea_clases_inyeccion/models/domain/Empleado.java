package com.example.tarea_clases_inyeccion.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Empleado {

    //@Value("{empleado.nombre}")
    private String nombre;
    //@Value("{empleado.apellido}")
    private String apellido;
    //@Value("{empleado.paisOrigen}")
    private String paisOrigen;
    //@Value("{empleado.ciudadOrigen}")
    private String ciudadOrigen;
    //@Value("{empleado.correo}")
    private String correo;
    //@Value("{empleado.celular}")
    private String celular;

    public Empleado(String nombre, String apellido, String paisOrigen, String ciudadOrigen, String correo, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisOrigen = paisOrigen;
        this.ciudadOrigen = ciudadOrigen;
        this.correo = correo;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
