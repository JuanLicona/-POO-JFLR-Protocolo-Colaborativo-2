package Taller8.Ejercicio1;

public class Coche extends Vehiculo {

    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche- Marca: " + marca + "Velocidad Máxima: " + velocidadMaxima + " km/- Puertas: " + numeroDePuertas);
    }
}
