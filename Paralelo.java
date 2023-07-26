public class Paralelo {
    private int codigoMateria;
    private int numeroParalelo;
    private int cantidadEstudiantes;

    public Paralelo(int codigoMateria, int numeroParalelo, int cantidadEstudiantes){
        this.codigoMateria = codigoMateria;
        this.numeroParalelo = numeroParalelo;
        this.cantidadEstudiantes = cantidadEstudiantes;
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

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
}
