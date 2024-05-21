
public class EstudianteNoInscritoEnCursoException extends Exception {
    public EstudianteNoInscritoEnCursoException(String message) {
        super("El estudiante no está inscrito en el curso");
    }
}
