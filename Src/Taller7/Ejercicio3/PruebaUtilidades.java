package Taller7.Ejercicio3;

public class PruebaUtilidades {

    public static void main(String[] args) {
        Utilidades calc = new Utilidades();



        System.out.println("Suma (10 + 5): " + calc.sumar(10, 5));
        System.out.println("Resta (10 - 5): " + calc.restar(10, 5));
        System.out.println("Multiplicación (10 * 5): " + calc.multiplicar(10, 5));
        System.out.println("División (10 / 5): " + calc.dividir(10, 5));
        System.out.println("División entre cero (10 / 0): " + calc.dividir(10, 0));
    }
}
