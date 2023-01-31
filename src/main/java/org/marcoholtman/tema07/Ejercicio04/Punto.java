package org.marcoholtman.tema07.Ejercicio04;

public class Punto {

    private double x;
    private double y;

    public Punto(double y, double x) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0,0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double distancia(Punto p) {
        return Math.sqrt(Math.pow(x - p.getX()),2) + Math.pow((y - getY()),2);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                ", distancia=" + distancia +
                '}';
    }
}
