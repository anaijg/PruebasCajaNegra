package ejemplo2;

import java.time.LocalDate;

public class Ejemplo2 {
    public static void main(String[] args) {
            LocalDate fecha = LocalDate.of(1002, 2, 34);
    }

    // aquí tendríamos un método
    // que recibe la fecha de pago y el importe
    // y devuelve el importe a pagar
    public static double calcularImporte(LocalDate fecha, double pago) {
        int dia = fecha.getDayOfMonth();
        if (dia >=1 && dia <= 10) {
            return pago;
        } else if (dia >= 11 && dia <= 20) {
            return pago + pago * (2.0/100.0);
        } else {
            return pago + pago * (4.0/100.0);
        }
    }
}
