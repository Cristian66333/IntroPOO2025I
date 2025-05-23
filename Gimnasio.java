import java.util.ArrayList;

public class Gimnasio {
    private ArrayList<Miembro> miembros;
    private Membresia[] membresias;
    private ArrayList<Entrenador> entrenadores;

    public Gimnasio() {
        this.miembros = new ArrayList<Miembro>();
        this.membresias = new Membresia[3];
        this.membresias[0] = new Membresia(80000, "345", "Membresia bronce basica", false, false);
        this.membresias[1] = new Membresia(120000, "234", "Membresia platino con algunos accesos", false, true);
        this.membresias[2] = new Membresia(200000, "123", "Membresia full oro con todos los accesos", true, true);
        this.entrenadores = new ArrayList<Entrenador>();
    }

    public String crearMiembro(String nombre, String apellido, String cedula, int edad, int mesesAntiguedad,
            byte numeroMembresia) {
        miembros.add(
                new Miembro(nombre, apellido, cedula, edad, mesesAntiguedad, this.membresias[numeroMembresia - 1]));
        return "Miembro agregado exitosamente";
    }

    public String mostrarMiembros() {
        String todosUsuarios = "";
        for (int i = 0; i < miembros.size(); i++) {
            todosUsuarios += miembros.get(i).getNombre() + " " + miembros.get(i).getApellido() + " edad: "
                    + miembros.get(i).getEdad()+"\n";
        }
        return todosUsuarios;
    }

    public boolean eliminarUsuario(String cedulaEliminar){
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getCedula().equals(cedulaEliminar)) {
                miembros.remove(i);
                return true;
            }
        }
        return false;
    } 
}
