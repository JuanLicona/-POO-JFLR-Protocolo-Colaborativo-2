package Taller7.Ejercicio1;

public class EmpleadoPrueba {

    public static void main(String[] args) {
        Empleado ep = new Empleado("Juan Licona", 2500000);

        System.out.println("Nombre inicial: " + ep.nombre);
        ep.nombre = "Felipe Romero";

        System.out.println("Salario actual:" + ep.getSalario());
        ep.setSalario(-500000);
        ep.setSalario(3000000);

        System.out.println("Nombre actualizado: " + ep.nombre);
        System.out.println("Nuevo salario:" + ep.getSalario());
    }
}
