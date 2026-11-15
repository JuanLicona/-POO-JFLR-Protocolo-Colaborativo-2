package Taller7.Ejercicio2;

public class PruebaBanco {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1045-8892-01", 500000, "Ahorros");

        //Errores:
        // System.out.println(cuenta.numeroCuenta);
        // cuenta.numeroCuenta = "1631-8109-00";

        cuenta.tipoCuenta = "Corriente";
        cuenta.setSaldo(750000);

        cuenta.mostrarDetalles();
    }
}
