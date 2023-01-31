package org.marcoholtman.tema07.Ejercicio03;

import org.marcoholtman.tema07.Ejercicio03.Alumno;

public class CentroEducativo {
    private final Alumno[] alumnos;
    private int contadorAlumnos;

    public CentroEducativo(int maxAlumnos) {
        alumnos = new Alumno [maxAlumnos];
        contadorAlumnos = 0;
    }

    public boolean nuevoAlumno(int nia, String nombre, String apellido, String fechaNacimiento, String grupo, String telefono) {
        if(contadorAlumnos < alumnos.length) {
            alumnos[contadorAlumnos] = new Alumno(nia, nombre, apellido, fechaNacimiento, grupo, telefono);
            contadorAlumnos++;
            return true;
        }
        return false;
    }

    public boolean bajaAlumno(int nia) {
        int pos = buscarPosicionAlumnoPorNia(nia);
        if (pos >= 0) {
            alumnos[pos] = alumnos[contadorAlumnos - 1];
            contadorAlumnos--;
            alumnos[contadorAlumnos] = null;
            return true;
        }
        return false;
    }

    /**
     * Busca los alumnos del grupo indicado.
     * @param grupo Grupo a buscar.
     * @return Array con los alumnos del grupo o null si no existen los alumnos del grupo indicado.
     */
    public Alumno[] buscarAlummnosPorGrupo(String grupo) {
        int cont = 0;
        for (int i = 0; i < contadorAlumnos; i++) {
            if (alumnos[i].getGrupo().equalsIgnoreCase(grupo)) {
                cont++;
            }
        }
        if (cont > 0) {
            Alumno[] alumnosGrupo = new Alumno[cont];
            int j = 0;
            for (int i = 0; i < contadorAlumnos; i++) {
                if (alumnos[i].getGrupo().equalsIgnoreCase(grupo)) {
                    return alumnos[j] = alumnos[i];
                    j++;
                }
            }
            return alumnosGrupo;
        }
        return null;
    }

    public int buscarPosicionAlumnoPorNia(int nia) {
        for (int i = 0; i < contadorAlumnos; i++) {
            if(alumnos[i].getNia() == nia) {
                return i;
            }
        }
        return -1;
    }
}
