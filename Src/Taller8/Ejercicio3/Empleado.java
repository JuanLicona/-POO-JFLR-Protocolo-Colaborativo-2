package Taller8.Ejercicio3;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Empleado- Nombre: " + nombre + "Salario: " + salario);
    }
}
