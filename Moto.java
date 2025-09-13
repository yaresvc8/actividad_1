package vehiculos;

public class Moto extends vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca); 
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

