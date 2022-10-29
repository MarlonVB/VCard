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
                "marlonvelez@gmail.com",
                "0979574883",
                "Gerente General",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png");

        Empleado e2 = new
                Empleado(
                "William",
                "Tocto",
                "williamtocto@gmail.com",
                "0974851266",
                "Ejecutivo Administrador",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png");

        return Arrays.asList(e1,e2);
    }

}
