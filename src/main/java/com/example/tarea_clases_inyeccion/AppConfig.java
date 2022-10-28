package com.example.tarea_clases_inyeccion;

import com.example.tarea_clases_inyeccion.models.domain.Empleado;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Empleado> registrarItemsFac(){

        Empleado e1 = new
                Empleado(
                "Marlon",
                "Velez",
                "Ecuador",
                "Cuenca",
                "marlonvelez@gmail.com",
                "0979574883");

        Empleado e2 = new
                Empleado(
                "William",
                "Tocto",
                "Ecuador",
                "Nabon",
                "williamtocto@gmail.com",
                "0974851266");

        return Arrays.asList(e1,e2);
    }

}
