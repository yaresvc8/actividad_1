package vehiculos;

public class vehiculo {
    protected String tipo;
    protected String marca;

    public vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}
