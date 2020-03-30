package Affiliation;

/**
 *
 * @author jse
 */
public class Afiliado {

    public String Nombre;
    public String Nacionalidad;
    public String Genero;
    public String TipId;
    public String NumIdentificacion;
    public int edad;
    public double cuenta;

    public Afiliado() {
    }

    public Afiliado(String Nombre,
            String Nacionalidad,
            String Genero,
            int edad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Genero = Genero;
        this.edad = edad;
    }

    /**
     *
     * @param TipId
     * El tipo de identificacion que presenta
     * 
     * @param NumIdentificacion
     * El numero de identificacion
     * (dui, pasaporte, carnet)
     */
    public void LLenarDatos(String TipId,String NumIdentificacion) {
        this.TipId = TipId;
        this.NumIdentificacion = NumIdentificacion;
    }

}
