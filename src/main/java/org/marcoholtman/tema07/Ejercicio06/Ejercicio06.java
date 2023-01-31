package org.marcoholtman.tema07.Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
    private int byciclesCounter;
    private static int send;

    public Ejercicio06() {
        Bycicle by
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*************************");
            System.out.println("** GESTIÓN DE BICICLETAS **");
            System.out.println("*************************");
            System.out.println("1.-Añadir bicicleta");
            System.out.println("2.-Vender bicicleta");
            System.out.println("3.-Consultar bicicleta");
            System.out.println("4.-Mostrar stock");
            System.out.println("------------------------------------");
            System.out.println("0.-Salir");
            send =  scanner.nextInt();

            switch(send) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        } while (send !=0);

    }


}
