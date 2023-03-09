public class Producto {
    public String Nombre;
    public String Codigo;
    public float Precio;

    public Producto(String unNombre, String unCodigo, float unPrecio) {
        this.Nombre = unNombre;
        this.Codigo = unCodigo;
        this.Precio = unPrecio;
    }

    public float getPrecio() {
        return Precio;
    }
}
