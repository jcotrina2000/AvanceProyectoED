public class Materia {
    private int codigo;
    private String nombre;
    private int horasMaximas;

    //Constructor
    public Materia(int codigo, String nombre, int horasMaximas){
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasMaximas = horasMaximas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasMaximas() {
        return horasMaximas;
    }

    public void setHorasMaximas(int horasMaximas) {
        this.horasMaximas = horasMaximas;
    }
}
