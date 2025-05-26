public class Miembro {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private int mesesAntiguedad;
    private Membresia membresia;
    private Entrenador entrenador;
    public Miembro(String nombre, String apellido, String cedula, int edad, int mesesAntiguedad, Membresia membresia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.mesesAntiguedad = mesesAntiguedad;
        this.membresia = membresia;
        this.entrenador = null;
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
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMesesAntiguedad() {
        return mesesAntiguedad;
    }

    public void setMesesAntiguedad(int mesesAntiguedad) {
        this.mesesAntiguedad = mesesAntiguedad;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }


    public Entrenador getEntrenador() {
        return entrenador;
    }


    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }


    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad
                + ", mesesAntiguedad=" + mesesAntiguedad + ", membresia=" + membresia.toString() + ", entrenador=" + entrenador.toString()
                + "]";
    }
    

    
    
}
