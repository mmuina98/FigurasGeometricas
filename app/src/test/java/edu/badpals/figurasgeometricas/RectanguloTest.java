package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanguloTest {

    @Test
    public void rectanguloAreaTest(){
        Rectangulo rectangulo = new Rectangulo(4,5);
        assertEquals(20 ,rectangulo.area());
    }

    @Test
    public void rectanguloAreaTest2(){
        Rectangulo rectangulo = new Rectangulo(2,5);
        assertEquals(10 ,rectangulo.area());
    }

    @Test
    public void rectanguloSobrecargaTest(){
        Rectangulo rectangulo = new Rectangulo("rectangulo",2,3);
        assertEquals("rectangulo" ,rectangulo.getNombre());
        assertEquals(6 ,rectangulo.area());
    }

}
