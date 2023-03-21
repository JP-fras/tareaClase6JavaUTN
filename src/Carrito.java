import java.time.LocalDateTime;
import java.util.Arrays;

public class Carrito {
    public Persona Persona;
    public Producto[] Productos;

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    private Descuento descuento;

    public Carrito(Persona unaPersona, Producto[] unosProductos) {
        this.Persona = unaPersona;
        this.Productos = unosProductos;
    }


    public float calcularPrecioArr(Producto[] productos) {
        float precioFinal = 0;
        precioFinal = precioFinal + Productos[0].getPrecio() + Productos[1].getPrecio() + Productos[2].getPrecio();
        return precioFinal - descuento.obtenerDescuento(precioFinal);

    }
}
