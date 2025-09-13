package empresas;

public class pruebaEmpresas {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Perez", "3000");
        empleado1.mostrarInformacion();

        System.out.println();

        Gerente gerente1 = new Gerente("Ana Gomez", "5000", "Ventas");
        gerente1.mostrarInformacion();
    }


}
