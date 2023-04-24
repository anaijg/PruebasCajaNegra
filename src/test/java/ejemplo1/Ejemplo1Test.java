package ejemplo1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo1Test {

    Ejemplo1 ejemplo1;

    @BeforeEach
    void setUp() {
        ejemplo1 = new Ejemplo1();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Probamos el método validarIdentificador")
    void validarIdentificadorTest() {
        // Al no ser estático el método validarIdentificador, lo tenemos que instanciar
        //     1,4,6,9, 11 (todas las válidas) Se considera que el identificador
        assertEquals(true, ejemplo1.validarIdentificador("Num-1---d3")); // assertTrue también habría valido
    }

    @Test
    @DisplayName("Longitud")
    void validarLongitudTest() {
        assertEquals(false, ejemplo1.validarIdentificador("Nd3"));
        assertEquals(false, ejemplo1.validarIdentificador("Num-1-letr3--d32"));
    }

    @Test
    @DisplayName("Sólo letras, dígitos o guiones")
    void validarJuegoTest() {
        assertEquals(false, ejemplo1.validarIdentificador("Nu%m-1---d3"));
    }

    @Test
    @DisplayName("No contiene guiones al principio ni al final")
    void probarGuionesTest() {
        assertEquals(false, ejemplo1.validarIdentificador("-um-1---d3"));
        assertEquals(false, ejemplo1.validarIdentificador("num-1---d3-"));
    }

    @Test
    @DisplayName("Tiene al menos una letra")
    void probarLetraTest() {
        assertEquals(false, ejemplo1.validarIdentificador("456-1---23"));
    }

    @Test
    @DisplayName("No es una palabra reservada")
    void probarPalabraReservada() {
        assertEquals(false, ejemplo1.validarIdentificador("abstract"));
    }

}