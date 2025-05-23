public class Membresia {
    private double precio;
    private String id;
    private String descripcion;
    private boolean accesoSpa;
    private boolean accesoClasesCardio;
    public Membresia(double precio, String id, String descripcion, boolean accesoSpa, boolean accesoClasesCardio) {
        this.precio = precio;
        this.id = id;
        this.descripcion = descripcion;
        this.accesoSpa = accesoSpa;
        this.accesoClasesCardio = accesoClasesCardio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isAccesoSpa() {
        return accesoSpa;
    }
    public void setAccesoSpa(boolean accesoSpa) {
        this.accesoSpa = accesoSpa;
    }
    public boolean isAccesoClasesCardio() {
        return accesoClasesCardio;
    }
    public void setAccesoClasesCardio(boolean accesoClasesCardio) {
        this.accesoClasesCardio = accesoClasesCardio;
    }
    @Override
    public String toString() {
        return "Membresia [precio=" + precio + ", id=" + id + ", descripcion=" + descripcion + ", accesoSpa="
                + accesoSpa + ", accesoClasesCardio=" + accesoClasesCardio + "]";
    }
    
}
