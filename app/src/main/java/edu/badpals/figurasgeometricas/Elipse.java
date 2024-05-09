package edu.badpals.figurasgeometricas;

public class Elipse extends FiguraGeometrica {

    private final double PI = 3.14;
    private double semiejeMayor = 0.0;
    private double semiejeMenor = 0.0;

    public Elipse(double semiejeMayor, double semiejeMenor) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }
    public Elipse(String nombre, double semiejeMayor, double semiejeMenor) {
        super(nombre);
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    @Override
    public double area() {
        return PI * getSemiejeMayor() * getSemiejeMenor();
    }

    public double getSemiejeMayor() {
        return semiejeMayor;
    }

    public void setSemiejeMayor(double semiejeMayor) {
        this.semiejeMayor = semiejeMayor;
    }

    public double getSemiejeMenor() {
        return semiejeMenor;
    }

    public void setSemiejeMenor(double semiejeMenor) {
        this.semiejeMenor = semiejeMenor;
    }

}
