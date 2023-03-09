import java.time.LocalDateTime;
import java.time.LocalTime;

public class Persona {
    public String Nombre;
    public String Apellido;
    public LocalDateTime FechaDeNacimiento;

    public Persona(String unNombre, String unApellido) {
        this.Nombre = unNombre;
        this.Apellido = unApellido;
    }
}
