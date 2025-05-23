public class Entrenador {
    private String cedula;
    private String profesion;
    private int edad;
    private String nombre , apellido;
    private int aniosExperiencia;
    public Entrenador(String cedula, String profesion, int edad, String nombre, String apellido, int aniosExperiencia) {
        this.cedula = cedula;
        this.profesion = profesion;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public String toString() {
        return "Entrenador [cedula=" + cedula + ", profesion=" + profesion + ", edad=" + edad + ", nombre=" + nombre
                + ", apellido=" + apellido + ", aniosExperiencia=" + aniosExperiencia + "]";
    }
    

}
