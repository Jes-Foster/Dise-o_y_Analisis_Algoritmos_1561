
package com.mycompany.jes.t6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Arbol bst = new Arbol();
        Random random = new Random();

// INFO ALEATORIA


        for (int i = 0; i < 100; i++) {
            int numeroCuenta = i + 1;
            String nombre = generarNombreAleatorio();
            String apellido1 = generarApellidoAleatorio();
            String apellido2 = generarApellidoAleatorio();
            int edad = random.nextInt(25 - 18 + 1) + 18;
            String correo = nombre + "@example.com";
            int semestre = random.nextInt(10 - 1 + 1) + 1;
            List<String> materias = generarMateriasAleatorias();
            double promedio = 5.0 + (10.0 - 5.0) * random.nextDouble();

            Alumno alumno = new Alumno(numeroCuenta, nombre, apellido1, apellido2, edad, correo, semestre, materias, promedio);
            bst.insert(numeroCuenta, alumno);
            bst.recorrerABB();
        }

        //************************ 
        //      INSERTAR

        int nuevoNumeroCuenta = 101;
        String nuevoNombre = "Juan";
        String nuevoApellido1 = "Pérez";
        String nuevoApellido2 = "García";
        int nuevaEdad = 20;
        String nuevoCorreo = nuevoNombre + "." + nuevoApellido1 + "@example.com";
        int nuevoSemestre = 5;
        List<String> nuevasMaterias = Arrays.asList("Diseño y Analisis de Algoritmos", "Programación Web", "Diseño Logico", "Lenguajes Formales", "Administración de Proyectos");
        double nuevoPromedio = 8.5;

        Alumno nuevoAlumno = new Alumno(nuevoNumeroCuenta, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevoCorreo, nuevoSemestre, nuevasMaterias, nuevoPromedio);
        bst.insert(nuevoNumeroCuenta, nuevoAlumno);

        //************************
        //      CONSULTA
        
        int numeroCuentaConsulta = 101;
        Alumno alumnoConsulta = bst.search(numeroCuentaConsulta);

        if (alumnoConsulta != null) {
            System.out.println("\n");
            System.out.println(" ******** CONSULTA *************");
            System.out.println("Numero de cuenta: " + alumnoConsulta.getNumeroCuenta());
            System.out.println("Nombre completo: " + alumnoConsulta.getNombreCompleto());
            System.out.println("Materias: " + String.join(", ", alumnoConsulta.getMaterias()));
            System.out.println("Promedio general: " + String.format("%.1f", alumnoConsulta.getPromedio()));
        } else {
            System.out.println("Alumno no encontrado");
        }
    }

    //**************************
    // NOMBRE ALEATORIO
                            
    private static String generarNombreAleatorio() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Carlos", "Luisa", "Jorge", "Sofía", "Miguel", "Isabel"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }
    
    
    private static String generarApellidoAleatorio() {
        String[] apellidos = {"García", "Martínez", "Rodríguez", "González", "Hernández", "Díaz", "López", "Pérez", "Sánchez", "Gómez"};
        Random random = new Random();
        return apellidos[random.nextInt(apellidos.length)];
    }

    //*************************
    // MATERIA ALEATORIA
    
    private static List<String> generarMateriasAleatorias() {
        String[] materias = {"Diseño y Analisis de Algoritmos", "Programación Web", "Diseño Logico", "Lenguajes Formales", "Administración de Proyectos"};
        Random random = new Random();
        List<String> materiasAleatorias = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            materiasAleatorias.add(materias[random.nextInt(materias.length)]);
        }

        return materiasAleatorias;
        
        
    }
}



