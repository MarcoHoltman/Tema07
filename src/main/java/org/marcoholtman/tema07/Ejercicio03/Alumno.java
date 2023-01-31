package org.marcoholtman.tema07.Ejercicio03;

public class Alumno {
    private int nia;
    private String nombre;
    private String apellidos;
    private int fechaNacimiento;
    private final char grupo;
    private final String telefono;

    public Alumno (Alumno alumno) {
        this(alumno.getNia(), alumno.getNombre(), alumno.getApellidos(), alumno.getFechaNacimiento(), alumno.grupo, alumno.telefono)
    }


    public Alumno(int nia, String nombre, String apellidos, int fechaNacimiento, char grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    public String getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getGrupo() {
        return grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    private int calcularEdad{

    }


}


