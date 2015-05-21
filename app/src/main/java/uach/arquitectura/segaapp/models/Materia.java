package uach.arquitectura.segaapp.models;

/**
 * Modelo Materia para poder mandar la materia a la base de datos y guardarla.
 * @author  Daniela Santillanes Castro
 * @since 20/05/2015.
 * @version 1.0
 */
public class Materia {

    String claveMateria;
    String nombreMateria;

    public Materia(){
    }

    public String getClaveMateria() {
        return claveMateria;
    }

    public void setClaveMateria(String claveMateria) {
        this.claveMateria = claveMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    /**
     * Metodo que retorna el nombre de la materia en string.
     * @param sql
     * @param claveMateria
     * @return nombreMateria
     */
    public String getNombreMateria(String sql,String claveMateria){
        return nombreMateria;
    }
}
