/**
 *
 * @author ksinay
 */
// Archivo: Producto.java
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos abstractos
    public abstract void agregar_cantidad(int cantidad);
    public abstract void vender(int cantidad);

    // Método concreto para consultar inventario
    public void consultar_inventario() {
        System.out.println("Cantidad disponible de " + nombre + ": " + cantidad);
    }
}
