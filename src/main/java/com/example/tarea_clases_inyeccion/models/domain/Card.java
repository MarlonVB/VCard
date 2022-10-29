package com.example.tarea_clases_inyeccion.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Card {

    @Value("${card.titulo}")
    private String titulo;
    @Value("${card.empresa}")
    private String empresa;
    @Value("${card.webEmpresa}")
    private String webEmpresa;

    @Value("${card.direccion}")
    private String direccion;
    @Autowired
    private List<Empleado> empleado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getWebEmpresa() {
        return webEmpresa;
    }

    public void setWebEmpresa(String correoEmpresa) {
        this.webEmpresa = correoEmpresa;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
