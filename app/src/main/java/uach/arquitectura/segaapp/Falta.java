package uach.arquitectura.segaapp;

import java.sql.ResultSet;

/**
 * Modelo Falta el cual permite agregar y guardar faltas del alumno en la base de datos.
 * @author Daniela Santillanes Castro
 * @since 20/05/2015.
 * @version 1.0
 */
public class Falta {

    String claveMateria;
    int matriculaAlumno;
    int cantidadFaltas;

    public Falta(){
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

    public int getCantidadFaltas() {
        return cantidadFaltas;
    }

    public void setCantidadFaltas(int cantidadFaltas) {
        this.cantidadFaltas = cantidadFaltas;
    }

    /**
     * Metodo que retornara las faltas por alumno en un resultset.
     * @param sql
     * @param matricula que es la matricula del alumno.
     * @return rs que es un resultset.
     */
    public ResultSet getFaltasAlumno(String sql, Integer matricula){
        ResultSet rs = null;
        return rs;
    }
}
