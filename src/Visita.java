import java.util.Date;

public class Visita {
    private String codVisita;
    private Date fechaHora;
    private Hospital hospital;
    private Servicio servicio;
    private Medico medico;
    private String diagnostico;
    private String tratamientos;
    private int numeroCama;
    private Date fechaSalida;
    private Historial historial;

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnostico, String tratamientos, int numeroCama, Date fechaSalida, Historial historial) {
        this.setCodVisita(codVisita);
        this.setFechaHora(fechaHora);
        this.setHospital(hospital);
        this.setServicio(servicio);
        this.setMedico(medico);
        this.setDiagnostico(diagnostico);
        this.setTratamientos(tratamientos);
        this.setNumeroCama(numeroCama);
        this.setFechaSalida(fechaSalida);
        this.setHistorial(historial);
    }

    public String getCodVisita() {
        return codVisita;
    }

    public void setCodVisita(String codVisita) {
        this.codVisita = codVisita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
