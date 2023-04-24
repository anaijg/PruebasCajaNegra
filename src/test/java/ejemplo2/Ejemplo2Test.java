package ejemplo2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo2Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Probamos un valor para cada intervalo")
    void calcularImporte() {
        // probar que el valor es un día
        // lo dejamos para más adelante
        double importe = 100;
        // como hay tres casos diferentes, hacemos un assert para cada caso
        // día entre 1 y 10 --> valores límite: probamos en el intervalo los valores que están en los límites
        assertEquals(100, Ejemplo2.calcularImporte(LocalDate.of(2023, 04, 1), 100));
        assertEquals(100, Ejemplo2.calcularImporte(LocalDate.of(2023, 04, 10), 100));
        // día entre 11 y 20
        assertEquals(102, Ejemplo2.calcularImporte(LocalDate.of(2023, 04, 11), 100));
        assertEquals(102, Ejemplo2.calcularImporte(LocalDate.of(2023, 04, 20), 100));
        // día entre 21 y 31
        assertEquals(104, Ejemplo2.calcularImporte(LocalDate.of(2023, 04, 21), 100));
        assertEquals(104, Ejemplo2.calcularImporte(LocalDate.of(2023, 04, 30), 100));

        // sería interesante probar que la fecha es válida antes de llegar aquí
        // podríamos sacar cada uno de los tres grupos de asertos a tres métodos de prueba diferentes
    }
}