public class Producto1 {

    String nombre;
    double precio;
    int stock;
    
    Producto1 (String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarinfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $ " + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}

class PruebaProducto1 {
    public static void main(String[] args) {
        Producto1 p1 = new Producto1("Camisa", 29.99, 50);
        p1.mostrarinfo();

        System.out.println("Accediendo directamente:");
        System.out.println("Nombre: " + p1.nombre);
        System.out.println("Precio: " + p1.precio);
        System.out.println("Stock: " + p1.stock);

        System.out.println("usando mostrarinfo():");
        p1.mostrarinfo();
    }
}