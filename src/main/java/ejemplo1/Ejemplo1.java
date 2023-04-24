package ejemplo1;

public class Ejemplo1 {

    public boolean validarIdentificador(String identificador) {
//        No debe tener más de 15 ni menos de 5 caracteres.
        boolean longitudVálida = validarLongitud(identificador);
// El juego de caracteres utilizables es:
//        o Letras (Mayúsculas y minúsculas)
//        o Dígitos (0,9)
//        o Guión (-)
        boolean juegoDeCaracteresVálido = validarJuegoDeCaracteres(identificador);
//• Si el identificador lleva guión, éste no puede estar ni al principio ni al final, pero puede
//        haber varios consecutivos.
        boolean guionesCorrectos = validarGuiones(identificador);
//• Debe contener al menos un carácter alfabético.
        boolean contieneLetra = validarLetra(identificador);
//• No puede ser una de las palabras reservadas del lenguaje.
        boolean noEsPalabraReservada = validarPalabraReservada(identificador);
        return longitudVálida && juegoDeCaracteresVálido && guionesCorrectos && contieneLetra && noEsPalabraReservada;
    }

    private boolean validarPalabraReservada(String identificador) {
        String reservadas = "abstract	continue	for	new	switch  assert	default goto	package	synchronized    boolean do  if  private this    break   double  implements protected    throw   byte    else    import  public	throws  case	enum	instanceof	return	transient   catch	extends	int	short	try char	final	interface	static	void    class   finally	long	strictfp	volatile    const	float	native	super	while";
        String[] palabrasReservadas = reservadas.split("\t");
        for (String palabra: palabrasReservadas) {
            if (palabra.equals(identificador)) {
                return false;
            }
        }
        return true;
    }

    private boolean validarLetra(String identificador) {
        // con una letra que haya devuelvo true
        for (char carácter: identificador.toCharArray()) {
            if(Character.isLetter(carácter)) {
                return true;
            }
        }
        return false;
    }

    private boolean validarGuiones(String identificador) {
        return !(identificador.startsWith("-") || identificador.endsWith("-"));
    }

    private boolean validarJuegoDeCaracteres(String identificador) {
        for (char carácter: identificador.toCharArray()) {
//            if (Character.isLetter(carácter) || Character.isDigit(carácter) || carácter == '-') {
//                continue;
//            } else {
//                return false;
//            }
            // basta que uno solo no sea ni letra, ni número, ni guión para que salgamos con false
            if (!Character.isLetter(carácter) && !Character.isDigit(carácter) && carácter != '-') {
                return false;
            }
        }
        return true;
    }

    private boolean validarLongitud(String identificador) {
        return identificador.length() <= 15 && identificador.length() >= 5;
    }
}
