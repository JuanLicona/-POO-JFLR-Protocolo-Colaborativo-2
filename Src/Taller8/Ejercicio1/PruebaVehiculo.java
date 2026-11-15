package Taller8.Ejercicio1;

public class PruebaVehiculo {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Yamaha", 180);
        Coche coche = new Coche("BMW", 220, 4);

        vehiculo.mostrarInformacion();
        coche.mostrarInformacion();
    }
}