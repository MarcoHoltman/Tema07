package org.marcoholtman.tema07.Ejercicio01;

public class Coche {
    public enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }
    public enum ModalidadSeguro {
        TERCEROS, TODO_RIESGO
    }
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private TipoCoche tipoCoche;
    private int anyoFabricacion;
    private ModalidadSeguro modalidadSeguro;

    public Coche(String modelo, String color, boolean metalizada, String matricula, TipoCoche tipoCoche, int anyoFabricacion, Coche.ModalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anyoFabricacion = anyoFabricacion;
        this.modalidadSeguro = modalidadSeguro;
    }

    public Coche() {
        this("unknown","#FFFFFF", false, "0000_OOO", TipoCoche.UTILITARIO, 0, ModalidadSeguro.TERCEROS);
        this.modelo = "unknown";
        this.color = "blanco";
        this.metalizada = false;
        this.tipoCoche = TipoCoche.UTILITARIO;
        this.matricula = "000 OOO";
        this.anyoFabricacion = "0";
        this.modalidadSeguro = ModalidadSeguro.TERCEROS;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizada=" + metalizada +
                ", matricula='" + matricula + '\'' +
                ", tipoCoche=" + tipoCoche +
                ", anyoFabricacion=" + anyoFabricacion +
                ", modalidadSeguro=" + modalidadSeguro +
                '}';
    }
}
