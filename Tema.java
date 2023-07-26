
public class Tema {
    private String tema;
    private String nombre;
    private int horasPresupuestadas;

    public Tema(String tema, String nombre, int horasPresupuestadas) {
        this.tema = tema;
        this.nombre = nombre;
        this.horasPresupuestadas = horasPresupuestadas;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasPresupuestadas() {
        return horasPresupuestadas;
    }

    public void setHorasPresupuestadas(int horasPresupuestadas) {
        this.horasPresupuestadas = horasPresupuestadas;
    }

}
