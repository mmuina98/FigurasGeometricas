package edu.badpals.figurasgeometricas.drawable;

public interface Drawable {

    public String draw();

    default public void applyTheme(){
        throw new UnsupportedOperationException("Opperacion applyTheme sin implementar");
    }

}
