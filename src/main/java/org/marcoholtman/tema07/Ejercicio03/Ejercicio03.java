package org.marcoholtman.tema07.Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    private final static int MAX_ALUMNOS = 1000;

    private int nia;
    private final String nombre;
    private final String apellidos;
    private final String fechaNacimiento;
    private final String grupo;
    private final String telefono;

    public Ejercicio03(int nia, String nombre, String apellidos, String fechaNacimiento, String grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    public final int getNia() {
        return nia;
    }

    public final String getNombre() {
        return nombre;
    }

    public final String getApellidos() {
        return apellidos;
    }

    public final String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public final String getGrupo() {
        return grupo;
    }

    public final String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Ejercicio03{" +
                "nia=" + nia +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupo='" + grupo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    private final static int maxAlumnos = 1000;
    public Ejercicio03{
        CentroEducativo centroEducativo = new CentroEducativo();

        public static void main (String[] args){
            System.out.println("*********************");
            System.out.println("** GESTIÓN ALUMNOS **");
            System.out.println("*********************\n");
            System.out.println("1.Nuevo alumno");
            System.out.println("2.Baja de alumno");
            System.out.println("3.Consultas");
            System.out.println("------------------------------");
            System.out.println("0.Salir");

            Scanner scanner = new Scanner(System.in);
            do {
                while
            }

        }
    }
}
