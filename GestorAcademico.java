import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
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

    

}
