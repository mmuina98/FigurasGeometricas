package edu.badpals.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica{


    private Double altura = 0.0;
    private Double anchura = 0.0;

    Rectangulo(Double altura, Double anchura){
        this.altura = altura;
        this.anchura = anchura;
    }

    Rectangulo(String nombre,Double altura, Double anchura){
        super(nombre);
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public double area() {
        return getAltura()*getAnchura();
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAnchura() {
        return anchura;
    }

    public void setAnchura(Double anchura) {
        this.anchura = anchura;
    }


}
