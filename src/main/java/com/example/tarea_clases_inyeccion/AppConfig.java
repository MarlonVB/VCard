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
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png",
                "Lunes - Viernes (8:00AM - 6:00PM)");

        Empleado e2 = new
                Empleado(
                "William",
                "Tocto",
                "williamtocto@gmail.com",
                "0974851266",
                "Gerente Financiero",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png",
                "Martes - Jueves (9:00AM - 20:00PM)");

        Empleado e3 = new
                Empleado(
                "Danny",
                "Tenemea",
                "dannytenemea@gmail.com",
                "0991471268",
                "Gerente Comercial",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png",
                "Lunes - Jueves (9:00AM - 20:00PM)");

        Empleado e4 = new
                Empleado(
                "Paola",
                "Criollo",
                "paolacriollo@gmail.com",
                "0982574221",
                "Gerente de Marketing",
                "https://i.postimg.cc/MH1gMvff/avatar-f.png",
                "Miercoles - Viernes (9:00AM - 20:00PM)");

        Empleado e5 = new
                Empleado(
                "Jose",
                "Murillo",
                "josemurillo@gmail.com",
                "0993215268",
                "Gerente de Operaciones",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png",
                "Lunes - Viernes (9:00AM - 20:00PM)");

        return Arrays.asList(e1,e2, e3, e4, e5);
    }

}
