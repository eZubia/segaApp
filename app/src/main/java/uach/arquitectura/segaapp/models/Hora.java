package uach.arquitectura.segaapp.models;

import java.sql.ResultSet;

/**
 * Modelo Hora para poder mandar la hora de la clase a la base de datos y guardarla.
 * @author Daniela Santillanes Castro
 * @since 20/05/2015.
 * @version 1.0
 */
public class Hora {

    String claveMateria;
    int matriculaMaestro;
    int salon;
    int hora;
    String dia;

    public Hora(){
    }

    public String getClaveMateria() {
        return claveMateria;
    }

    public void setClaveMateria(String claveMateria) {
        this.claveMateria = claveMateria;
    }

    public int getMatriculaMaestro() {
        return matriculaMaestro;
    }

    public void setMatriculaMaestro(int matriculaMaestro) {
        this.matriculaMaestro = matriculaMaestro;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Metodo que retornara el horario por alumno en un Resultset.
     * @param sql
     * @param matricula
     * @param dia
     * @return rs que es el resultset.
     */
    public ResultSet getHorarioAlumnoPorDia(String sql,Integer matricula, String dia){
        ResultSet rs =null;
        return rs;
    }
}
