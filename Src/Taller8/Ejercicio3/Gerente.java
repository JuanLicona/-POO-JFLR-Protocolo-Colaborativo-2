package Taller8.Ejercicio3;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente- Nombre: " + nombre + "Salario: " + salario + " Departamento: " + departamento);
    }
}