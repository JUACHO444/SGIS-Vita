package beans;

import java.sql.Date;

public class Cita {

    private String username_paciente;
    private String username_medico;
    private Date fecha_cita;
    private boolean asistencia;
    private String observaciones;
    private boolean reprogramada;
    private boolean pago_cuota;

    public Cita(String username_paciente, String username_medico, Date fecha_cita, boolean asistencia, String observaciones, boolean reprogramada, boolean pago_cuota) {
        this.username_paciente = username_paciente;
        this.username_medico = username_medico;
        this.fecha_cita = fecha_cita;
        this.asistencia = asistencia;
        this.observaciones = observaciones;
        this.reprogramada = reprogramada;
        this.pago_cuota = pago_cuota;
    }

    public String getUsername_paciente() {
        return username_paciente;
    }

    public void setUsername_paciente(String username_paciente) {
        this.username_paciente = username_paciente;
    }

    public String getUsername_medico() {
        return username_medico;
    }

    public void setUsername_medico(String username_medico) {
        this.username_medico = username_medico;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isReprogramada() {
        return reprogramada;
    }

    public void setReprogramada(boolean reprogramada) {
        this.reprogramada = reprogramada;
    }

    public boolean isPago_cuota() {
        return pago_cuota;
    }

    public void setPago_cuota(boolean pago_cuota) {
        this.pago_cuota = pago_cuota;
    }

    @Override
    public String toString() {
        return "Cita{" + "username_paciente=" + username_paciente + ", username_medico=" + username_medico + ", fecha_cita=" + fecha_cita + ", asistencia=" + asistencia + ", observaciones=" + observaciones + ", reprogramada=" + reprogramada + ", pago_cuota=" + pago_cuota + '}';
    }

}
