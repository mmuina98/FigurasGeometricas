package edu.badpals.figurasgeometricas;

import edu.badpals.figurasgeometricas.drawable.Drawable;

public class Cuadrado extends FiguraGeometrica implements Drawable {


    private Double lado = 0.0;

    Cuadrado(Double lado){
        this.lado = lado;
    }

    Cuadrado(String nombre,Double lado){
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double area() {
        return getLado() * getLado();
    }


    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }


    @Override
    public String draw() {
        return "Esto es un: "+ getNombre();
    }

    @Override
    public void applyTheme() {
        Drawable.super.applyTheme();
    }
}
