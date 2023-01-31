package org.marcoholtman.tema07.Ejercicio02;

import java.util.Arrays;

public class Ejercicio02 {

    public Ejercicio02{
        Asignaturas[] asignaturas = new Asignaturas[10];
        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignaturas(String.format("Asignatura %d", i+1):, codigo: i + 1, String.valueOf(i+1));
        }
        System.out.println(Arrays.toString(asignaturas));
    }
}
