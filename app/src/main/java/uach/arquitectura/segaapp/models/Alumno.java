package uach.arquitectura.segaapp.models;

/**
 * Modelo Alumno el cual permite tener la estructura de un alumno basada en la base de datos.
 * @author Erik David Zubia Hernandez.
 * @since  19/05/2015.
 * @version 1.0.
 */
public class Alumno {

    private Integer matricula;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String password;


    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
