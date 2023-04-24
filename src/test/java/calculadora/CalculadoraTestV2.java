package calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTestV2 {

    @BeforeEach
    void setUp() {
        // aquí pongo todo lo que quiero que suceda antes de cada método
        System.out.println("Empieza BeforeEach");
        Calculadora calculadora1 = new Calculadora();
        calculadora1.setNum1(23);
        calculadora1.setNum2(5);

        Calculadora calculadora2 = new Calculadora();
        calculadora2.setNum1(23);
        calculadora2.setNum2(-5);
        System.out.println("Termina BeforeEach");
    }

    @AfterEach
    void tearDown() {
        // aquí metemos lo que queremos que se haga después de cada método

    }

    @Test
    void suma() {
        System.out.println("Prueba suma");
    }

    @Test
    void resta() {
        System.out.println("Prueba resta");

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