package edu.badpals.figurasgeometricas;

public abstract class FiguraGeometrica {

    private String nombre = "";

    public FiguraGeometrica(){
        this.nombre = "desconocido";
    }

    public FiguraGeometrica(String nombre){
     this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double area();

}
