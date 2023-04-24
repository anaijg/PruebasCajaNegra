package calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    @BeforeEach



    @Test
    void suma() {
        // para poder probar el método suma necesito tener una instancia
        Calculadora calculadora1 = new Calculadora();
        calculadora1.setNum1(23);
        calculadora1.setNum2(5);
        // si tenemos estos datos, esperamos que la suma sea: 28
        Assertions.assertEquals(28, calculadora1.suma());

        // metemos dos pruebas más
        Calculadora calculadora2 = new Calculadora();
        calculadora1.setNum1(23);
        calculadora1.setNum2(-5);
        // si tenemos estos datos, esperamos que la suma sea: 28
        Assertions.assertEquals(17, calculadora2.suma());

        Calculadora calculadora3 = new Calculadora();
        calculadora1.setNum1(5);
        calculadora1.setNum2(23);
        // si tenemos estos datos, esperamos que la suma sea: 28
        Assertions.assertEquals(28, calculadora3.suma());

    }

    @Test
    void resta() {
        // para poder probar el método suma necesito tener una instancia
        Calculadora calculadora1 = new Calculadora();
        calculadora1.setNum1(23);
        calculadora1.setNum2(5);
        // si tenemos estos datos, esperamos que la suma sea: 28
        Assertions.assertEquals(18, calculadora1.resta());

        // metemos dos pruebas más
        Calculadora calculadora2 = new Calculadora();
        calculadora2.setNum1(23);
        calculadora2.setNum2(-5);
        // si tenemos estos datos, esperamos que la suma sea: 28
        Assertions.assertEquals(28, calculadora2.resta());

        Calculadora calculadora3 = new Calculadora();
        calculadora3.setNum1(5);
        calculadora3.setNum2(23);
        // si tenemos estos datos, esperamos que la suma sea: 28
        Assertions.assertEquals(-18, calculadora3.resta());

    }

    @Test
    void multiplicacion() {
    }

    @Test
    void division() {
    }

    @Test
    void modulo() {
    }
}