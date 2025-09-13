package vehiculos;

public class pruebaVehiculos {
    public static void main(String[] args) {
        vehiculo v = new vehiculo("Automóvil", "Toyota");
        Moto m = new Moto("Motocicleta", "Yamaha", 150);

        v.mostrarInfo();
        System.out.println();
        m.mostrarInfo();
    }
}