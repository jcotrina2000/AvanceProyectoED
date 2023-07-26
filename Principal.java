import java.io.IOException;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        String nombreArchivo = "materias.adm";
        List<Materia> materias = Materia.leerMateriasDesdeArchivo(nombreArchivo);

        for (Materia materia : materias) {
            System.out.println(materia);
        }
    }
}
