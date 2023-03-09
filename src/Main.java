import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Jabon en polvo", "1234", 40);
        Producto producto2 = new Producto("Esponjas", "1233", 10);
        Producto producto3 = new Producto("Chocolates", "1232", 100);
        Producto[] productos = new Producto[3];
        productos[0] = producto1;
        productos[1] = producto2;
        productos[2] = producto3;

        Persona persona1 = new Persona("Juan Pablo", "Frascino");

        Carrito carrito1 = new Carrito(persona1, productos);

        System.out.println(carrito1.calcularPrecioArr(carrito1.Productos));
    }
}