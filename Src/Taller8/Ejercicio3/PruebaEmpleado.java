package Taller8.Ejercicio3;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Elvis Licona", 2400000);
        Gerente gerente = new Gerente("Elsa Romero", 5200000, "Desarrollo de Software");

        empleado.mostrarDetalles();
        gerente.mostrarDetalles();

    }
}
