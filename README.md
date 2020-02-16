## Testeando Calculadora con JUnit
Vamos a realizar una serie de pruebas con JUnit a una calculadora. Para ello dispondremos de 
la clase _Calculadora_, que es la clase sobre la que vamos a realizar las pruebas.

**Clase Calculadora:**
```java
public class Calculadora {

    public double suma(double n1, double n2) {
        return n1 + n2;
    }

    public double resta(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplica(double n1, double n2) {
        return n1 * n2;
    }

    public double divide(double n1, double n2) {
        return n1 / n2;
    }
}
```

Como podemos ver es una simple clase con métodos que devuelven el resultado de cada
operación.

Bien, ahora tenemos que crear la clase _CalculadoraTest_, que será la clase en la
que vamos a definir las pruebas. Esta clase contendrá un método por cada operación que
se encargará de realizar la prueba, siempre comenzando con la anotación `@Test`.

Veamos como ejemplo el testeo de la operación _suma()_:
```java
@Test
public void suma() {
    Calculadora c = new Calculadora();
    double n1 = 10.0;
    double n2 = 5.5;
    double resultEsperado = 15.5;
    double result = c.suma(n1, n2);

    assertEquals(resultEsperado, result, 1e-8);
}
```

Como vemos, lo primero que haremos será crear una instancia de la clase Calculadora
y definir los números que vamos a pasarle al método suma de la clase Calculadora. 

* La variable `resultEsperado` contendrá el **resultado esperado** que va a devolver el método.

* La variable `result` contendrá el **resultado real** que devuelve el método.

* Al método `assertEquals()` le pasaremos el resultado que esperamos, el resultaado real
y un margen de error, que es necesario porque estamos operando con números decimales 
(no es necesario en caso de enteros). Este método será el que valide si la prueba es
positiva o negativa, ya que devolverá **True** si el resultado real y el esperado coinciden
y **False** si no coinciden.

En este caso la prueba deberá ser positiva porque 10.0 + 5.5 es igual a 15.5, que es
el resultado que hemos definido como el esperado.

Ejecutamos la prueba:

![img](https://imgur.com/wdvN4BN.png)

Podemos observar que la prueba es positiva, en caso de que el resultado no sea el
esperado (p. ej: cambiamos el resultado esperado a 11.0 para forzar el error) 
nos mostrará que la prueba ha sido negativa de la siguiente manera:

![img](https://imgur.com/4MBywtq.png)

En el resultado de ejecución de la prueba podemos leer que nuestra expectativa era
que devolviese 11.0, pero el método a devuelto 15.5, por lop tanto el test da resultado
negativo.

Clase **CalculadoraTest**:
```java
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

        assertEquals(resultEsperado, result, 1e-8);
    }

}
```

**Resultados:**

![img](https://imgur.com/fXggWtx.png)