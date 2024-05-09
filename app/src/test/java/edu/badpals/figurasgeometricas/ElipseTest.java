package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElipseTest {

    @Test
    public void areaElipseTest(){
        FiguraGeometrica elipse = new Elipse(5.0, 3.0);
        assertEquals(15*3.14, elipse.area());
    }

    @Test
    public void sobrecargaElipseTest(){
        FiguraGeometrica elipse = new Elipse("elipse", 5.0, 3.0);
        assertEquals(15*3.14, elipse.area());
    }

}
