package org.marcoholtman.tema07.Ejercicio02;

import org.marcoholtman.tema07.Ejercicio01.Coche;

public class Asignaturas {
    private final String asignatura;
    private final int codigo;
    private final String curso;

    public Asignaturas(String asignatura, int codigo, String curso) {
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "asignatura='" + asignatura + '\'' +
                ", codigo=" + codigo +
                ", curso='" + curso + '\'' +
                '}';
    }
}