public class Persona1 {
    
    private String nombre;
    int edad;

    Persona1(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

}

class PruebaPersona {
    public static void main(String[] args) {
        Persona1 p1 = new Persona1("Carlos", 25);

        System.out.println("Edad (acceso directo): " + p1.edad);

        System.out.println("Nombre (usando get): " + p1.getNombre());
        p1.setNombre("Ana");
        System.out.println("Nombre modificado (usando set): " + p1.getNombre());

        p1.mostrarInfo();
    }
}
