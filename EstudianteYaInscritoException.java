
public class EstudianteYaInscritoException extends Exception {
    public EstudianteYaInscritoException(String message) {
        super("El estudiante ya está inscrito en el curso");
    }
}
