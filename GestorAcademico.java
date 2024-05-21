import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicos {
    //atributos
    
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Curso, ArrayList<Estudiante>> asignaciones;

    //constructor
    public GestorAcademico(ArrayList<Estudiante> estudiantes, ArrayList<Curso> cursos,
            HashMap<Curso, ArrayList<Estudiante>> asignaciones) {
        this.estudiantes = estudiantes;
        this.cursos = cursos;
        this.asignaciones = asignaciones;
    }

    //getters y setters
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public HashMap<Curso, ArrayList<Estudiante>> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(HashMap<Curso, ArrayList<Estudiante>> asignaciones) {
        this.asignaciones = asignaciones;
    }

    //métodos de la interfaz
    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        asignaciones.put(curso, new ArrayList<>());
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        Curso curso = null;
        for (Curso c : cursos) {
            if (idCurso == c.getId()) {
                curso = c;
                break;
            }
        }
        if (asignaciones.get(curso).contains(estudiante)) {
            throw new EstudianteYaInscritoException("Error en la asignación: ");
        }
        asignaciones.get(curso).add(estudiante);
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        Curso curso = null;
        for (Curso c : cursos) {
            if (idCurso == c.getId()) {
                curso = c;
                break;
            }
        }
        for (Estudiante e: asignaciones.get(curso)) {
            if (idEstudiante == e.getId()) {
                asignaciones.get(curso).remove(e);
                return;
            }
        }
        throw new EstudianteNoInscritoEnCursoException("Error en la desasignación: ");
    }

    

}
