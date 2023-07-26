import java.time.LocalDate;
import java.util.List;

public class Clase {
    private int idUnico;
    private int idHorario;
    private LocalDate fecha;
    private List<Actividad> actividades;

    public Clase(int idUnico, int idHorario, LocalDate fecha, List<Actividad> actividades){
        this.idUnico = idUnico;
        this.idHorario = idHorario;
        this.fecha = fecha;
        this.actividades = actividades;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public void setCodigoMateria(int idUnico) {
        this.idUnico = idUnico;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void getIdUnico(int idHorario) {
        this.idHorario = idHorario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void getFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
}


