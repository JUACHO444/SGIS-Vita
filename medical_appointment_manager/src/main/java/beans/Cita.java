package beans;

import java.sql.Date;
import java.sql.Time;

public class Cita {
    private int id_cita;
    private String username_paciente;
    private String username_medico;
    private Date fecha_cita;
    private Time hora_cita;
    private boolean asistencia;
    private String observaciones;
    private boolean reprogramada;
    private boolean pago_cuota;

    public Cita(int id_cita, String username_paciente, String username_medico, Date fecha_cita, Time hora_cita, boolean asistencia, String observaciones, boolean reprogramada, boolean pago_cuota) {
        this.id_cita = id_cita;
        this.username_paciente = username_paciente;
        this.username_medico = username_medico;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
        this.asistencia = asistencia;
        this.observaciones = observaciones;
        this.reprogramada = reprogramada;
        this.pago_cuota = pago_cuota;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
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

    public Time getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(Time hora_cita) {
        this.hora_cita = hora_cita;
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
        return "Cita{" + "id_cita=" + id_cita + ", username_paciente=" + username_paciente + ", username_medico=" + username_medico + ", fecha_cita=" + fecha_cita + ", hora_cita=" + hora_cita + ", asistencia=" + asistencia + ", observaciones=" + observaciones + ", reprogramada=" + reprogramada + ", pago_cuota=" + pago_cuota + '}';
    }

    

}
