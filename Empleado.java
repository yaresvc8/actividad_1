package empresas;

public class Empleado {
    
    protected String nombre;
    protected String salario;

    public Empleado(String nombre, String salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

}

