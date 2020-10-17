import java.util.Date;

public class Persona {
    private String nombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private int DNI;
    private Date fechaNacimiento;

    public Persona(String nombre, String primerApellido, String segundoApellido,int DNI) {
        this.setNombre(nombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    @Override
    public String toString() {
        String nombreCompleto = getPrimerApellido();
        if (getSegundoApellido() != null) {
            nombreCompleto += " " + getSegundoApellido();
        }
        nombreCompleto += " " + getNombre();
        return nombreCompleto;
    }
}
