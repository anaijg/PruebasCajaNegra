package calculadora;
import java.util.Scanner;
public class Calculadora {
    private int num1;
    private int num2;
    public Calculadora() { }
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // getters y setters
    public int getNum1() { return num1; }
    public void setNum1(int num1) { this.num1 = num1; }
    public int getNum2() { return num2; }
    public void setNum2(int num2) { this.num2 = num2; }
    // métodos de instancia
    public int suma() { return this.num1 + this.num2; }
    public int resta() { return this.num1 - this.num2; }
    public int multiplicacion() { return this.num1 * this.num2; }
    public int division() { return this.num1 / this.num2; }
    public int modulo() { return this.num1 % this.num2; }
}
