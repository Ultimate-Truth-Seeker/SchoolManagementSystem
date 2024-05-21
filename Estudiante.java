public class Estudiante extends Persona{

    //atributos
    private int id;
    private String estado;

    //constructor
    public Estudiante(int id, String nombre, String apellido, int[] fechaDeNacimiento, String estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    //getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}