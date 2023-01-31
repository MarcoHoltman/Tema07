package org.marcoholtman.tema07.Ejercicio06;

public class Shop {
    private final Bycicle[] bycicles;

    private int cont;

    public Shop (int maxBycicles) {
        bycicles = new Bycicle[maxBycicles];
        cont = 0;
    }

    private void createRandomBycicles() {
        bycicles[cont++] = new Bycicle("00000", "Santa Cruz", "fire", 7.20f, 26.0f, false, "26/01/2016", 440.0f, 12);
        bycicles[cont++] = new Bycicle("00001", "Orbea", "lifestyle", 7.80f, 28, true, "15/06/2020", 860, 4);
        bycicles[cont++] = new Bycicle("00002", "Cannondale", "golden hour", 7.00f, 27, false, "01/01/2022", 1240, 6);
        bycicles[cont++] = new Bycicle("00003", "BMC", "flipper", 6.70f, 24, false, "29/11/2021", 1340, 14);
        bycicles[cont++] = new Bycicle("00004", "Specialized", "fisher", 7.00f, 26, false, "23/04/2012", 350, 3);
        bycicles[cont++] = new Bycicle("00005", "Trek", "mountain version", 7.30f, 27, true, "07/08/2018", 780, 8);
        bycicles[cont++] = new Bycicle("00006", "Scott", "banger", 7.00f, 26, false, "21/12/2021", 580, 17);
        bycicles[cont++] = new Bycicle("00007", "Cube", "flyweight", 6.60f, 25, false, "30/08/2018", 650, 2);
    }

    public boolean buy ()
}
