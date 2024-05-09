package edu.badpals.figurasgeometricas;

public class Circulo extends FiguraGeometrica{

    private final Double PI = 3.14;

    private Double radio = 0.0;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, Double radio) {
        super(nombre);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI * getRadio()*getRadio();
    }
}
