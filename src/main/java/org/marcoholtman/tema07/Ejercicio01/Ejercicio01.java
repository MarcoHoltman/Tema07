package org.marcoholtman.tema07.Ejercicio01;

import com.github.javafaker.Faker;

public class Ejercicio01 {
    public Ejercicio01() {
        Faker faker = new Faker();
    }
        Coche[] coches = new Coche[10];
        for (int i = 0; i < coches.length / 2; i++) {
            coches[i] = new Coche();
        }

        for (int i = coches.length / 2; i < coches.length; i++) {
            String modelo = faker.company().name();
            String color = faker.color().hex();
            boolean metalizado = faker.bool().bool();
            String matricula = String.format("%04d", faker.numberBetween(0, 9999))
            Coche.TipoCoche tipoCoche = Coche.TipoCoche.values()[faker.number().numberBetween(0, Coche.TipoCoche.values().length-1)];
            int anyoFabricacion = faker.number().numberBetween(2010, 2023);
            Coche.ModalidadSeguro modalidadSeguro = Coche.ModalidadSeguro.values()(faker.number().numberBetween(0, Coche.ModalidadSeguro.values().length))
            coches[i] = new Coche(modelo, color, metalizado, matricula, tipoCoche, anyoFabricacion, modalidadSeguro);
    }
        System.out.println(Arrays.toString(coches));
}
