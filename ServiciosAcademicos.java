public interface ServiciosAcademicos {
    public void matricularEstudiante(Estudiante estudiante);// Agrega un estudiante a la lista, si no está ya matriculado.
    public void agregarCurso(Curso curso);// Añade un nuevo curso a la lista, si no está ya creado.
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException;// Inscribir a un estudiante en un curso, lanzando EstudianteYaInscritoException si ya está inscrito.
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException;// Desinscribir a un estudiante de un curso, lanzando EstudianteNoInscritoEnCursoException si no está inscrito o el ID del curso no es válido.
}

