import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudiantes {

    // Declarando variables
    private String nombre;
    private String cedula;
    private String apellido;
    private String Nmatricula;
    private Date fechaNacimiento;
    private String carrera;

    // Constructor
    public Estudiantes(String cedula, String nombre, String apellido, Date fechaNacimiento, String Nmatricula, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.Nmatricula = Nmatricula;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    // Métodos
    public String getCedula() {
        return this.cedula;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Cedula:  %s\nNombres: %s\nApellidos: %s\nFecha de Nacimiento: %s\nNumero de Matricula: %s\nCarrera: %s\n",
                cedula, nombre, apellido, sdf.format(fechaNacimiento), Nmatricula, carrera);
    }
}
