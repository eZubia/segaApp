package uach.arquitectura.segaapp;

/**
 * Modelo Maestro para poder mndarlo a la base de datos y guardarlo.
 * @author  Daniela Santillanes Castro
 * @since 20/05/2015.
 * @version 1.0
 */
public class Maestro {

    int matriculaMaestro;
    String nombreMaestro;

    public Maestro(){
    }

    public int getMatriculaMaestro() {
        return matriculaMaestro;
    }

    public void setMatriculaMaestro(int matriculaMaestro) {
        this.matriculaMaestro = matriculaMaestro;
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    /**
     * Metoodo que nos retornara el nombre del maestro en String.
     * @param sql
     * @param matriculaMaestro
     * @return nombreMaestro
     */
    public String getNombreMaestro(String sql, Integer matriculaMaestro){
        return nombreMaestro;
    }
}
