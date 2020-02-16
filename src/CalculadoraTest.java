import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void suma() {
        Calculadora c = new Calculadora();
        double n1 = 10.0;
        double n2 = 5.5;
        double resultEsperado = 15.5;
        double result = c.suma(n1, n2);

        assertEquals(resultEsperado, result, 1e-8);
    }


    @Test
    public void resta() {
        Calculadora c = new Calculadora();
        double n1 = 10.0;
        double n2 = 5.5;
        double resultEsperado = 4.5;
        double result = c.resta(n1, n2);

        assertEquals(resultEsperado, result, 1e-8);
    }

    @Test
    public void multiplica() {
        Calculadora c = new Calculadora();
        double n1 = 10.0;
        double n2 = 5.5;
        double resultEsperado = 55.0;
        double result = c.multiplica(n1, n2);

        assertEquals(resultEsperado, result, 1e-8);
    }

    @Test
    public void divide() {
        Calculadora c = new Calculadora();
        double n1 = 10.0;
        double n2 = 5.0;
        double resultEsperado = 2.0;
        double result = c.divide(n1, n2);

        assertEquals(resultEsperado, result, 1e-20);
    }


}