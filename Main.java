import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] fecha1 = {19, 4, 2004};
        int[] fecha2 = {19, 8, 2005};
        Estudiante estudiante1 = new Estudiante(23781, "Roberto", "Nájera", fecha1, "matriculado");
        Estudiante estudiante2 = new Estudiante(23859, "Carlos", "Coc", fecha2, "inactivo");
        Curso curso1 = new Curso(1234, "Pensamiento Cuantitativo", "Matemáticas básicas de la vida", 3, 3.0);
        Curso curso2 = new Curso(4321, "Algoritmos y programación Básica", "Bases de la programación y fundamentos de la informática", 3, 2.0);

        GestorAcademico gestorAcademico = new GestorAcademico(new ArrayList<>(), new ArrayList<>(), new HashMap<>());
        
        //Agreagar estudaintes
        gestorAcademico.matricularEstudiante(estudiante1);
        gestorAcademico.matricularEstudiante(estudiante2);

        //Añadir cursos
        gestorAcademico.agregarCurso(curso1);
        gestorAcademico.agregarCurso(curso2);

        //inscribir estudiante y probar error
        try {
            gestorAcademico.inscribirEstudianteCurso(estudiante1, 1234);
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            gestorAcademico.inscribirEstudianteCurso(estudiante1, 1234);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //desinscribir estudiante y probar error
        try {
            gestorAcademico.desinscribirEstudianteCurso(estudiante1.getId(), 1234);
            gestorAcademico.desinscribirEstudianteCurso(estudiante1.getId(), 1234);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
    
}
