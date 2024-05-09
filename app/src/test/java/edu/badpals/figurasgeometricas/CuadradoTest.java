package edu.badpals.figurasgeometricas;

import edu.badpals.figurasgeometricas.drawable.Drawable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuadradoTest {

    @Test
    public void cuadradoAreaTest(){
        Cuadrado cuadrado = new Cuadrado(5.0);
        assertEquals(25, cuadrado.area());
    }

    @Test
    public void cuadradoNombreTest(){
        Cuadrado cuadrado = new Cuadrado("cuadrao",7.0);
        assertEquals("cuadrao", cuadrado.getNombre());
        assertEquals(49, cuadrado.area());
    }
    @Test
    public void circuloDrawableTest(){
        FiguraGeometrica cuadrado = new Cuadrado("Cuadrado",10.0);

        assertEquals("Esto es un: Cuadrado", ((Drawable)cuadrado).draw());
    }
}
