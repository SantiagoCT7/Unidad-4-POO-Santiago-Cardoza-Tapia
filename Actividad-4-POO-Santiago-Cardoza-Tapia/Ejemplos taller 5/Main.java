package paqueteB;

import paqueteA.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Toyota"); // Error de compilación: Vehiculo no es visible
    }
}
