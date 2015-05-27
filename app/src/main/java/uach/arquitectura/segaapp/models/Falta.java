package uach.arquitectura.segaapp.models;

import java.sql.ResultSet;

/**
 * Modelo Falta el cual permite agregar y guardar faltas del alumno en la base de datos.
 * @author Daniela Santillanes Castro
 * @since 20/05/2015.
 * @version 1.0
 */
public class Falta {

    private Integer id_falta;
    private Integer catidad;
    private Integer matricula;
    private Integer clave_materia;

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

    public Integer getId_falta() {
        return id_falta;
    }

    public void setId_falta(Integer id_falta) {
        this.id_falta = id_falta;
    }

    public Integer getCatidad() {
        return catidad;
    }

    public void setCatidad(Integer catidad) {
        this.catidad = catidad;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getClave_materia() {
        return clave_materia;
    }

    public void setClave_materia(Integer clave_materia) {
        this.clave_materia = clave_materia;
    }
}
