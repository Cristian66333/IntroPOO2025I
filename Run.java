import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gimnasio gimnasioUPTC = new Gimnasio();
        int opcion = 0;
        do {
            System.out.println("""
                    1. Crear miembro
                    2. Mostrar miembros
                    3. Eliminar miembro por cedula
                    4. Asignar entrenador
                    5. Calcular costo membresia
                    6. Salir
                    """);
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del usuario");
                    String nombreUsuario = sc.nextLine();
                    System.out.println("Ingrese el apellido");
                    String apellidoUsuario = sc.nextLine();
                    System.out.println("Ingrese la cedula");
                    String cedula = sc.nextLine();
                    System.out.println("Ingrese la edad");
                    int edadUsuario = sc.nextInt();
                    System.out.println("Ingrese los meses de antiguedad");
                    int mesesAntiguedadUsuario = sc.nextInt();
                    System.out.println("""
                            Ingrese la membresia que quiere
                            1. Bronce
                            2. Platinum
                            3. Gold
                            """);
                    byte membresiaUsuario = sc.nextByte();
                    System.out.println(gimnasioUPTC.crearMiembro(nombreUsuario, apellidoUsuario, cedula, edadUsuario,
                            mesesAntiguedadUsuario, membresiaUsuario));
                    break;
                case 2:
                    System.out.println(gimnasioUPTC.mostrarMiembros());
                    break;
                case 3:
                    System.out.println("Ingrese la cedula a eliminar");
                    String cedulaEliminar = sc.nextLine();
                    if (gimnasioUPTC.eliminarUsuario(cedulaEliminar)) {
                        System.out.println("El usuario se eliminó");
                    } else {
                        System.out.println("El usuario no fue encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la cedula del miembro\nque desea adquirir el servicio de entrnamiento");
                    String cedulaMiembroEntrenador = sc.nextLine();

                    for (int i = 0; i < gimnasioUPTC.getEntrenadores().size(); i++) {
                        System.out.println((i + 1) + ". " + gimnasioUPTC.getEntrenadores().get(i).toString());
                    }
                    System.out.println("Ingrese que entrenador quiere adquirir");
                    byte seleccionEntrenador = sc.nextByte();
                    gimnasioUPTC.asignarEntrenador(cedulaMiembroEntrenador, seleccionEntrenador);

                    break;
                case 5:
                    System.out.println("Ingrese la cedula del miembro");
                    String cedulaCalcularMembresia = sc.nextLine();
                    double resultadoPrecioMensual = gimnasioUPTC.calcularMembresia(cedulaCalcularMembresia);
                    if (resultadoPrecioMensual==-1) {
                        System.out.println("Miembro no encontrado");
                    }else{
                        System.out.println("El valor mensual de la membresia es " + resultadoPrecioMensual);
                    }
                    break;

                default:
                    break;
            }
        } while (opcion != 6);

    }
}