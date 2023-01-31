package org.marcoholtman.tema07.Ejercicio06;

public class Bycicle{
    private String reference;
    private String brand;
    private String model;
    private float weight;
    private float wheelSize;
    private boolean motor;
    private String fabricationDate;
    private float price;
    private int stock;

    public Bycicle(String reference, String brand, String model, float weight, float wheelSize, boolean motor, String fabricationDate, float price, int stock) {
        this.reference = reference;
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.wheelSize = wheelSize;
        this.motor = motor;
        this.fabricationDate = fabricationDate;
        this.price = price;
        this.stock = stock;
    }


    public String getReference() {
        return reference;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public boolean isMotor() {
        return motor;
    }

    public String getFabricationDate() {
        return fabricationDate;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }


    @Override
    public String toString() {
        return "Bycicle{" +
                "reference='" + reference + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", wheelSize=" + wheelSize +
                ", motor=" + motor +
                ", fabricationDate='" + fabricationDate + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
