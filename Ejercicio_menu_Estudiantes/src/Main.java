import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
    private static final Scanner sc = new Scanner(System.in);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        int opcion = 0; // Inicializar opción

        while (opcion != 4) {
            System.out.println("MENU DE SOLICITUDES");
            System.out.println("--------------------");
            System.out.println("1. Ingreso de estudiantes\n" +
                    "2. Consulta de especifica de estudiante\n" +
                    "3. Mostrar estudiantes en archivo de texto\n" +
                    "4. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de salto de línea

            switch (opcion) {
                case 1:
                    IngresarEstudiante();
                    break;
                case 2:
                    consultarEstudiantes();
                    break;
                case 3:
                    mostrarEstudiantes();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error, opción no válida.");
            }
        }
    }

    public static void IngresarEstudiante() {
        try {
            System.out.print("Cedula: ");
            String cedula = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
            Date fechaNacimiento = sdf.parse(sc.nextLine());
            System.out.print("Matricula: ");
            String matricula = sc.nextLine();
            System.out.print("Carrera: ");
            String carrera = sc.nextLine();

            estudiantes.add(new Estudiantes(cedula, nombre, apellido, fechaNacimiento, matricula, carrera));

            System.out.println("Estudiante ingresado exitosamente.");

        } catch (ParseException e) {
            System.out.println("Formato de Fecha Incorrecta.");
        }
    }

    public static void consultarEstudiantes() {
        System.out.println("Ingrese la cedula del estudiante: ");
        System.out.print(":");
        String cedula = sc.nextLine();
        boolean encontrado = false;

        for (Estudiantes estudiantes : estudiantes) {
            if (estudiantes.getCedula().equals(cedula)) {
                System.out.println(estudiantes);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public static void mostrarEstudiantes() {
        try(BufferedWriter br = new BufferedWriter(new FileWriter("estudiantes.txt"))){
            for (Estudiantes estudiante : estudiantes) {
                br.write(estudiante.toString());
                br.newLine();
                br.write("\n---------------------------\n");
            }
            System.out.println("Estudiante Guardado exitosamente.");
        }catch (Exception e) {
            System.out.println("Error al mostrar estudiantes.");
        }
    }
}

