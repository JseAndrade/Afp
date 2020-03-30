/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affiliation;

/**
 *
 * @author jse
 */
public class Independiente extends Afiliado {
    
    public double ingreso;
    public String Ocupacion;

    public Independiente() {
    }

    public Independiente(String Nombre, String Nacionalidad, String Genero, int edad) {
        
        super(Nombre, Nacionalidad, Genero, edad);
    }
    
    //El 8.10% de los ingresos queda en ahorros
    public double cotizar(double ingreso){
        return ingreso*0.0810;
    }
    
    /**
     *
     * @param Ocupacion
     * A que se dedica el trabajador
     * 
     * @param ingreso
     * Los ingresos que percibe
     */
    public void LLenarDatos(String Ocupacion,double ingreso) {
        this.ingreso = ingreso;
        this.Ocupacion = Ocupacion;
    }
}
