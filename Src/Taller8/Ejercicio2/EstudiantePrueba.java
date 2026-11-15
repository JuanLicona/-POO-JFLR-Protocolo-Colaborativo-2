package Taller8.Ejercicio2;

public class EstudiantePrueba {

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Juan Licona", 17, "2026-ADSO-01");
        Estudiante est2 = new Estudiante("Felipe Romero", 19, "2026-ADSO-02");

        est1.mostrarDetalles();
        est2.mostrarDetalles();
    }
}