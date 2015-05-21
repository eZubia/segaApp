package uach.arquitectura.segaapp;

import java.sql.ResultSet;

/**
 * Modelo Calificacion para poder mandar las calificaciones a la base de datos y guardarlas.
 * @author Daniela Santillanes Castro
 * @since 20/05/2015.
 * @version 1.0
 */
public class Calificacion {

    String claveMateria;
    int matriculaAlumno;
    int numParcial;
    double calificacion;

    public Calificacion(){
    }

    public String getClaveMateria() {
        return claveMateria;
    }

    public void setClaveMateria(String claveMateria) {
        this.claveMateria = claveMateria;
    }

    public int getMatriculaAlumno() {
        return matriculaAlumno;
    }

    public void setMatriculaAlumno(int matriculaAlumno) {
        this.matriculaAlumno = matriculaAlumno;
    }

    public int getNumParcial() {
        return numParcial;
    }

    public void setNumParcial(int numParcial) {
        this.numParcial = numParcial;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Metodo que retornara las calificaciones del alumno en un resultset.
     * @param sql
     * @param matricula
     * @return rs que es el resultset.
     */
    public ResultSet getCalificacionAlumno(String sql, Integer matricula){
        ResultSet rs = null;
        return rs;
    }
}
