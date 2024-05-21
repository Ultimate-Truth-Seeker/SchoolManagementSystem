public class Persona {
    private String nombre;
    private String apellido;
    private int[] fechaDeNacimiento;
    
    public Persona(String nombre, String apellido, int[] fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int[] getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int[] fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
