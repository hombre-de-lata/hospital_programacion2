import java.util.Date;

public class Visita {
    String codVisita;
    Date fechaHora;
    Hospital hospital;
    Servicio servicio;
    Medico medico;
    String diagnostico;
    String tratamiento;
    int numeroCamas;
    Date fechaSalida;
    Historial historial;

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnostico, String tratamiento, int numeroCamas, Date fechaSalida, Historial historial) {
        this.codVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.servicio = servicio;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.numeroCamas = numeroCamas;
        this.fechaSalida = fechaSalida;
        this.historial = historial;
    }
}
