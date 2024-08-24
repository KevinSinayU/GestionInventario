/**
 *
 * @author ksinay
 */
// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Electronico
        Electronico laptop = new Electronico("Laptop", 1500.00, 10);

        // Consultar inventario inicial
        laptop.consultar_inventario();

        // Agregar más unidades al inventario
        laptop.agregar_cantidad(5);

        // Consultar inventario nuevamente
        laptop.consultar_inventario();

        // Intentar vender unidades del producto
        laptop.vender(7);

        // Consultar inventario después de la venta
        laptop.consultar_inventario();

        // Intentar vender más unidades de las que hay disponibles
        laptop.vender(10);
    }
}

