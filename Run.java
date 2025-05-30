import java.util.Scanner;

import javax.swing.JOptionPane;

public class Run {
    public static void main(String[] args) {
        Gimnasio gimnasioUPTC = new Gimnasio();
        int opcion = 0;
        try {
            int division = 1/0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se puede dividir entre 0");
        }
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    1. Crear miembro
                    2. Mostrar miembros
                    3. Eliminar miembro por cedula
                    4. Asignar entrenador
                    5. Calcular costo membresia
                    6. Salir
                    """));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Dato erroneo ingrese un numero");
            }
            
            
            switch (opcion) {
                case 1:
                    String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                    
                    String apellidoUsuario = JOptionPane.showInputDialog("Ingrese el apellido");
                    
                    String cedula = JOptionPane.showInputDialog("Ingrese la cedula");
                
                    int edadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    
                    int mesesAntiguedadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los meses de antiguedad"));
                    
                    byte membresiaUsuario = Byte.parseByte(JOptionPane.showInputDialog("""
                            Ingrese la membresia que quiere
                            1. Bronce
                            2. Platinum
                            3. Gold
                            """));
                    
                   JOptionPane.showMessageDialog(null, gimnasioUPTC.crearMiembro(nombreUsuario, apellidoUsuario, cedula, edadUsuario,
                            mesesAntiguedadUsuario, membresiaUsuario));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, gimnasioUPTC.mostrarMiembros());
                    break;
                case 3:
                    String cedulaEliminar = JOptionPane.showInputDialog("Ingrese la cedula a eliminar");
                    if (gimnasioUPTC.eliminarUsuario(cedulaEliminar)) {
                       JOptionPane.showMessageDialog(null,"El usuario se eliminó");
                    } else {
                        JOptionPane.showMessageDialog(null,"El usuario no fue encontrado");
                    }
                    break;
                case 4:
                    String cedulaMiembroEntrenador = JOptionPane.showInputDialog("Ingrese la cedula del miembro\nque desea adquirir el servicio de entrnamiento");
                    String entrenadores = "";
                    for (int i = 0; i < gimnasioUPTC.getEntrenadores().size(); i++) {
                       entrenadores+=(i + 1) + ". " + gimnasioUPTC.getEntrenadores().get(i).toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, entrenadores);
                    byte seleccionEntrenador = Byte.parseByte(JOptionPane.showInputDialog("Ingrese que entrenador quiere adquirir"));
                    
                    JOptionPane.showMessageDialog(null,gimnasioUPTC.asignarEntrenador(cedulaMiembroEntrenador, seleccionEntrenador));

                    break;
                case 5:
                    String cedulaCalcularMembresia = JOptionPane.showInputDialog("Ingrese la cedula del miembro");
                    double resultadoPrecioMensual = gimnasioUPTC.calcularMembresia(cedulaCalcularMembresia);
                    if (resultadoPrecioMensual==-1) {
                       JOptionPane.showMessageDialog(null,"Miembro no encontrado");
                    }else{
                        JOptionPane.showMessageDialog(null, "El valor mensual de la membresia es " + resultadoPrecioMensual);
                    }
                    break;

                default:
                    break;
            }
        } while (opcion != 6);

    }
}