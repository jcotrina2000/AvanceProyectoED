import java.time.LocalTime;

public class Horario {
    private int codigoMateria;
    private int numeroParalelo;
    private int dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Horario(int codigoMateria, int numeroParalelo, int dia, LocalTime horaInicio, LocalTime horaFin) {
        this.codigoMateria = codigoMateria;
        this.numeroParalelo = numeroParalelo;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public int getNumeroParalelo() {
        return numeroParalelo;
    }

    public void setNumeroParalelo(int numeroParalelo) {
        this.numeroParalelo = numeroParalelo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}
