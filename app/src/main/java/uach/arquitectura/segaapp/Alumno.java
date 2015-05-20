package uach.arquitectura.segaapp;

/**
 * Modelo Alumno el cual permite tener la estructura de un alumno basada en la base de datos.
 * @author Erik David Zubia Hernandez.
 * @since  19/05/2015.
 * @version 1.0.
 */
public class Alumno {

    int matricula;
    String nombre;
    String apellidoP;
    String apellidoM;
    String carrera;
    String contrasena;

    public Alumno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
