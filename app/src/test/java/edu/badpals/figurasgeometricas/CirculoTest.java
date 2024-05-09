package edu.badpals.figurasgeometricas;

import edu.badpals.figurasgeometricas.drawable.Drawable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirculoTest {

    @Test
    public void circuloAreaTest(){
        FiguraGeometrica circulo = new Circulo(10.0);
        assertEquals(314, circulo.area());
    }

    @Test
    public void circuloNombreTest(){
        FiguraGeometrica circulo = new Circulo("circulo",20.0);
        assertEquals("circulo", circulo.getNombre());
        assertEquals(1256, circulo.area());
    }

    @Test
    public void circuloDrawableTest(){
        FiguraGeometrica circulo = new Circulo("Circulo",10.0);

        assertEquals("Esto es un: Circulo", ((Drawable)circulo).draw());
    }

}
