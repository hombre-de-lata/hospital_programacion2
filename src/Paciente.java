import java.util.Date;

public class Paciente extends Persona {
    private String codPaciente;
    private String numeroSeguridadSocial;
    public Paciente(String nombre, String primerApellido, String segundoApellido, int DNI){
        super(nombre, primerApellido, segundoApellido,DNI);
        this.setCodPaciente(getCodPaciente());
        this.setNumeroSeguridadSocial(getNumeroSeguridadSocial());
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
