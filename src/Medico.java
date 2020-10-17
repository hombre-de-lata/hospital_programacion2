import java.util.Date;

public class Medico extends Persona {
    private String codMedico;
    private Servicio servicio;
    private Hospital hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, int DNI){
        super(nombre,primerApellido,segundoApellido,DNI);

        this.setCodMedico(getCodMedico());
        this.setServicio(getServicio());
        this.setHospital(getHospital());
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
