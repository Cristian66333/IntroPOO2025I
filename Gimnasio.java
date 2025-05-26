import java.util.ArrayList;

public class Gimnasio {
    private ArrayList<Miembro> miembros;
    private Membresia[] membresias;
    private ArrayList<Entrenador> entrenadores;

    public Gimnasio() {
        this.miembros = new ArrayList<Miembro>();
        this.entrenadores = new ArrayList<Entrenador>();
        this.membresias = new Membresia[3];
        this.membresias[0] = new Membresia(80000, "345", "Membresia bronce basica", false, false);
        this.membresias[1] = new Membresia(120000, "234", "Membresia platino con algunos accesos", false, true);
        this.membresias[2] = new Membresia(200000, "123", "Membresia full oro con todos los accesos", true, true);
        this.entrenadores.add(new Entrenador("777", "Licenciado en edu fisica", 23, "Andres", "Perez", 1));
        this.entrenadores.add(new Entrenador("888", "Entrenador fisico", 32, "Pedro", "Garcia", 7));

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
                    + miembros.get(i).getEdad() + "\n";
        }
        return todosUsuarios;
    }

    public boolean eliminarUsuario(String cedulaEliminar) {
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getCedula().equals(cedulaEliminar)) {
                miembros.remove(i);
                return true;
            }
        }
        return false;
    }

    public String asignarEntrenador(String cedulaUsuario, byte seleccionEntrenador) {
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getCedula().equals(cedulaUsuario)) {
                miembros.get(i).setEntrenador(entrenadores.get(seleccionEntrenador - 1));
                return "El entrenador fue asignado a " + miembros.get(i).getNombre();
            }
        }
        return "Usuario no encontrado";
    }

    public double calcularMembresia(String cedula) {
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getCedula().equals(cedula)) {
                double precioMembresia = miembros.get(i).getMembresia().getPrecio();
                if (miembros.get(i).getEdad() > 60) {
                    precioMembresia = precioMembresia * 0.50;
                } else if (miembros.get(i).getEdad() >= 18 && miembros.get(i).getEdad() <= 60
                        && miembros.get(i).getMesesAntiguedad() >= 15) {
                    precioMembresia = precioMembresia - (precioMembresia * 0.15);
                } else if (miembros.get(i).getEdad() < 18 && (miembros.get(i).getMembresia().getId().equals("345")
                        || miembros.get(i).getMembresia().getId().equals("234"))) {
                    precioMembresia = precioMembresia * 0.70;
                }
                if (miembros.get(i).getEntrenador()!=null) {
                    precioMembresia = precioMembresia + 200000 + 20000*miembros.get(i).getEntrenador().getAniosExperiencia();
                }
                return precioMembresia;
            }
        }
        return -1;
    }

    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

}
