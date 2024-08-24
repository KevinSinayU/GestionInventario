/**
 *
 * @author ksinay
 */
// Archivo: Electronico.java
public class Electronico extends Producto {

    // Constructor
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Implementación del método para agregar cantidad al inventario
    @Override
    public void agregar_cantidad(int cantidad) {
        this.cantidad += cantidad;
        System.out.println("Se han agregado " + cantidad + " unidades de " + nombre + " al inventario.");
    }

    // Implementación del método para vender una cantidad del producto
    @Override
    public void vender(int cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de " + nombre + ".");
        } else {
            System.out.println("No hay suficiente cantidad de " + nombre + " en inventario para vender.");
        }
    }
}
